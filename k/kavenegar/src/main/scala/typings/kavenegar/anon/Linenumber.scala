package typings.kavenegar.anon

import typings.kavenegar.kavenegarNumbers.`0`
import typings.kavenegar.kavenegarNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linenumber extends StObject {
  
  var enddate: js.UndefOr[Double] = js.undefined
  
  var isread: js.UndefOr[`0` | `1`] = js.undefined
  
  var linenumber: js.UndefOr[String] = js.undefined
  
  var startdate: Double
}
object Linenumber {
  
  inline def apply(startdate: Double): Linenumber = {
    val __obj = js.Dynamic.literal(startdate = startdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linenumber]
  }
  
  extension [Self <: Linenumber](x: Self) {
    
    inline def setEnddate(value: Double): Self = StObject.set(x, "enddate", value.asInstanceOf[js.Any])
    
    inline def setEnddateUndefined: Self = StObject.set(x, "enddate", js.undefined)
    
    inline def setIsread(value: `0` | `1`): Self = StObject.set(x, "isread", value.asInstanceOf[js.Any])
    
    inline def setIsreadUndefined: Self = StObject.set(x, "isread", js.undefined)
    
    inline def setLinenumber(value: String): Self = StObject.set(x, "linenumber", value.asInstanceOf[js.Any])
    
    inline def setLinenumberUndefined: Self = StObject.set(x, "linenumber", js.undefined)
    
    inline def setStartdate(value: Double): Self = StObject.set(x, "startdate", value.asInstanceOf[js.Any])
  }
}
