package typings.jupyterlabTooltip.tokensMod

import typings.jupyterlabTooltip.tokensMod.ITooltipManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipManager_ extends js.Object {
  
  /**
    * Invoke a tooltip.
    */
  def invoke(options: IOptions): Unit = js.native
}
object ITooltipManager_ {
  
  @scala.inline
  def apply(invoke: IOptions => Unit): ITooltipManager_ = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
    __obj.asInstanceOf[ITooltipManager_]
  }
  
  @scala.inline
  implicit class ITooltipManager_Ops[Self <: ITooltipManager_] (val x: Self) extends AnyVal {
    
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
    def setInvoke(value: IOptions => Unit): Self = this.set("invoke", js.Any.fromFunction1(value))
  }
}
