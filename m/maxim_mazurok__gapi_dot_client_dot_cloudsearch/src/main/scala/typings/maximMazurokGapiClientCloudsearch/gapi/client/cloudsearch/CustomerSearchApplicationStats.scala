package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerSearchApplicationStats extends StObject {
  
  /** The count of search applications for the date. */
  var count: js.UndefOr[String] = js.undefined
  
  /** The date for which search application stats were calculated. */
  var date: js.UndefOr[Date] = js.undefined
}
object CustomerSearchApplicationStats {
  
  inline def apply(): CustomerSearchApplicationStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerSearchApplicationStats]
  }
  
  extension [Self <: CustomerSearchApplicationStats](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
