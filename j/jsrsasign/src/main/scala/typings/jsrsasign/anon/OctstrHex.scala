package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OctstrHex
  extends StObject
     with _ASN1HEXParseResult {
  
  var octstr: Hex
}
object OctstrHex {
  
  inline def apply(octstr: Hex): OctstrHex = {
    val __obj = js.Dynamic.literal(octstr = octstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctstrHex]
  }
  
  extension [Self <: OctstrHex](x: Self) {
    
    inline def setOctstr(value: Hex): Self = StObject.set(x, "octstr", value.asInstanceOf[js.Any])
  }
}
