package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Startdate extends StObject {
  
  var enddate: js.UndefOr[Double] = js.undefined
  
  var startdate: Double
  
  var status: js.UndefOr[Double] = js.undefined
}
object Startdate {
  
  inline def apply(startdate: Double): Startdate = {
    val __obj = js.Dynamic.literal(startdate = startdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Startdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Startdate] (val x: Self) extends AnyVal {
    
    inline def setEnddate(value: Double): Self = StObject.set(x, "enddate", value.asInstanceOf[js.Any])
    
    inline def setEnddateUndefined: Self = StObject.set(x, "enddate", js.undefined)
    
    inline def setStartdate(value: Double): Self = StObject.set(x, "startdate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
