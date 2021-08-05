package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteInfo extends StObject {
  
  var totalSpecsDefined: Double
}
object SuiteInfo {
  
  inline def apply(totalSpecsDefined: Double): SuiteInfo = {
    val __obj = js.Dynamic.literal(totalSpecsDefined = totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteInfo]
  }
  
  extension [Self <: SuiteInfo](x: Self) {
    
    inline def setTotalSpecsDefined(value: Double): Self = StObject.set(x, "totalSpecsDefined", value.asInstanceOf[js.Any])
  }
}
