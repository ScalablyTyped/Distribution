package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record key for a finding in Cloud Datastore.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DatastoreKey extends js.Object {
  /**
    * Datastore entity key.
    */
  var entityKey: js.UndefOr[SchemaGooglePrivacyDlpV2Key] = js.native
}

object SchemaGooglePrivacyDlpV2DatastoreKey {
  @scala.inline
  def apply(entityKey: SchemaGooglePrivacyDlpV2Key = null): SchemaGooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    if (entityKey != null) __obj.updateDynamic("entityKey")(entityKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreKey]
  }
}

