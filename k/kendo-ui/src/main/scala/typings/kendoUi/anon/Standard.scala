package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standard extends StObject {
  
  var standard: AM
}
object Standard {
  
  inline def apply(standard: AM): Standard = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  extension [Self <: Standard](x: Self) {
    
    inline def setStandard(value: AM): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
