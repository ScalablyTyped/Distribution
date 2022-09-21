package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRegistrationsResponse extends StObject {
  
  /**
    * When present, there are more results to retrieve. Set `page_token` to this value on a subsequent call to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of `Registration`s.
    */
  var registrations: js.UndefOr[js.Array[SchemaRegistration]] = js.undefined
}
object SchemaListRegistrationsResponse {
  
  inline def apply(): SchemaListRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRegistrationsResponse]
  }
  
  extension [Self <: SchemaListRegistrationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRegistrations(value: js.Array[SchemaRegistration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsUndefined: Self = StObject.set(x, "registrations", js.undefined)
    
    inline def setRegistrationsVarargs(value: SchemaRegistration*): Self = StObject.set(x, "registrations", js.Array(value*))
  }
}
