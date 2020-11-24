package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImageVersionsResponse extends js.Object {
  
  /** The list of supported ImageVersions in a location. */
  var imageVersions: js.UndefOr[js.Array[ImageVersion]] = js.native
  
  /** The page token used to query for the next page if one exists. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListImageVersionsResponse {
  
  @scala.inline
  def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  @scala.inline
  implicit class ListImageVersionsResponseOps[Self <: ListImageVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setImageVersionsVarargs(value: ImageVersion*): Self = this.set("imageVersions", js.Array(value :_*))
    
    @scala.inline
    def setImageVersions(value: js.Array[ImageVersion]): Self = this.set("imageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersions: Self = this.set("imageVersions", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
