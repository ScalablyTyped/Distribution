package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavbarOptions extends StObject {
  
  var iconpos: String
}
object NavbarOptions {
  
  @scala.inline
  def apply(iconpos: String): NavbarOptions = {
    val __obj = js.Dynamic.literal(iconpos = iconpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarOptions]
  }
  
  @scala.inline
  implicit class NavbarOptionsMutableBuilder[Self <: NavbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
  }
}
