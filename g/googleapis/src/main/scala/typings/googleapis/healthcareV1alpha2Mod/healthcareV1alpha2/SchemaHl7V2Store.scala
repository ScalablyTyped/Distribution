package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an HL7v2 store.
  */
@js.native
trait SchemaHl7V2Store extends js.Object {
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
    * Output only. Resource name of the HL7v2 store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notification destination all messages (both Ingest &amp; Create) are
    * published on. Only the message name is sent as part of the notification.
    * If this is unset, no notifications will be sent. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
  /**
    * The configuration for the parser. It determines how the server parses the
    * messages.
    */
  var parserConfig: js.UndefOr[SchemaParserConfig] = js.native
}

object SchemaHl7V2Store {
  @scala.inline
  def apply(
    labels: StringDictionary[String] = null,
    name: String = null,
    notificationConfig: SchemaNotificationConfig = null,
    parserConfig: SchemaParserConfig = null
  ): SchemaHl7V2Store = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig.asInstanceOf[js.Any])
    if (parserConfig != null) __obj.updateDynamic("parserConfig")(parserConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHl7V2Store]
  }
}

