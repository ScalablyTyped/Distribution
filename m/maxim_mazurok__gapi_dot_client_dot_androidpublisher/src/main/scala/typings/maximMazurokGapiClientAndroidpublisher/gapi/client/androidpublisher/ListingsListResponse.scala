package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListingsListResponse extends js.Object {
  
  /** The kind of this response ("androidpublisher#listingsListResponse"). */
  var kind: js.UndefOr[String] = js.native
  
  /** All localized listings. */
  var listings: js.UndefOr[js.Array[Listing]] = js.native
}
object ListingsListResponse {
  
  @scala.inline
  def apply(): ListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListingsListResponse]
  }
  
  @scala.inline
  implicit class ListingsListResponseOps[Self <: ListingsListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setListingsVarargs(value: Listing*): Self = this.set("listings", js.Array(value :_*))
    
    @scala.inline
    def setListings(value: js.Array[Listing]): Self = this.set("listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListings: Self = this.set("listings", js.undefined)
  }
}
