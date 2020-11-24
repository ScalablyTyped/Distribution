package typings.jupyterlabApputils.vdomMod

import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typings.luminoSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomModel")
@js.native
class VDomModel () extends IModel {
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Test whether the model is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MVDomModel: Boolean = js.native
  
  /**
    * A signal emitted when any model state changes.
    */
  @JSName("stateChanged")
  val stateChanged_VDomModel: Signal[this.type, Unit] = js.native
}
