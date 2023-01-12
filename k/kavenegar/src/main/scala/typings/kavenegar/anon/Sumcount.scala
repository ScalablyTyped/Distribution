package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sumcount extends StObject {
  
  var cost: Double
  
  var enddate: Double
  
  var startdate: Double
  
  var sumcount: Double
  
  var sumpart: Double
}
object Sumcount {
  
  inline def apply(cost: Double, enddate: Double, startdate: Double, sumcount: Double, sumpart: Double): Sumcount = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], enddate = enddate.asInstanceOf[js.Any], startdate = startdate.asInstanceOf[js.Any], sumcount = sumcount.asInstanceOf[js.Any], sumpart = sumpart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sumcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sumcount] (val x: Self) extends AnyVal {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setEnddate(value: Double): Self = StObject.set(x, "enddate", value.asInstanceOf[js.Any])
    
    inline def setStartdate(value: Double): Self = StObject.set(x, "startdate", value.asInstanceOf[js.Any])
    
    inline def setSumcount(value: Double): Self = StObject.set(x, "sumcount", value.asInstanceOf[js.Any])
    
    inline def setSumpart(value: Double): Self = StObject.set(x, "sumpart", value.asInstanceOf[js.Any])
  }
}
