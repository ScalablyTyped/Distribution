package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateDetails extends StObject {
  
  /** Whether the date column includes time. */
  var hasTime: js.UndefOr[Boolean] = js.undefined
}
object DateDetails {
  
  inline def apply(): DateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateDetails] (val x: Self) extends AnyVal {
    
    inline def setHasTime(value: Boolean): Self = StObject.set(x, "hasTime", value.asInstanceOf[js.Any])
    
    inline def setHasTimeUndefined: Self = StObject.set(x, "hasTime", js.undefined)
  }
}
