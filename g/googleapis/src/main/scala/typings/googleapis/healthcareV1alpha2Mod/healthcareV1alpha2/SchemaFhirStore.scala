package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR store.
  */
@js.native
trait SchemaFhirStore extends js.Object {
  /**
    * Whether to disable referential integrity in this FHIR store. This field
    * is immutable after FHIR store creation. The default value is false,
    * meaning that the API will enforce referential integrity and fail the
    * requests that will result in inconsistent state in the FHIR store. When
    * this field is set to true, the API will skip referential integrity check.
    * Consequently, operations that rely on references, such as
    * GetPatientEverything, will not return all the results if broken
    * references exist.
    */
  var disableReferentialIntegrity: js.UndefOr[Boolean] = js.native
  /**
    * Whether to disable resource versioning for this FHIR store. This field
    * can not be changed after the creation of FHIR store. If set to false,
    * which is the default behavior, all write operations will cause historical
    * versions to be recorded automatically. The historical versions can be
    * fetched through the history APIs, but cannot be updated. If set to true,
    * no historical versions will be kept. The server will send back errors for
    * attempts to read the historical versions.
    */
  var disableResourceVersioning: js.UndefOr[Boolean] = js.native
  /**
    * Whether to allow the bulk import API to accept history bundles and
    * directly insert historical resource versions into the FHIR store.
    * Importing resource histories creates resource interactions that appear to
    * have occurred in the past, which clients may not want to allow. If set to
    * false, history bundles within an import will fail with an error.
    */
  var enableHistoryImport: js.UndefOr[Boolean] = js.native
  /**
    * Whether this FHIR store has the [updateCreate
    * capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate).
    * This determines if the client can use an Update operation to create a new
    * resource with a client-specified ID. If false, all IDs are
    * server-assigned through the Create operation and attempts to Update a
    * non-existent resource will return errors. Please treat the audit logs
    * with appropriate levels of care if client-specified resource IDs contain
    * sensitive data such as patient identifiers, those IDs will be part of the
    * FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
    * notifications.
    */
  var enableUpdateCreate: js.UndefOr[Boolean] = js.native
  /**
    * User-supplied key-value pairs used to organize FHIR stores.  Label keys
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
    * Output only. Resource name of the FHIR store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If non-empty, publish all resource modifications of this FHIR store to
    * this destination. The Cloud Pub/Sub message attributes will contain a map
    * with a string describing the action that has triggered the notification,
    * e.g. &quot;action&quot;:&quot;CreateResource&quot;.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
}

object SchemaFhirStore {
  @scala.inline
  def apply(): SchemaFhirStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirStore]
  }
  @scala.inline
  implicit class SchemaFhirStoreOps[Self <: SchemaFhirStore] (val x: Self) extends AnyVal {
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
    def setDisableReferentialIntegrity(value: Boolean): Self = this.set("disableReferentialIntegrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableReferentialIntegrity: Self = this.set("disableReferentialIntegrity", js.undefined)
    @scala.inline
    def setDisableResourceVersioning(value: Boolean): Self = this.set("disableResourceVersioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableResourceVersioning: Self = this.set("disableResourceVersioning", js.undefined)
    @scala.inline
    def setEnableHistoryImport(value: Boolean): Self = this.set("enableHistoryImport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHistoryImport: Self = this.set("enableHistoryImport", js.undefined)
    @scala.inline
    def setEnableUpdateCreate(value: Boolean): Self = this.set("enableUpdateCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUpdateCreate: Self = this.set("enableUpdateCreate", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotificationConfig(value: SchemaNotificationConfig): Self = this.set("notificationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfig: Self = this.set("notificationConfig", js.undefined)
  }
  
}

