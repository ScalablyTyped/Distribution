package typings
package atJupyterlabCoreutilsLib.libStatedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateDB
  extends atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
      atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
      java.lang.String
    ] {
  /**
    * The maximum allowed length of the data after it has been serialized.
    */
  val maxLength: scala.Double
  /**
    * The namespace prefix for all state database entries.
    *
    * #### Notes
    * This value should be set at instantiation and will only be used
    * internally by a state database. That means, for example, that an
    * app could have multiple, mutually exclusive state databases.
    */
  val namespace: java.lang.String
  /**
    * Retrieve all the saved bundles for a namespace.
    *
    * @param namespace - The namespace to retrieve.
    *
    * @returns A promise that bears a collection data payloads for a namespace.
    *
    * #### Notes
    * Namespaces are entirely conventional entities. The `id` values of stored
    * items in the state database are formatted: `'namespace:identifier'`, which
    * is the same convention that command identifiers in JupyterLab use as well.
    *
    * If there are any errors in retrieving the data, they will be logged to the
    * console in order to optimistically return any extant data without failing.
    * This promise will always succeed.
    */
  def fetchNamespace(namespace: java.lang.String): js.Promise[js.Array[IStateItem]]
  /**
    * Return a serialized copy of the state database's entire contents.
    *
    * @returns A promise that bears the database contents as JSON.
    */
  def toJSON(): js.Promise[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject]
}

object IStateDB {
  @scala.inline
  def apply(
    fetch: java.lang.String => js.Promise[js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue]],
    fetchNamespace: java.lang.String => js.Promise[js.Array[IStateItem]],
    maxLength: scala.Double,
    namespace: java.lang.String,
    remove: java.lang.String => js.Promise[scala.Unit],
    save: (java.lang.String, atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue) => js.Promise[scala.Unit],
    toJSON: () => js.Promise[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject]
  ): IStateDB = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch), fetchNamespace = js.Any.fromFunction1(fetchNamespace), maxLength = maxLength, namespace = namespace, remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction2(save), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IStateDB]
  }
}

