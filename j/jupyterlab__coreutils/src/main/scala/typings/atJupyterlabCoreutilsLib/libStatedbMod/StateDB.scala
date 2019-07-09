package typings
package atJupyterlabCoreutilsLib.libStatedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/statedb", "StateDB")
@js.native
/**
  * Create a new state database.
  *
  * @param options - The instantiation options for a state database.
  */
class StateDB[T /* <: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue */] ()
  extends atJupyterlabCoreutilsLib.libTokensMod.IStateDB[T] {
  def this(options: atJupyterlabCoreutilsLib.libStatedbMod.StateDBNs.IOptions) = this()
  var _changed: js.Any = js.native
  /**
    * Clear the entire database.
    */
  var _clear: js.Any = js.native
  var _connector: js.Any = js.native
  /**
    * Fetch a value from the database.
    */
  var _fetch: js.Any = js.native
  /**
    * Fetch a list from the database.
    */
  var _list: js.Any = js.native
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
    */
  var _remove: js.Any = js.native
  /**
    * Save a key and its value in the database.
    */
  var _save: js.Any = js.native
  /**
    * A signal that emits the change type any time a value changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libStatedbMod.StateDBNs.Change] = js.native
  /**
    * Clear the entire database.
    */
  def clear(): js.Promise[scala.Unit] = js.native
  /**
    * Retrieve all the saved bundles for a namespace.
    *
    * @param filter - The namespace prefix to retrieve.
    *
    * @returns A promise that bears a collection of payloads for a namespace.
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
  def list(namespace: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.Anon_IdsValues[T]] = js.native
}

