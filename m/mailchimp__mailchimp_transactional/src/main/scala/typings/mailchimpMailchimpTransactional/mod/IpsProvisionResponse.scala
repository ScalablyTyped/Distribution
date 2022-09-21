package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsProvisionResponse extends StObject {
  
  /** the date and time that the request was created as a UTC timestamp in YYYY-MM-DD HH:MM:SS format */
  var requested_at: String
}
object IpsProvisionResponse {
  
  inline def apply(requested_at: String): IpsProvisionResponse = {
    val __obj = js.Dynamic.literal(requested_at = requested_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsProvisionResponse]
  }
  
  extension [Self <: IpsProvisionResponse](x: Self) {
    
    inline def setRequested_at(value: String): Self = StObject.set(x, "requested_at", value.asInstanceOf[js.Any])
  }
}
