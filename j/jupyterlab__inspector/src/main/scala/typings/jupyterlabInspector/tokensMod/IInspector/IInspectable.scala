package typings.jupyterlabInspector.tokensMod.IInspector

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of an inspectable source.
  */
@js.native
trait IInspectable extends js.Object {
  
  /**
    * A signal emitted when the inspector should clear all items.
    */
  var cleared: ISignal[_, Unit] = js.native
  
  /**
    * A signal emitted when the inspectable is disposed.
    */
  var disposed: ISignal[_, Unit] = js.native
  
  /**
    * A signal emitted when an inspector value is generated.
    */
  var inspected: ISignal[_, IInspectorUpdate] = js.native
  
  /**
    * Test whether the inspectable has been disposed.
    */
  var isDisposed: Boolean = js.native
  
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible. It can be modified by the consumer of the source.
    */
  var standby: Boolean = js.native
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
  
  @scala.inline
  implicit class IInspectableOps[Self <: IInspectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCleared(value: ISignal[_, Unit]): Self = this.set("cleared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposed(value: ISignal[_, Unit]): Self = this.set("disposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspected(value: ISignal[_, IInspectorUpdate]): Self = this.set("inspected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandby(value: Boolean): Self = this.set("standby", value.asInstanceOf[js.Any])
  }
}
