package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GroupsService.ListGroupItems.
  */
trait SchemaListGroupItemsResponse extends StObject {
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `groupItem` resource.
    */
  var items: js.UndefOr[js.Array[SchemaGroupItem]] = js.undefined
  
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItemListResponse`.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaListGroupItemsResponse {
  
  @scala.inline
  def apply(): SchemaListGroupItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupItemsResponse]
  }
  
  @scala.inline
  implicit class SchemaListGroupItemsResponseMutableBuilder[Self <: SchemaListGroupItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaGroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGroupItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
