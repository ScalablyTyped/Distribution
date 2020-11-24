package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GroupsService.ListGroupItems.
  */
@js.native
trait SchemaListGroupItemsResponse extends js.Object {
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `groupItem` resource.
    */
  var items: js.UndefOr[js.Array[SchemaGroupItem]] = js.native
  
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItemListResponse`.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaListGroupItemsResponse {
  
  @scala.inline
  def apply(): SchemaListGroupItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupItemsResponse]
  }
  
  @scala.inline
  implicit class SchemaListGroupItemsResponseOps[Self <: SchemaListGroupItemsResponse] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGroupItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaGroupItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
