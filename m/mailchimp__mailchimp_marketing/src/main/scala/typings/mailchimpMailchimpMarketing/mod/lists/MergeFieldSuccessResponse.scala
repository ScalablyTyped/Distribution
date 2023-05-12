package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.mod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeFieldSuccessResponse extends StObject {
  
  var _links: js.Array[Link]
  
  var list_id: String
  
  var merge_fields: js.Array[MergeField]
  
  var total_items: Double
}
object MergeFieldSuccessResponse {
  
  inline def apply(_links: js.Array[Link], list_id: String, merge_fields: js.Array[MergeField], total_items: Double): MergeFieldSuccessResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], list_id = list_id.asInstanceOf[js.Any], merge_fields = merge_fields.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeFieldSuccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeFieldSuccessResponse] (val x: Self) extends AnyVal {
    
    inline def setList_id(value: String): Self = StObject.set(x, "list_id", value.asInstanceOf[js.Any])
    
    inline def setMerge_fields(value: js.Array[MergeField]): Self = StObject.set(x, "merge_fields", value.asInstanceOf[js.Any])
    
    inline def setMerge_fieldsVarargs(value: MergeField*): Self = StObject.set(x, "merge_fields", js.Array(value*))
    
    inline def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Array[Link]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    
    inline def set_linksVarargs(value: Link*): Self = StObject.set(x, "_links", js.Array(value*))
  }
}
