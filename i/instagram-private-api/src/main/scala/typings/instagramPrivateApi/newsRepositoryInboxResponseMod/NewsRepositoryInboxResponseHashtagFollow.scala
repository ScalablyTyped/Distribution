package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseHashtagFollow extends StObject {
  
  var follow_status: Double
  
  var id: String
  
  var name: String
}
object NewsRepositoryInboxResponseHashtagFollow {
  
  inline def apply(follow_status: Double, id: String, name: String): NewsRepositoryInboxResponseHashtagFollow = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseHashtagFollow]
  }
  
  extension [Self <: NewsRepositoryInboxResponseHashtagFollow](x: Self) {
    
    inline def setFollow_status(value: Double): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
