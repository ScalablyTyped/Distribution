package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDropbox extends StObject {
  
  var appKey: String
  
  var redirectURI: String
}
object ConfigDropbox {
  
  inline def apply(appKey: String, redirectURI: String): ConfigDropbox = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDropbox]
  }
  
  extension [Self <: ConfigDropbox](x: Self) {
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setRedirectURI(value: String): Self = StObject.set(x, "redirectURI", value.asInstanceOf[js.Any])
  }
}
