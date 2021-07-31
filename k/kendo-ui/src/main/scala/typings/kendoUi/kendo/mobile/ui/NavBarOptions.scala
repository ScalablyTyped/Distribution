package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavBarOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object NavBarOptions {
  
  @scala.inline
  def apply(): NavBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavBarOptions]
  }
  
  @scala.inline
  implicit class NavBarOptionsMutableBuilder[Self <: NavBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
