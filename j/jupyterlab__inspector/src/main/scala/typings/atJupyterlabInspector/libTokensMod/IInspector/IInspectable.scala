package typings.atJupyterlabInspector.libTokensMod.IInspector

import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of an inspectable source.
  */
trait IInspectable extends js.Object {
  /**
    * A signal emitted when the inspector should clear all items.
    */
  var cleared: ISignal[_, Unit]
  /**
    * A signal emitted when the inspectable is disposed.
    */
  var disposed: ISignal[_, Unit]
  /**
    * A signal emitted when an inspector value is generated.
    */
  var inspected: ISignal[_, IInspectorUpdate]
  /**
    * Test whether the inspectable has been disposed.
    */
  var isDisposed: Boolean
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible. It can be modified by the consumer of the source.
    */
  var standby: Boolean
}

object IInspectable {
  @scala.inline
  def apply(
    cleared: ISignal[_, Unit],
    disposed: ISignal[_, Unit],
    inspected: ISignal[_, IInspectorUpdate],
    isDisposed: Boolean,
    standby: Boolean
  ): IInspectable = {
    val __obj = js.Dynamic.literal(cleared = cleared.asInstanceOf[js.Any], disposed = disposed.asInstanceOf[js.Any], inspected = inspected.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], standby = standby.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInspectable]
  }
}

