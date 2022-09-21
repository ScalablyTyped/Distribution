package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEvent extends StObject {
  
  /**
    * Annotate a click event. This field is mutually exclusive with insertEvent and annotateImpressionEvent. This or insertEvent and annotateImpressionEvent is a required field.
    */
  var annotateClickEvent: js.UndefOr[SchemaCustomEventClickAnnotation] = js.undefined
  
  /**
    * Annotate an impression. This field is mutually exclusive with insertEvent and annotateClickEvent. This or insertEvent and annotateClickEvent is a required field.
    */
  var annotateImpressionEvent: js.UndefOr[SchemaCustomEventImpressionAnnotation] = js.undefined
  
  /**
    * Custom variables associated with the event.
    */
  var customVariables: js.UndefOr[js.Array[SchemaCustomVariable]] = js.undefined
  
  /**
    * The type of event. If INSERT, the fields in insertEvent need to be populated. If ANNOTATE, the fields in either annotateClickEvent or annotateImpressionEvent need to be populated.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floodlight configuration ID of the advertiser the event is linked to. This is a required field.
    */
  var floodlightConfigurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Insert custom event. This field is mutually exclusive with annotateClickEvent and annotateImpressionEvent. This or annotateClickEvent and annotateImpressionEvent is a required field.
    */
  var insertEvent: js.UndefOr[SchemaCustomEventInsert] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEvent".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ordinal of this custom event. This is a required field.
    */
  var ordinal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of this custom event, in Unix epoch micros. This is a required field.
    */
  var timestampMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEvent {
  
  inline def apply(): SchemaCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEvent]
  }
  
  extension [Self <: SchemaCustomEvent](x: Self) {
    
    inline def setAnnotateClickEvent(value: SchemaCustomEventClickAnnotation): Self = StObject.set(x, "annotateClickEvent", value.asInstanceOf[js.Any])
    
    inline def setAnnotateClickEventUndefined: Self = StObject.set(x, "annotateClickEvent", js.undefined)
    
    inline def setAnnotateImpressionEvent(value: SchemaCustomEventImpressionAnnotation): Self = StObject.set(x, "annotateImpressionEvent", value.asInstanceOf[js.Any])
    
    inline def setAnnotateImpressionEventUndefined: Self = StObject.set(x, "annotateImpressionEvent", js.undefined)
    
    inline def setCustomVariables(value: js.Array[SchemaCustomVariable]): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    inline def setCustomVariablesVarargs(value: SchemaCustomVariable*): Self = StObject.set(x, "customVariables", js.Array(value*))
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdNull: Self = StObject.set(x, "floodlightConfigurationId", null)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setInsertEvent(value: SchemaCustomEventInsert): Self = StObject.set(x, "insertEvent", value.asInstanceOf[js.Any])
    
    inline def setInsertEventUndefined: Self = StObject.set(x, "insertEvent", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrdinal(value: String): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalNull: Self = StObject.set(x, "ordinal", null)
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setTimestampMicros(value: String): Self = StObject.set(x, "timestampMicros", value.asInstanceOf[js.Any])
    
    inline def setTimestampMicrosNull: Self = StObject.set(x, "timestampMicros", null)
    
    inline def setTimestampMicrosUndefined: Self = StObject.set(x, "timestampMicros", js.undefined)
  }
}
