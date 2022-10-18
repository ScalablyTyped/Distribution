package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectOptions
  extends StObject
     with ExtraHeaders {
  
  var reason_phrase: js.UndefOr[String] = js.undefined
  
  var status_code: js.UndefOr[Double] = js.undefined
}
object RejectOptions {
  
  inline def apply(): RejectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectOptions]
  }
  
  extension [Self <: RejectOptions](x: Self) {
    
    inline def setReason_phrase(value: String): Self = StObject.set(x, "reason_phrase", value.asInstanceOf[js.Any])
    
    inline def setReason_phraseUndefined: Self = StObject.set(x, "reason_phrase", js.undefined)
    
    inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
  }
}
