package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEvent extends js.Object {
  
  /** Annotate a click event. This field is mutually exclusive with insertEvent and annotateImpressionEvent. This or insertEvent and annotateImpressionEvent is a required field. */
  var annotateClickEvent: js.UndefOr[CustomEventClickAnnotation] = js.native
  
  /** Annotate an impression. This field is mutually exclusive with insertEvent and annotateClickEvent. This or insertEvent and annotateClickEvent is a required field. */
  var annotateImpressionEvent: js.UndefOr[CustomEventImpressionAnnotation] = js.native
  
  /** Custom variables associated with the event. */
  var customVariables: js.UndefOr[js.Array[CustomVariable]] = js.native
  
  /** The type of event. If INSERT, the fields in insertEvent need to be populated. If ANNOTATE, the fields in either annotateClickEvent or annotateImpressionEvent need to be populated. */
  var eventType: js.UndefOr[String] = js.native
  
  /** Floodlight configuration ID of the advertiser the event is linked to. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Insert custom event. This field is mutually exclusive with annotateClickEvent and annotateImpressionEvent. This or annotateClickEvent and annotateImpressionEvent is a required
    * field.
    */
  var insertEvent: js.UndefOr[CustomEventInsert] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEvent". */
  var kind: js.UndefOr[String] = js.native
  
  /** The ordinal of this custom event. This is a required field. */
  var ordinal: js.UndefOr[String] = js.native
  
  /** The timestamp of this custom event, in Unix epoch micros. This is a required field. */
  var timestampMicros: js.UndefOr[String] = js.native
}
object CustomEvent {
  
  @scala.inline
  def apply(): CustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEvent]
  }
  
  @scala.inline
  implicit class CustomEventOps[Self <: CustomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotateClickEvent(value: CustomEventClickAnnotation): Self = this.set("annotateClickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotateClickEvent: Self = this.set("annotateClickEvent", js.undefined)
    
    @scala.inline
    def setAnnotateImpressionEvent(value: CustomEventImpressionAnnotation): Self = this.set("annotateImpressionEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotateImpressionEvent: Self = this.set("annotateImpressionEvent", js.undefined)
    
    @scala.inline
    def setCustomVariablesVarargs(value: CustomVariable*): Self = this.set("customVariables", js.Array(value :_*))
    
    @scala.inline
    def setCustomVariables(value: js.Array[CustomVariable]): Self = this.set("customVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomVariables: Self = this.set("customVariables", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setInsertEvent(value: CustomEventInsert): Self = this.set("insertEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertEvent: Self = this.set("insertEvent", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrdinal(value: String): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setTimestampMicros(value: String): Self = this.set("timestampMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampMicros: Self = this.set("timestampMicros", js.undefined)
  }
}
