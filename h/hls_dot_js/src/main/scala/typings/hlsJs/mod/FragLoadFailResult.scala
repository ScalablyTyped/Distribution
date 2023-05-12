package typings.hlsJs.mod

import typings.hlsJs.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragLoadFailResult
  extends StObject
     with ErrorData {
  
  @JSName("frag")
  var frag_FragLoadFailResult: Fragment
  
  var part: js.UndefOr[Part] = js.undefined
  
  @JSName("response")
  var response_FragLoadFailResult: js.UndefOr[Data] = js.undefined
}
object FragLoadFailResult {
  
  inline def apply(details: ErrorDetails, error: js.Error, fatal: Boolean, frag: Fragment, `type`: ErrorTypes): FragLoadFailResult = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragLoadFailResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragLoadFailResult] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setResponse(value: Data): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
