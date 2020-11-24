package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirebaseRulesService.UpdateReleasePatch.
  */
@js.native
trait SchemaUpdateReleaseRequest extends js.Object {
  
  /**
    * `Release` to update.
    */
  var release: js.UndefOr[SchemaRelease] = js.native
  
  /**
    * Specifies which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateReleaseRequest {
  
  @scala.inline
  def apply(): SchemaUpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateReleaseRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateReleaseRequestOps[Self <: SchemaUpdateReleaseRequest] (val x: Self) extends AnyVal {
    
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
    def setRelease(value: SchemaRelease): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
