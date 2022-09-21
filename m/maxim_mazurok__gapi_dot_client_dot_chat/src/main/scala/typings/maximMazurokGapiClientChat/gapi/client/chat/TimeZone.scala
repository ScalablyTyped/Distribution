package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  /** The [IANA TZ](https://www.iana.org/time-zones) time zone database code, such as "America/Toronto". */
  var id: js.UndefOr[String] = js.undefined
  
  /** The user timezone offset, in milliseconds, from Coordinated Universal Time (UTC). */
  var offset: js.UndefOr[Double] = js.undefined
}
object TimeZone {
  
  inline def apply(): TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZone]
  }
  
  extension [Self <: TimeZone](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
