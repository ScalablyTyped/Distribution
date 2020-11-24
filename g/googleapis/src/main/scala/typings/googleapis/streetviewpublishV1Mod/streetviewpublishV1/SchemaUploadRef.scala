package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Upload reference for media files.
  */
@js.native
trait SchemaUploadRef extends js.Object {
  
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * &quot;https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}&quot;
    */
  var uploadUrl: js.UndefOr[String] = js.native
}
object SchemaUploadRef {
  
  @scala.inline
  def apply(): SchemaUploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadRef]
  }
  
  @scala.inline
  implicit class SchemaUploadRefOps[Self <: SchemaUploadRef] (val x: Self) extends AnyVal {
    
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
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
}
