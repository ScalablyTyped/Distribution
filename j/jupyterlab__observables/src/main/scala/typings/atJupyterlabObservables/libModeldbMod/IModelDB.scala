package typings.atJupyterlabObservables.libModeldbMod

import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atJupyterlabObservables.libUndoablelistMod.IObservableUndoableList
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDB extends IDisposable {
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  val basePath: String
  /**
    * A map of the currently active collaborators
    * for the database, including the local user.
    */
  val collaborators: js.UndefOr[ICollaboratorMap] = js.undefined
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  val connected: js.Promise[Unit]
  /**
    * Whether the database is collaborative.
    */
  val isCollaborative: Boolean
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  val isPrepopulated: Boolean
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
  def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T]
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
  def createMap(path: String): IObservableJSON
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  def createString(path: String): IObservableString
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  def createValue(path: String): IObservableValue
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  def get(path: String): js.UndefOr[IObservable]
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  def getValue(path: String): js.UndefOr[JSONValue]
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  def has(path: String): Boolean
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  def setValue(path: String, value: JSONValue): Unit
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  def view(basePath: String): IModelDB
}

object IModelDB {
  @scala.inline
  def apply(
    basePath: String,
    connected: js.Promise[Unit],
    createList: String => IObservableUndoableList[js.Any],
    createMap: String => IObservableJSON,
    createString: String => IObservableString,
    createValue: String => IObservableValue,
    dispose: () => Unit,
    get: String => js.UndefOr[IObservable],
    getValue: String => js.UndefOr[JSONValue],
    has: String => Boolean,
    isCollaborative: Boolean,
    isDisposed: Boolean,
    isPrepopulated: Boolean,
    setValue: (String, JSONValue) => Unit,
    view: String => IModelDB,
    collaborators: ICollaboratorMap = null
  ): IModelDB = {
    val __obj = js.Dynamic.literal(basePath = basePath, connected = connected, createList = js.Any.fromFunction1(createList), createMap = js.Any.fromFunction1(createMap), createString = js.Any.fromFunction1(createString), createValue = js.Any.fromFunction1(createValue), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction1(getValue), has = js.Any.fromFunction1(has), isCollaborative = isCollaborative, isDisposed = isDisposed, isPrepopulated = isPrepopulated, setValue = js.Any.fromFunction2(setValue), view = js.Any.fromFunction1(view))
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators)
    __obj.asInstanceOf[IModelDB]
  }
}

