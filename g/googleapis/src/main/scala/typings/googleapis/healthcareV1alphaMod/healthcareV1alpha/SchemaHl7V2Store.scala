package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an HL7v2 store.
  */
trait SchemaHl7V2Store extends StObject {
  
  /**
    * Output only. Resource name of the HL7v2 store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The notification destination all messages (both Ingest &amp; Create) are
    * published on. Only the message name is sent as part of the notification.
    * If this is unset, no notifications will be sent. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.undefined
  
  /**
    * The configuration for the parser. It determines how the server parses the
    * messages.
    */
  var parserConfig: js.UndefOr[SchemaParserConfig] = js.undefined
}
object SchemaHl7V2Store {
  
  @scala.inline
  def apply(): SchemaHl7V2Store = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHl7V2Store]
  }
  
  @scala.inline
  implicit class SchemaHl7V2StoreMutableBuilder[Self <: SchemaHl7V2Store] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    @scala.inline
    def setParserConfig(value: SchemaParserConfig): Self = StObject.set(x, "parserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserConfigUndefined: Self = StObject.set(x, "parserConfig", js.undefined)
  }
}
