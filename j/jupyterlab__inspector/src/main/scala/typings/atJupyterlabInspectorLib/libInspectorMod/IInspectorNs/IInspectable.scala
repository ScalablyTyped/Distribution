package typings
package atJupyterlabInspectorLib.libInspectorMod.IInspectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of an inspectable source.
  */
trait IInspectable extends js.Object {
  /**
    * A signal emitted when the handler is disposed.
    */
  var disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit]
  /**
    * A signal emitted when inspector should clear all items with no history.
    */
  var ephemeralCleared: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit]
  /**
    * A signal emitted when an inspector value is generated.
    */
  var inspected: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, IInspectorUpdate]
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible.
    */
  var standby: scala.Boolean
}

object IInspectable {
  @scala.inline
  def apply(
    disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit],
    ephemeralCleared: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, scala.Unit],
    inspected: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, IInspectorUpdate],
    standby: scala.Boolean
  ): IInspectable = {
    val __obj = js.Dynamic.literal(disposed = disposed, ephemeralCleared = ephemeralCleared, inspected = inspected, standby = standby)
  
    __obj.asInstanceOf[IInspectable]
  }
}

