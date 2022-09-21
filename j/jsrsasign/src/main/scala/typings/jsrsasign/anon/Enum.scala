package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enum
  extends StObject
     with _ASN1HEXParseResult {
  
  var `enum`: Hex
}
object Enum {
  
  inline def apply(`enum`: Hex): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
  
  extension [Self <: Enum](x: Self) {
    
    inline def setEnum(value: Hex): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
  }
}
