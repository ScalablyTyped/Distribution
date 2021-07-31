package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexParam extends StObject {
  
  var hex: String
}
object HexParam {
  
  @scala.inline
  def apply(hex: String): HexParam = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexParam]
  }
  
  @scala.inline
  implicit class HexParamMutableBuilder[Self <: HexParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
