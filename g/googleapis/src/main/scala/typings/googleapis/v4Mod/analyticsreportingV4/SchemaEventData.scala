package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventData extends StObject {
  
  /**
    * Type of interaction with the object. Eg: 'play'.
    */
  var eventAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object on the page that was interacted with. Eg: 'Video'.
    */
  var eventCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of such events in this activity.
    */
  var eventCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Label attached with the event.
    */
  var eventLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Numeric value associated with the event.
    */
  var eventValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventData {
  
  inline def apply(): SchemaEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventData]
  }
  
  extension [Self <: SchemaEventData](x: Self) {
    
    inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
    
    inline def setEventActionNull: Self = StObject.set(x, "eventAction", null)
    
    inline def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
    
    inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
    
    inline def setEventCategoryNull: Self = StObject.set(x, "eventCategory", null)
    
    inline def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
    
    inline def setEventCount(value: String): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setEventCountNull: Self = StObject.set(x, "eventCount", null)
    
    inline def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
    
    inline def setEventLabelNull: Self = StObject.set(x, "eventLabel", null)
    
    inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
    
    inline def setEventValue(value: String): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
    
    inline def setEventValueNull: Self = StObject.set(x, "eventValue", null)
    
    inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
  }
}
