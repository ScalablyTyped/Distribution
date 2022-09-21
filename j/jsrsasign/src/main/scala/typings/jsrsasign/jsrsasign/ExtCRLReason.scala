package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.cRLReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtCRLReason
  extends StObject
     with ExtParam {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: cRLReason
}
object ExtCRLReason {
  
  inline def apply(): ExtCRLReason = {
    val __obj = js.Dynamic.literal(extname = "cRLReason")
    __obj.asInstanceOf[ExtCRLReason]
  }
  
  extension [Self <: ExtCRLReason](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: cRLReason): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
