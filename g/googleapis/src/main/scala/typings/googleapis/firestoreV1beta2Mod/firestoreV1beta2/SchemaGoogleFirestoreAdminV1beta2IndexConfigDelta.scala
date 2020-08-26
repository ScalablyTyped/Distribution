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
  def apply(): SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2IndexConfigDeltaOps[Self <: SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta] (val x: Self) extends AnyVal {
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
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    @scala.inline
    def setIndex(value: SchemaGoogleFirestoreAdminV1beta2Index): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

