package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavbarOptions extends StObject {
  
  var iconpos: String
}
object NavbarOptions {
  
  inline def apply(iconpos: String): NavbarOptions = {
    val __obj = js.Dynamic.literal(iconpos = iconpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarOptions]
  }
  
  extension [Self <: NavbarOptions](x: Self) {
    
    inline def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
  }
}
