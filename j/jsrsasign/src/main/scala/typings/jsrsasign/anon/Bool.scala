package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bool
  extends StObject
     with _ASN1HEXParseResult {
  
  var bool: Boolean
}
object Bool {
  
  inline def apply(bool: Boolean): Bool = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bool] (val x: Self) extends AnyVal {
    
    inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
  }
}
