package typings.atJupyterlabObservables.libModeldbMod

import typings.atJupyterlabObservables.libModeldbMod.ModelDBNs.ICreateOptions
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atJupyterlabObservables.libUndoablelistMod.IObservableUndoableList
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/modeldb", "ModelDB")
@js.native
/**
  * Constructor for the `ModelDB`.
  */
class ModelDB () extends IModelDB {
  def this(options: ICreateOptions) = this()
  var _basePath: js.Any = js.native
  var _db: js.Any = js.native
  var _disposables: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Compute the fully resolved path for a path argument.
    */
  var _resolvePath: js.Any = js.native
  var _toDispose: js.Any = js.native
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  /* CompleteClass */
  override val basePath: String = js.native
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  /* CompleteClass */
  override val connected: js.Promise[Unit] = js.native
  /**
    * Whether the database is collaborative.
    */
  /* CompleteClass */
  override val isCollaborative: Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  /* CompleteClass */
  override val isPrepopulated: Boolean = js.native
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
  /* CompleteClass */
  override def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T] = js.native
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
  /* CompleteClass */
  override def createMap(path: String): IObservableJSON = js.native
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  /* CompleteClass */
  override def createString(path: String): IObservableString = js.native
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  /* CompleteClass */
  override def createValue(path: String): IObservableValue = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  /* CompleteClass */
  override def get(path: String): js.UndefOr[IObservable] = js.native
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  /* CompleteClass */
  override def getValue(path: String): js.UndefOr[JSONValue] = js.native
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  /* CompleteClass */
  override def has(path: String): Boolean = js.native
  /**
    * Set a value at a path. Not intended to
    * be called by user code, instead use the
    * `create*` factory methods.
    *
    * @param path: the path to set the value at.
    *
    * @param value: the value to set at the path.
    */
  def set(path: String, value: IObservable): Unit = js.native
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  /* CompleteClass */
  override def setValue(path: String, value: JSONValue): Unit = js.native
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  /* CompleteClass */
  override def view(basePath: String): IModelDB = js.native
}

