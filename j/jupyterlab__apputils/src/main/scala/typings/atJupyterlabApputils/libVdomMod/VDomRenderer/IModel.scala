package typings.atJupyterlabApputils.libVdomMod.VDomRenderer

import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a model to be used with vdom rendering.
  */
trait IModel extends IDisposable {
  /**
    * A signal emitted when any model state changes.
    */
  val stateChanged: ISignal[this.type, Unit]
}

object IModel {
  @scala.inline
  def apply(dispose: () => Unit, isDisposed: Boolean, stateChanged: ISignal[IModel, Unit]): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModel]
  }
}

