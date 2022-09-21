package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messageid extends StObject {
  
  var messageid: String | js.Array[Double]
}
object Messageid {
  
  inline def apply(messageid: String | js.Array[Double]): Messageid = {
    val __obj = js.Dynamic.literal(messageid = messageid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messageid]
  }
  
  extension [Self <: Messageid](x: Self) {
    
    inline def setMessageid(value: String | js.Array[Double]): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setMessageidVarargs(value: Double*): Self = StObject.set(x, "messageid", js.Array(value*))
  }
}
