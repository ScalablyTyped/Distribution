package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraHeaders extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object ExtraHeaders {
  
  inline def apply(): ExtraHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraHeaders]
  }
  
  extension [Self <: ExtraHeaders](x: Self) {
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
  }
}
