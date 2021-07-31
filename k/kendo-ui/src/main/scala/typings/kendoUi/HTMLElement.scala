package typings.kendoUi

import typings.kendoUi.kendo.data.BindingTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElement extends StObject {
  
  var kendoBindingTarget: BindingTarget
}
object HTMLElement {
  
  @scala.inline
  def apply(kendoBindingTarget: BindingTarget): HTMLElement = {
    val __obj = js.Dynamic.literal(kendoBindingTarget = kendoBindingTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit class HTMLElementMutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKendoBindingTarget(value: BindingTarget): Self = StObject.set(x, "kendoBindingTarget", value.asInstanceOf[js.Any])
  }
}
