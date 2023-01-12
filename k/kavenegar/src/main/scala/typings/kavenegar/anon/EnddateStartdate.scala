package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnddateStartdate extends StObject {
  
  var enddate: Double
  
  var startdate: Double
  
  var sumcount: Double
}
object EnddateStartdate {
  
  inline def apply(enddate: Double, startdate: Double, sumcount: Double): EnddateStartdate = {
    val __obj = js.Dynamic.literal(enddate = enddate.asInstanceOf[js.Any], startdate = startdate.asInstanceOf[js.Any], sumcount = sumcount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnddateStartdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnddateStartdate] (val x: Self) extends AnyVal {
    
    inline def setEnddate(value: Double): Self = StObject.set(x, "enddate", value.asInstanceOf[js.Any])
    
    inline def setStartdate(value: Double): Self = StObject.set(x, "startdate", value.asInstanceOf[js.Any])
    
    inline def setSumcount(value: Double): Self = StObject.set(x, "sumcount", value.asInstanceOf[js.Any])
  }
}
