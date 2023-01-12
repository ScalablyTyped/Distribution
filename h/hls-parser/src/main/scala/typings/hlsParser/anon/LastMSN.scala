package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastMSN extends StObject {
  
  var lastMSN: js.UndefOr[Double] = js.undefined
  
  var lastPart: js.UndefOr[Double] = js.undefined
  
  var uri: String
}
object LastMSN {
  
  inline def apply(uri: String): LastMSN = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastMSN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastMSN] (val x: Self) extends AnyVal {
    
    inline def setLastMSN(value: Double): Self = StObject.set(x, "lastMSN", value.asInstanceOf[js.Any])
    
    inline def setLastMSNUndefined: Self = StObject.set(x, "lastMSN", js.undefined)
    
    inline def setLastPart(value: Double): Self = StObject.set(x, "lastPart", value.asInstanceOf[js.Any])
    
    inline def setLastPartUndefined: Self = StObject.set(x, "lastPart", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
