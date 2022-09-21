package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enddate extends StObject {
  
  var enddate: js.UndefOr[Double] = js.undefined
  
  var sender: js.UndefOr[String] = js.undefined
  
  var startdate: Double
}
object Enddate {
  
  inline def apply(startdate: Double): Enddate = {
    val __obj = js.Dynamic.literal(startdate = startdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enddate]
  }
  
  extension [Self <: Enddate](x: Self) {
    
    inline def setEnddate(value: Double): Self = StObject.set(x, "enddate", value.asInstanceOf[js.Any])
    
    inline def setEnddateUndefined: Self = StObject.set(x, "enddate", js.undefined)
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setStartdate(value: Double): Self = StObject.set(x, "startdate", value.asInstanceOf[js.Any])
  }
}
