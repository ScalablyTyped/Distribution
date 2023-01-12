package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiredate extends StObject {
  
  var expiredate: Double
  
  var remaincredit: Double
  
  var `type`: String
}
object Expiredate {
  
  inline def apply(expiredate: Double, remaincredit: Double, `type`: String): Expiredate = {
    val __obj = js.Dynamic.literal(expiredate = expiredate.asInstanceOf[js.Any], remaincredit = remaincredit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiredate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expiredate] (val x: Self) extends AnyVal {
    
    inline def setExpiredate(value: Double): Self = StObject.set(x, "expiredate", value.asInstanceOf[js.Any])
    
    inline def setRemaincredit(value: Double): Self = StObject.set(x, "remaincredit", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
