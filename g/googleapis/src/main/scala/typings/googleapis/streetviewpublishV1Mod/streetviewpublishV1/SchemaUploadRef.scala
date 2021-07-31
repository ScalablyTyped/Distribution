package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Upload reference for media files.
  */
trait SchemaUploadRef extends StObject {
  
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * &quot;https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}&quot;
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object SchemaUploadRef {
  
  @scala.inline
  def apply(): SchemaUploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadRef]
  }
  
  @scala.inline
  implicit class SchemaUploadRefMutableBuilder[Self <: SchemaUploadRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
