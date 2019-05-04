package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDB
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  val basePath: java.lang.String
  /**
    * A map of the currently active collaborators
    * for the database, including the local user.
    */
  val collaborators: js.UndefOr[ICollaboratorMap] = js.undefined
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  val connected: js.Promise[scala.Unit]
  /**
    * Whether the database is collaborative.
    */
  val isCollaborative: scala.Boolean
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  val isPrepopulated: scala.Boolean
  /**
    * Create an undoable list and insert it in the database.
    *
    * @param path: the path for the list.
    *
    * @returns the list that was created.
    *
    * #### Notes
    * The list can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createList[T /* <: atPhosphorCoreutilsLib.libJsonMod.JSONValue */](path: java.lang.String): atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[T]
  /**
    * Create a map and insert it in the database.
    *
    * @param path: the path for the map.
    *
    * @returns the map that was created.
    *
    * #### Notes
    * The map can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createMap(path: java.lang.String): atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  def createString(path: java.lang.String): atJupyterlabObservablesLib.libObservablestringMod.IObservableString
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  def createValue(path: java.lang.String): IObservableValue
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  def get(path: java.lang.String): js.UndefOr[IObservable]
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  def getValue(path: java.lang.String): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  def has(path: java.lang.String): scala.Boolean
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  def setValue(path: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): scala.Unit
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  def view(basePath: java.lang.String): IModelDB
}

object IModelDB {
  @scala.inline
  def apply(
    basePath: java.lang.String,
    connected: js.Promise[scala.Unit],
    createList: java.lang.String => atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[js.Any],
    createMap: java.lang.String => atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    createString: java.lang.String => atJupyterlabObservablesLib.libObservablestringMod.IObservableString,
    createValue: java.lang.String => IObservableValue,
    dispose: () => scala.Unit,
    get: java.lang.String => js.UndefOr[IObservable],
    getValue: java.lang.String => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    has: java.lang.String => scala.Boolean,
    isCollaborative: scala.Boolean,
    isDisposed: scala.Boolean,
    isPrepopulated: scala.Boolean,
    setValue: (java.lang.String, atPhosphorCoreutilsLib.libJsonMod.JSONValue) => scala.Unit,
    view: java.lang.String => IModelDB,
    collaborators: ICollaboratorMap = null
  ): IModelDB = {
    val __obj = js.Dynamic.literal(basePath = basePath, connected = connected, createList = js.Any.fromFunction1(createList), createMap = js.Any.fromFunction1(createMap), createString = js.Any.fromFunction1(createString), createValue = js.Any.fromFunction1(createValue), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction1(getValue), has = js.Any.fromFunction1(has), isCollaborative = isCollaborative, isDisposed = isDisposed, isPrepopulated = isPrepopulated, setValue = js.Any.fromFunction2(setValue), view = js.Any.fromFunction1(view))
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators)
    __obj.asInstanceOf[IModelDB]
  }
}

