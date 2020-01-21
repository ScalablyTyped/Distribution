package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an index configuration change.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta extends js.Object {
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String] = js.native
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Index] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta {
  @scala.inline
  def apply(changeType: String = null, index: SchemaGoogleFirestoreAdminV1beta2Index = null): SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]
  }
}

