package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ListTagsResponse extends js.Object {
  
  /** Token to retrieve the next page of results. It is set to empty if no items remain in results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Tag details. */
  var tags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Tag]] = js.native
}
object GoogleCloudDatacatalogV1beta1ListTagsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListTagsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListTagsResponseOps[Self <: GoogleCloudDatacatalogV1beta1ListTagsResponse] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: GoogleCloudDatacatalogV1beta1Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[GoogleCloudDatacatalogV1beta1Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
