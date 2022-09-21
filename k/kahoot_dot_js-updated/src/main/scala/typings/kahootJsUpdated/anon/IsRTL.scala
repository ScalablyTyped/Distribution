package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRTL extends StObject {
  
  var isRTL: Boolean
}
object IsRTL {
  
  inline def apply(isRTL: Boolean): IsRTL = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRTL]
  }
  
  extension [Self <: IsRTL](x: Self) {
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
  }
}
