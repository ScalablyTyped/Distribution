package typings
package atJupyterlabCoreutilsLib.libStatedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/statedb", "StateDB")
@js.native
class StateDB protected () extends IStateDB {
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  def this(options: atJupyterlabCoreutilsLib.libStatedbMod.StateDBNs.IOptions) = this()
  var _changed: js.Any = js.native
  /**
    * Clear the entire database.
    *
    * #### Notes
    * Unlike the public `clear` method, this method is synchronous.
    */
  var _clear: js.Any = js.native
  /**
    * Fetch a value from the database.
    *
    * #### Notes
    * Unlike the public `fetch` method, this method is synchronous.
    */
  var _fetch: js.Any = js.native
  /**
    * Merge data into the state database.
    */
  var _merge: js.Any = js.native
  /**
    * Overwrite the entire database with new contents.
    */
  var _overwrite: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Remove a key in the database.
    *
    * #### Notes
    * Unlike the public `remove` method, this method is synchronous.
    */
  var _remove: js.Any = js.native
  /**
    * Save a key and its value in the database.
    *
    * #### Notes
    * Unlike the public `save` method, this method is synchronous.
    */
  var _save: js.Any = js.native
  var _window: js.Any = js.native
  /**
    * A signal that emits the change type any time a value changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libStatedbMod.StateDBNs.Change] = js.native
  /**
    * The maximum allowed length of the data after it has been serialized.
    */
  /* CompleteClass */
  override val maxLength: scala.Double = js.native
  /**
    * The namespace prefix for all state database entries.
    *
    * #### Notes
    * This value should be set at instantiation and will only be used
    * internally by a state database. That means, for example, that an
    * app could have multiple, mutually exclusive state databases.
    */
  /* CompleteClass */
  override val namespace: java.lang.String = js.native
  /**
    * Clear the entire database.
    */
  def clear(): js.Promise[scala.Unit] = js.native
  def clear(silent: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Retrieve an item from the data connector.
    *
    * @param id - The identifier used to retrieve an item.
    *
    * @returns A promise that bears a data payload if available.
    *
    * #### Notes
    * The promise returned by this method may be rejected if an error occurs in
    * retrieving the data. Nonexistence of an `id` will succeed with `undefined`.
    */
  /* CompleteClass */
  override def fetch(id: java.lang.String): js.Promise[js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue]] = js.native
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
  /* CompleteClass */
  override def fetchNamespace(namespace: java.lang.String): js.Promise[js.Array[IStateItem]] = js.native
  /**
    * Remove a value using the data connector.
    *
    * @param id - The identifier for the data being removed.
    *
    * @returns A promise that is rejected if remove fails and succeeds otherwise.
    */
  /* CompleteClass */
  override def remove(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Save a value using the data connector.
    *
    * @param id - The identifier for the data being saved.
    *
    * @param value - The data being saved.
    *
    * @returns A promise that is rejected if saving fails and succeeds otherwise.
    */
  /* CompleteClass */
  override def save(id: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue): js.Promise[scala.Unit] = js.native
  /**
    * Return a serialized copy of the state database's entire contents.
    *
    * @returns A promise that bears the database contents as JSON.
    */
  /* CompleteClass */
  override def toJSON(): js.Promise[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.native
}

