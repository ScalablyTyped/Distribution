package typings
package atJupyterlabServicesLib.libContentsMod

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
class Drive ()
  extends atJupyterlabServicesLib.libContentsMod.ContentsNs.IDrive {
  def this(options: atJupyterlabServicesLib.libContentsMod.DriveNs.IOptions) = this()
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
  val fileChanged_Drive: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libContentsMod.ContentsNs.IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
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
  override def dispose(): scala.Unit = js.native
}

