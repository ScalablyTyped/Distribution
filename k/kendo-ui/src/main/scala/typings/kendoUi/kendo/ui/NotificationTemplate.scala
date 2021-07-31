package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTemplate extends StObject {
  
  var template: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object NotificationTemplate {
  
  @scala.inline
  def apply(): NotificationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationTemplate]
  }
  
  @scala.inline
  implicit class NotificationTemplateMutableBuilder[Self <: NotificationTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
