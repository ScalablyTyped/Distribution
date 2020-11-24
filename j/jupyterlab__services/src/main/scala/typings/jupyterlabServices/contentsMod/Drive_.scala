package typings.jupyterlabServices.contentsMod

import typings.jupyterlabServices.contentsMod.Contents.IChangedArgs
import typings.jupyterlabServices.contentsMod.Contents.IDrive
import typings.jupyterlabServices.contentsMod.Drive.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/contents", "Drive")
@js.native
/**
  * Construct a new contents manager object.
  *
  * @param options - The options used to initialize the object.
  */
class Drive_ () extends IDrive {
  def this(options: IOptions) = this()
  
  var _apiEndpoint: js.Any = js.native
  
  var _fileChanged: js.Any = js.native
  
  /**
    * Get a REST url for a file given a path.
    */
  var _getUrl: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * A signal emitted when a file operation takes place.
    */
  @JSName("fileChanged")
  def fileChanged_MDrive_ : ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Test whether the manager has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MDrive_ : Boolean = js.native
}
