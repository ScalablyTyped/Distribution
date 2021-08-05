package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hex extends StObject {
  
  var hex: String
}
object Hex {
  
  inline def apply(hex: String): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
  
  extension [Self <: Hex](x: Self) {
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
