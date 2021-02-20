package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseHashtagFollow extends StObject {
  
  var follow_status: Double = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object NewsRepositoryInboxResponseHashtagFollow {
  
  @scala.inline
  def apply(follow_status: Double, id: String, name: String): NewsRepositoryInboxResponseHashtagFollow = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseHashtagFollow]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseHashtagFollowMutableBuilder[Self <: NewsRepositoryInboxResponseHashtagFollow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollow_status(value: Double): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
