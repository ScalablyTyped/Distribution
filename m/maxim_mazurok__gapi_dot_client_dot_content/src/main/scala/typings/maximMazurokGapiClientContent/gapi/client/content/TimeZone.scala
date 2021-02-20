package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZone extends StObject {
  
  /** IANA Time Zone Database time zone, e.g. "America/New_York". */
  var id: js.UndefOr[String] = js.native
  
  /** Optional. IANA Time Zone Database version number, e.g. "2019a". */
  var version: js.UndefOr[String] = js.native
}
object TimeZone {
  
  @scala.inline
  def apply(): TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit class TimeZoneMutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
