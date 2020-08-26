package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the progress of the operation. Unit of work is generic and must
  * be interpreted based on where Progress is used.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2Progress extends js.Object {
  /**
    * The amount of work completed.
    */
  var completedWork: js.UndefOr[String] = js.native
  /**
    * The amount of work estimated.
    */
  var estimatedWork: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2Progress {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2Progress]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ProgressOps[Self <: SchemaGoogleFirestoreAdminV1beta2Progress] (val x: Self) extends AnyVal {
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
    def setCompletedWork(value: String): Self = this.set("completedWork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedWork: Self = this.set("completedWork", js.undefined)
    @scala.inline
    def setEstimatedWork(value: String): Self = this.set("estimatedWork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedWork: Self = this.set("estimatedWork", js.undefined)
  }
  
}

