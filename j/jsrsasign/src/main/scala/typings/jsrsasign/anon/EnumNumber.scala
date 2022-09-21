package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumNumber
  extends StObject
     with _ASN1HEXParseResult {
  
  var `enum`: Double
}
object EnumNumber {
  
  inline def apply(`enum`: Double): EnumNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumber]
  }
  
  extension [Self <: EnumNumber](x: Self) {
    
    inline def setEnum(value: Double): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
  }
}
