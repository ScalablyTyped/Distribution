package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAppender
  extends StObject
     with /* key */ StringDictionary[js.Any]
     with Appender {
  
  var `type`: String | AppenderModule
}
object CustomAppender {
  
  inline def apply(`type`: String | AppenderModule): CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAppender]
  }
  
  extension [Self <: CustomAppender](x: Self) {
    
    inline def setType(value: String | AppenderModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
