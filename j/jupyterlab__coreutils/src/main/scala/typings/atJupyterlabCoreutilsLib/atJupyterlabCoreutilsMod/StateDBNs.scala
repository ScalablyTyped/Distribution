package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "StateDB")
@js.native
object StateDBNs extends js.Object {
  /**
    * Retrieve all the saved bundles for a given namespace in local storage.
    *
    * @param prefix - The namespace to retrieve.
    *
    * @param mask - Optional mask function to transform each key retrieved.
    *
    * @returns A collection of data payloads for a given prefix.
    *
    * #### Notes
    * If there are any errors in retrieving the data, they will be logged to the
    * console in order to optimistically return any extant data without failing.
    */
  def fetchNamespace(namespace: java.lang.String): js.Array[atJupyterlabCoreutilsLib.libStatedbMod.IStateItem] = js.native
  def fetchNamespace(namespace: java.lang.String, mask: js.Function1[/* key */ java.lang.String, java.lang.String]): js.Array[atJupyterlabCoreutilsLib.libStatedbMod.IStateItem] = js.native
  /**
    * Return a serialized copy of a namespace's contents from local storage.
    *
    * @returns The namespace contents as JSON.
    */
  def toJSON(namespace: java.lang.String): atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  def toJSON(namespace: java.lang.String, mask: js.Function1[/* key */ java.lang.String, java.lang.String]): atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
}

