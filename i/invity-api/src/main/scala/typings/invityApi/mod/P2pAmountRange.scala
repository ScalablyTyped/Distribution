package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pAmountRange extends StObject {
  
  var maximum: String
  
  var minimum: String
}
object P2pAmountRange {
  
  inline def apply(maximum: String, minimum: String): P2pAmountRange = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pAmountRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P2pAmountRange] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
