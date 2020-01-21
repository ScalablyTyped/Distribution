package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DICOM store.
  */
@js.native
trait SchemaDicomStore extends js.Object {
  /**
    * Output only. Resource name of the DICOM store, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notification destination for new DICOM instances. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
}

object SchemaDicomStore {
  @scala.inline
  def apply(name: String = null, notificationConfig: SchemaNotificationConfig = null): SchemaDicomStore = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDicomStore]
  }
}

