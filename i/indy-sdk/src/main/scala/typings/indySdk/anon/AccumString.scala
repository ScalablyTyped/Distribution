package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccumString extends StObject {
  
  var accum: String
}
object AccumString {
  
  inline def apply(accum: String): AccumString = {
    val __obj = js.Dynamic.literal(accum = accum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccumString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccumString] (val x: Self) extends AnyVal {
    
    inline def setAccum(value: String): Self = StObject.set(x, "accum", value.asInstanceOf[js.Any])
  }
}
