package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repeat extends StObject {
  
  var date: js.UndefOr[Double] = js.undefined
  
  var localid: js.UndefOr[String] = js.undefined
  
  var message: String
  
  var receptor: String
  
  var repeat: js.UndefOr[Double] = js.undefined
}
object Repeat {
  
  inline def apply(message: String, receptor: String): Repeat = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], receptor = receptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repeat]
  }
  
  extension [Self <: Repeat](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setLocalid(value: String): Self = StObject.set(x, "localid", value.asInstanceOf[js.Any])
    
    inline def setLocalidUndefined: Self = StObject.set(x, "localid", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReceptor(value: String): Self = StObject.set(x, "receptor", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
