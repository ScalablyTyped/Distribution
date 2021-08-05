package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents all the details pertaining to an event.
  */
trait SchemaEventData extends StObject {
  
  /**
    * Type of interaction with the object. Eg: &#39;play&#39;.
    */
  var eventAction: js.UndefOr[String] = js.undefined
  
  /**
    * The object on the page that was interacted with. Eg: &#39;Video&#39;.
    */
  var eventCategory: js.UndefOr[String] = js.undefined
  
  /**
    * Number of such events in this activity.
    */
  var eventCount: js.UndefOr[String] = js.undefined
  
  /**
    * Label attached with the event.
    */
  var eventLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Numeric value associated with the event.
    */
  var eventValue: js.UndefOr[String] = js.undefined
}
object SchemaEventData {
  
  inline def apply(): SchemaEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventData]
  }
  
  extension [Self <: SchemaEventData](x: Self) {
    
    inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
    
    inline def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
    
    inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
    
    inline def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
    
    inline def setEventCount(value: String): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
    
    inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
    
    inline def setEventValue(value: String): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
    
    inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
  }
}
