package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDetectionsListResponse extends js.Object {
  
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[SchemaDetectionsResource]] = js.native
}
object SchemaDetectionsListResponse {
  
  @scala.inline
  def apply(): SchemaDetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaDetectionsListResponseOps[Self <: SchemaDetectionsListResponse] (val x: Self) extends AnyVal {
    
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
    def setDetectionsVarargs(value: SchemaDetectionsResource*): Self = this.set("detections", js.Array(value :_*))
    
    @scala.inline
    def setDetections(value: js.Array[SchemaDetectionsResource]): Self = this.set("detections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetections: Self = this.set("detections", js.undefined)
  }
}
