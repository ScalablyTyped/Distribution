package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitParam extends StObject {
  
  var explicit: Boolean
}
object ExplicitParam {
  
  inline def apply(explicit: Boolean): ExplicitParam = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParam]
  }
  
  extension [Self <: ExplicitParam](x: Self) {
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
  }
}
