package typings
package atJupyterlabApputilsLib.libVdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomModel")
@js.native
class VDomModel ()
  extends atJupyterlabApputilsLib.libVdomMod.VDomRendererNs.IModel {
  var _isDisposed: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * A signal emitted when any model state changes.
    */
  /* CompleteClass */
  override val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * A signal emitted when any model state changes.
    */
  @JSName("stateChanged")
  val stateChanged_VDomModel: atPhosphorSignalingLib.atPhosphorSignalingMod.Signal[this.type, scala.Unit] = js.native
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

