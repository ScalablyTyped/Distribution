package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to list all photos that belong to a user.
  */
@js.native
trait SchemaListPhotosResponse extends js.Object {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of photos. The pageSize field in the request determines the number
    * of items returned.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}
object SchemaListPhotosResponse {
  
  @scala.inline
  def apply(): SchemaListPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPhotosResponse]
  }
  
  @scala.inline
  implicit class SchemaListPhotosResponseOps[Self <: SchemaListPhotosResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
  }
}
