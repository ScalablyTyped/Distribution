package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  var date: js.UndefOr[Double] = js.undefined
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var localmessageids: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: String
  
  var receptor: String
  
  var sender: String
  
  var `type`: js.UndefOr[js.Array[Double]] = js.undefined
}
object Hide {
  
  inline def apply(message: String, receptor: String, sender: String): Hide = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], receptor = receptor.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLocalmessageids(value: js.Array[String]): Self = StObject.set(x, "localmessageids", value.asInstanceOf[js.Any])
    
    inline def setLocalmessageidsUndefined: Self = StObject.set(x, "localmessageids", js.undefined)
    
    inline def setLocalmessageidsVarargs(value: String*): Self = StObject.set(x, "localmessageids", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReceptor(value: String): Self = StObject.set(x, "receptor", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[Double]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: Double*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
