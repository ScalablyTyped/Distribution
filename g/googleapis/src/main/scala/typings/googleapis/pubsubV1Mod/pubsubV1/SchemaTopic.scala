package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopic extends StObject {
  
  /**
    * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published on this topic. The expected format is `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels).
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Indicates the minimum duration to retain a message after it is published to the topic. If this field is set, messages published to the topic in the last `message_retention_duration` are always available to subscribers. For instance, it allows any attached subscription to [seek to a timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) that is up to `message_retention_duration` in the past. If this field is not set, message retention is controlled by settings on individual subscriptions. Cannot be more than 31 days or less than 10 minutes.
    */
  var messageRetentionDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Policy constraining the set of Google Cloud Platform regions where messages published to the topic may be stored. If not present, then no constraints are in effect.
    */
  var messageStoragePolicy: js.UndefOr[SchemaMessageStoragePolicy] = js.undefined
  
  /**
    * Required. The name of the topic. It must have the format `"projects/{project\}/topics/{topic\}"`. `{topic\}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Settings for validating messages published against a schema.
    */
  var schemaSettings: js.UndefOr[SchemaSchemaSettings] = js.undefined
}
object SchemaTopic {
  
  inline def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  
  extension [Self <: SchemaTopic](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageRetentionDuration(value: String): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setMessageRetentionDurationNull: Self = StObject.set(x, "messageRetentionDuration", null)
    
    inline def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    inline def setMessageStoragePolicy(value: SchemaMessageStoragePolicy): Self = StObject.set(x, "messageStoragePolicy", value.asInstanceOf[js.Any])
    
    inline def setMessageStoragePolicyUndefined: Self = StObject.set(x, "messageStoragePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSchemaSettings(value: SchemaSchemaSettings): Self = StObject.set(x, "schemaSettings", value.asInstanceOf[js.Any])
    
    inline def setSchemaSettingsUndefined: Self = StObject.set(x, "schemaSettings", js.undefined)
  }
}
