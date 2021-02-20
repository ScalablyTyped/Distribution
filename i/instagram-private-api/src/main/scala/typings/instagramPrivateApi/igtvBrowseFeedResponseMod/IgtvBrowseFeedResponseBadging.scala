package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseBadging extends StObject {
  
  var ids: js.Array[_] = js.native
  
  var items: js.Array[_] = js.native
}
object IgtvBrowseFeedResponseBadging {
  
  @scala.inline
  def apply(ids: js.Array[_], items: js.Array[_]): IgtvBrowseFeedResponseBadging = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseBadging]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseBadgingMutableBuilder[Self <: IgtvBrowseFeedResponseBadging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[_]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: js.Any*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
