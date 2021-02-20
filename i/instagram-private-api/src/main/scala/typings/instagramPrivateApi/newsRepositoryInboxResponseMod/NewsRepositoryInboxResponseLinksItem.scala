package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseLinksItem extends StObject {
  
  var end: Double = js.native
  
  var id: String | Double = js.native
  
  var start: Double = js.native
  
  var `type`: String = js.native
}
object NewsRepositoryInboxResponseLinksItem {
  
  @scala.inline
  def apply(end: Double, id: String | Double, start: Double, `type`: String): NewsRepositoryInboxResponseLinksItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseLinksItem]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseLinksItemMutableBuilder[Self <: NewsRepositoryInboxResponseLinksItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
