package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaUserEventInlineSource extends StObject {
  
  /**
    * Required. A list of user events to import. Recommended max of 10k items.
    */
  var userEvents: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaUserEvent]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaUserEventInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaUserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaUserEventInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaUserEventInlineSource](x: Self) {
    
    inline def setUserEvents(value: js.Array[SchemaGoogleCloudRetailV2betaUserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: SchemaGoogleCloudRetailV2betaUserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
