package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fast extends StObject {
  
  var fast: Double
  
  var slow: Double
}
object Fast {
  
  inline def apply(fast: Double, slow: Double): Fast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fast]
  }
  
  extension [Self <: Fast](x: Self) {
    
    inline def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
    
    inline def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
  }
}
