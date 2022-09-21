package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2UserEventInlineSource extends StObject {
  
  /**
    * Required. A list of user events to import. Recommended max of 10k items.
    */
  var userEvents: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2UserEvent]] = js.undefined
}
object SchemaGoogleCloudRetailV2UserEventInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2UserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2UserEventInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2UserEventInlineSource](x: Self) {
    
    inline def setUserEvents(value: js.Array[SchemaGoogleCloudRetailV2UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: SchemaGoogleCloudRetailV2UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
