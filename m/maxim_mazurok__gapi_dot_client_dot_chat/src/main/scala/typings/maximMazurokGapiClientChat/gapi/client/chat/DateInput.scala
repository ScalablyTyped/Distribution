package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInput extends StObject {
  
  /** Time since epoch time, in milliseconds. */
  var msSinceEpoch: js.UndefOr[String] = js.undefined
}
object DateInput {
  
  inline def apply(): DateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInput]
  }
  
  extension [Self <: DateInput](x: Self) {
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
    
    inline def setMsSinceEpochUndefined: Self = StObject.set(x, "msSinceEpoch", js.undefined)
  }
}
