package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.anon.Currenttotalinstances
import typings.mailchimpMailchimpMarketing.mod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListsSuccessResponse extends StObject {
  
  var _links: js.Array[Link]
  
  var constraints: Currenttotalinstances
  
  var lists: js.Array[typings.mailchimpMailchimpMarketing.mod.lists.List]
  
  var total_items: Double
}
object ListsSuccessResponse {
  
  inline def apply(
    _links: js.Array[Link],
    constraints: Currenttotalinstances,
    lists: js.Array[typings.mailchimpMailchimpMarketing.mod.lists.List],
    total_items: Double
  ): ListsSuccessResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListsSuccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListsSuccessResponse] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: Currenttotalinstances): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setLists(value: js.Array[typings.mailchimpMailchimpMarketing.mod.lists.List]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsVarargs(value: typings.mailchimpMailchimpMarketing.mod.lists.List*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Array[Link]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    
    inline def set_linksVarargs(value: Link*): Self = StObject.set(x, "_links", js.Array(value*))
  }
}
