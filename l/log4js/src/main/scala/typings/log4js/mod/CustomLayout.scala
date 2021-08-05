package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayout
  extends StObject
     with /* key */ StringDictionary[js.Any]
     with Layout {
  
  var `type`: String
}
object CustomLayout {
  
  inline def apply(`type`: String): CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayout]
  }
  
  extension [Self <: CustomLayout](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
