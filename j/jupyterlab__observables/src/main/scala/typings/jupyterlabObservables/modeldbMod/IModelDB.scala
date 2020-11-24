package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDB extends IDisposable {
  
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  val basePath: String = js.native
  
  /**
    * A map of the currently active collaborators
    * for the database, including the local user.
    */
  val collaborators: js.UndefOr[ICollaboratorMap] = js.native
  
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  val connected: js.Promise[Unit] = js.native
  
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
  def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T] = js.native
  
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
  def createMap(path: String): IObservableJSON = js.native
  
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  def createString(path: String): IObservableString = js.native
  
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  def createValue(path: String): IObservableValue = js.native
  
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  def get(path: String): js.UndefOr[IObservable] = js.native
  
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  def getValue(path: String): js.UndefOr[JSONValue] = js.native
  
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  def has(path: String): Boolean = js.native
  
  /**
    * Whether the database is collaborative.
    */
  val isCollaborative: Boolean = js.native
  
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  val isPrepopulated: Boolean = js.native
  
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  def setValue(path: String, value: JSONValue): Unit = js.native
  
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  def view(basePath: String): IModelDB = js.native
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
    view: String => IModelDB
  ): IModelDB = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], createList = js.Any.fromFunction1(createList), createMap = js.Any.fromFunction1(createMap), createString = js.Any.fromFunction1(createString), createValue = js.Any.fromFunction1(createValue), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction1(getValue), has = js.Any.fromFunction1(has), isCollaborative = isCollaborative.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isPrepopulated = isPrepopulated.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[IModelDB]
  }
  
  @scala.inline
  implicit class IModelDBOps[Self <: IModelDB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected(value: js.Promise[Unit]): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateList(value: String => IObservableUndoableList[js.Any]): Self = this.set("createList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMap(value: String => IObservableJSON): Self = this.set("createMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateString(value: String => IObservableString): Self = this.set("createString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateValue(value: String => IObservableValue): Self = this.set("createValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[IObservable]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: String => js.UndefOr[JSONValue]): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCollaborative(value: Boolean): Self = this.set("isCollaborative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrepopulated(value: Boolean): Self = this.set("isPrepopulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: (String, JSONValue) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setView(value: String => IModelDB): Self = this.set("view", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollaborators(value: ICollaboratorMap): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollaborators: Self = this.set("collaborators", js.undefined)
  }
}
