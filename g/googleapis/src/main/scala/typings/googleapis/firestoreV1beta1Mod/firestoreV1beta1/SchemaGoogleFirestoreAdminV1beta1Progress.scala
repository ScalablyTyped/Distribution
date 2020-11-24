package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measures the progress of a particular metric.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1Progress extends js.Object {
  
  /**
    * An estimate of how much work has been completed. Note that this may be
    * greater than `work_estimated`.
    */
  var workCompleted: js.UndefOr[String] = js.native
  
  /**
    * An estimate of how much work needs to be performed. Zero if the work
    * estimate is unavailable. May change as work progresses.
    */
  var workEstimated: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1Progress {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1Progress]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ProgressOps[Self <: SchemaGoogleFirestoreAdminV1beta1Progress] (val x: Self) extends AnyVal {
    
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
    def setWorkCompleted(value: String): Self = this.set("workCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkCompleted: Self = this.set("workCompleted", js.undefined)
    
    @scala.inline
    def setWorkEstimated(value: String): Self = this.set("workEstimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkEstimated: Self = this.set("workEstimated", js.undefined)
  }
}
