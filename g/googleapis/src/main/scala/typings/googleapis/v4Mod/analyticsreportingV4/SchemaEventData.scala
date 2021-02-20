package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents all the details pertaining to an event.
  */
@js.native
trait SchemaEventData extends StObject {
  
  /**
    * Type of interaction with the object. Eg: &#39;play&#39;.
    */
  var eventAction: js.UndefOr[String] = js.native
  
  /**
    * The object on the page that was interacted with. Eg: &#39;Video&#39;.
    */
  var eventCategory: js.UndefOr[String] = js.native
  
  /**
    * Number of such events in this activity.
    */
  var eventCount: js.UndefOr[String] = js.native
  
  /**
    * Label attached with the event.
    */
  var eventLabel: js.UndefOr[String] = js.native
  
  /**
    * Numeric value associated with the event.
    */
  var eventValue: js.UndefOr[String] = js.native
}
object SchemaEventData {
  
  @scala.inline
  def apply(): SchemaEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventData]
  }
  
  @scala.inline
  implicit class SchemaEventDataMutableBuilder[Self <: SchemaEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
    
    @scala.inline
    def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
    
    @scala.inline
    def setEventCount(value: String): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    @scala.inline
    def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
    
    @scala.inline
    def setEventValue(value: String): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
  }
}
