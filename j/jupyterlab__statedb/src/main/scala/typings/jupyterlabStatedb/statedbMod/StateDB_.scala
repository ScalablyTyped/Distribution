package typings.jupyterlabStatedb.statedbMod

import typings.jupyterlabStatedb.statedbMod.StateDB.Change
import typings.jupyterlabStatedb.statedbMod.StateDB.IOptions
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statedb/lib/statedb", "StateDB")
@js.native
/**
  * Create a new state database.
  *
  * @param options - The instantiation options for a state database.
  */
class StateDB_[T /* <: ReadonlyPartialJSONValue */] () extends IStateDB[T] {
  def this(options: IOptions[T]) = this()
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
  def changed(): ISignal[this.type, Change] = js.native
  /**
    * Clear the entire database.
    */
  def clear(): js.Promise[Unit] = js.native
}

