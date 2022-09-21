package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Octstr
  extends StObject
     with _ASN1HEXParseResult {
  
  var octstr: Obj
}
object Octstr {
  
  inline def apply(octstr: Obj): Octstr = {
    val __obj = js.Dynamic.literal(octstr = octstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Octstr]
  }
  
  extension [Self <: Octstr](x: Self) {
    
    inline def setOctstr(value: Obj): Self = StObject.set(x, "octstr", value.asInstanceOf[js.Any])
  }
}
