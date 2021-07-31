package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A complete HL7v2 message. See
  * http://www.hl7.org/implement/standards/index.cfm?ref=common for details on
  * the standard.
  */
trait SchemaMessage extends StObject {
  
  /**
    * The datetime when the message was created. Set by the server.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Raw message bytes.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The message type and trigger event for this message. MSH-9.
    */
  var messageType: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Message, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The parsed version of the raw message data.
    */
  var parsedData: js.UndefOr[SchemaParsedData] = js.undefined
  
  /**
    * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this
    * message.
    */
  var patientIds: js.UndefOr[js.Array[SchemaPatientId]] = js.undefined
  
  /**
    * The hospital that this message came from. MSH-4.
    */
  var sendFacility: js.UndefOr[String] = js.undefined
  
  /**
    * The datetime the sending application sent this message. MSH-7.
    */
  var sendTime: js.UndefOr[String] = js.undefined
}
object SchemaMessage {
  
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  @scala.inline
  implicit class SchemaMessageMutableBuilder[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParsedData(value: SchemaParsedData): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDataUndefined: Self = StObject.set(x, "parsedData", js.undefined)
    
    @scala.inline
    def setPatientIds(value: js.Array[SchemaPatientId]): Self = StObject.set(x, "patientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientIdsUndefined: Self = StObject.set(x, "patientIds", js.undefined)
    
    @scala.inline
    def setPatientIdsVarargs(value: SchemaPatientId*): Self = StObject.set(x, "patientIds", js.Array(value :_*))
    
    @scala.inline
    def setSendFacility(value: String): Self = StObject.set(x, "sendFacility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendFacilityUndefined: Self = StObject.set(x, "sendFacility", js.undefined)
    
    @scala.inline
    def setSendTime(value: String): Self = StObject.set(x, "sendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendTimeUndefined: Self = StObject.set(x, "sendTime", js.undefined)
  }
}
