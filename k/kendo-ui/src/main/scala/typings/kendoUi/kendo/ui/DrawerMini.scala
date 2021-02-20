package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerMini extends StObject {
  
  var template: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DrawerMini {
  
  @scala.inline
  def apply(): DrawerMini = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerMini]
  }
  
  @scala.inline
  implicit class DrawerMiniMutableBuilder[Self <: DrawerMini] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
