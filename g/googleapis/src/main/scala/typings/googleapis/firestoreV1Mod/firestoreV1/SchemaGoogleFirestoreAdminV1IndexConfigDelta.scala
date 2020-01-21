package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an index configuration change.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1IndexConfigDelta extends js.Object {
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String] = js.native
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1Index] = js.native
}

object SchemaGoogleFirestoreAdminV1IndexConfigDelta {
  @scala.inline
  def apply(changeType: String = null, index: SchemaGoogleFirestoreAdminV1Index = null): SchemaGoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexConfigDelta]
  }
}

