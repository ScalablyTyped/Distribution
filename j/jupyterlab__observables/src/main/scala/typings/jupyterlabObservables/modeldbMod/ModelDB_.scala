package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.modeldbMod.ModelDB.ICreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables/lib/modeldb", "ModelDB")
@js.native
/**
  * Constructor for the `ModelDB`.
  */
class ModelDB_ () extends IModelDB {
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
    * The base path for the `ModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  @JSName("basePath")
  def basePath_MModelDB_ : String = js.native
  
  /**
    * Whether the database is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MModelDB_ : Boolean = js.native
  
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
}
