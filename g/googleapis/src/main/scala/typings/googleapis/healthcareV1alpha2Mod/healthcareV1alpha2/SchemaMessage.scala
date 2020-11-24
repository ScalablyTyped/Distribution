package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A complete HL7v2 message. See
  * http://www.hl7.org/implement/standards/index.cfm?ref=common for details on
  * the standard.
  */
@js.native
trait SchemaMessage extends js.Object {
  
  /**
    * The datetime when the message was created. Set by the server.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Raw message bytes.
    */
  var data: js.UndefOr[String] = js.native
  
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
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The message type and trigger event for this message. MSH-9.
    */
  var messageType: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the Message, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The parsed version of the raw message data.
    */
  var parsedData: js.UndefOr[SchemaParsedData] = js.native
  
  /**
    * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this
    * message.
    */
  var patientIds: js.UndefOr[js.Array[SchemaPatientId]] = js.native
  
  /**
    * The hospital that this message came from. MSH-4.
    */
  var sendFacility: js.UndefOr[String] = js.native
  
  /**
    * The datetime the sending application sent this message. MSH-7.
    */
  var sendTime: js.UndefOr[String] = js.native
}
object SchemaMessage {
  
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  @scala.inline
  implicit class SchemaMessageOps[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParsedData(value: SchemaParsedData): Self = this.set("parsedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsedData: Self = this.set("parsedData", js.undefined)
    
    @scala.inline
    def setPatientIdsVarargs(value: SchemaPatientId*): Self = this.set("patientIds", js.Array(value :_*))
    
    @scala.inline
    def setPatientIds(value: js.Array[SchemaPatientId]): Self = this.set("patientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatientIds: Self = this.set("patientIds", js.undefined)
    
    @scala.inline
    def setSendFacility(value: String): Self = this.set("sendFacility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendFacility: Self = this.set("sendFacility", js.undefined)
    
    @scala.inline
    def setSendTime(value: String): Self = this.set("sendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendTime: Self = this.set("sendTime", js.undefined)
  }
}
