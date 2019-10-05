package typings.atJupyterlabServices.libContentsMod

import typings.atJupyterlabServices.libContentsMod.Contents.IChangedArgs
import typings.atJupyterlabServices.libContentsMod.Contents.IDrive
import typings.atJupyterlabServices.libContentsMod.Drive.IOptions
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val fileChanged_Drive_ : ISignal[this.type, IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
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
}

