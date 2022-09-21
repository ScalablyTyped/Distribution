package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaUserEventInlineSource extends StObject {
  
  /**
    * Required. A list of user events to import. Recommended max of 10k items.
    */
  var userEvents: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaUserEvent]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaUserEventInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaUserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaUserEventInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaUserEventInlineSource](x: Self) {
    
    inline def setUserEvents(value: js.Array[SchemaGoogleCloudRetailV2alphaUserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: SchemaGoogleCloudRetailV2alphaUserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
