package typings
package atJupyterlabApputilsLib.libVdomMod.VDomRendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a model to be used with vdom rendering.
  */
trait IModel
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when any model state changes.
    */
  val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
}

object IModel {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    isDisposed: scala.Boolean,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IModel, scala.Unit]
  ): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed, stateChanged = stateChanged)
  
    __obj.asInstanceOf[IModel]
  }
}

