package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  /** The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in PST. */
  var date: js.UndefOr[String] = js.undefined
  
  /** The filtering reasons. */
  var reasons: js.UndefOr[js.Array[FilteringCount]] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setReasons(value: js.Array[FilteringCount]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: FilteringCount*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
