package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeInput extends StObject {
  
  /** Whether the `datetime` input includes a calendar date. */
  var hasDate: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the `datetime` input includes a timestamp. */
  var hasTime: js.UndefOr[Boolean] = js.undefined
  
  /** Time since epoch time, in milliseconds. */
  var msSinceEpoch: js.UndefOr[String] = js.undefined
}
object DateTimeInput {
  
  inline def apply(): DateTimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeInput] (val x: Self) extends AnyVal {
    
    inline def setHasDate(value: Boolean): Self = StObject.set(x, "hasDate", value.asInstanceOf[js.Any])
    
    inline def setHasDateUndefined: Self = StObject.set(x, "hasDate", js.undefined)
    
    inline def setHasTime(value: Boolean): Self = StObject.set(x, "hasTime", value.asInstanceOf[js.Any])
    
    inline def setHasTimeUndefined: Self = StObject.set(x, "hasTime", js.undefined)
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
    
    inline def setMsSinceEpochUndefined: Self = StObject.set(x, "msSinceEpoch", js.undefined)
  }
}
