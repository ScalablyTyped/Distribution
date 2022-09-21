package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.adobeTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtAdobeTimeStamp
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: adobeTimeStamp
  
  var reqauth: js.UndefOr[Boolean] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object ExtAdobeTimeStamp {
  
  inline def apply(): ExtAdobeTimeStamp = {
    val __obj = js.Dynamic.literal(extname = "adobeTimeStamp")
    __obj.asInstanceOf[ExtAdobeTimeStamp]
  }
  
  extension [Self <: ExtAdobeTimeStamp](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: adobeTimeStamp): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setReqauth(value: Boolean): Self = StObject.set(x, "reqauth", value.asInstanceOf[js.Any])
    
    inline def setReqauthUndefined: Self = StObject.set(x, "reqauth", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
