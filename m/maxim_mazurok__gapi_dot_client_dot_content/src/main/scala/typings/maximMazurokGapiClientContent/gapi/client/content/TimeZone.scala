package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  /** IANA Time Zone Database time zone, e.g. "America/New_York". */
  var id: js.UndefOr[String] = js.undefined
  
  /** Optional. IANA Time Zone Database version number, e.g. "2019a". */
  var version: js.UndefOr[String] = js.undefined
}
object TimeZone {
  
  inline def apply(): TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZone]
  }
  
  extension [Self <: TimeZone](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
