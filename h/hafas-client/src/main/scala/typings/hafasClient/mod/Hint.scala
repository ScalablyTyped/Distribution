package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.`foreign-id`
import typings.hafasClient.hafasClientStrings.`local-fare-zone`
import typings.hafasClient.hafasClientStrings.`stop-dhid`
import typings.hafasClient.hafasClientStrings.`stop-website`
import typings.hafasClient.hafasClientStrings.`transit-authority`
import typings.hafasClient.hafasClientStrings.hint
import typings.hafasClient.hafasClientStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hint extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var tripId: js.UndefOr[String] = js.undefined
  
  var `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
}
object Hint {
  
  inline def apply(
    text: String,
    `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
  ): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
    
    inline def setType(
      value: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
