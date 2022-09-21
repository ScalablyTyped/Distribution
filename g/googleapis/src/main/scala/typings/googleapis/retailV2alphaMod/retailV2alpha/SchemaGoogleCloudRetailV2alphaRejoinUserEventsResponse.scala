package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRejoinUserEventsResponse extends StObject {
  
  /**
    * Number of user events that were joined with latest product catalog.
    */
  var rejoinedUserEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRejoinUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRejoinUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRejoinUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRejoinUserEventsResponse](x: Self) {
    
    inline def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    inline def setRejoinedUserEventsCountNull: Self = StObject.set(x, "rejoinedUserEventsCount", null)
    
    inline def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
