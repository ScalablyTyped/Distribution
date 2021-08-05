package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseInstagramActor extends StObject {
  
  var id: String
  
  var instagram_actor_id: String
}
object InsightsServicePostResponseInstagramActor {
  
  inline def apply(id: String, instagram_actor_id: String): InsightsServicePostResponseInstagramActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instagram_actor_id = instagram_actor_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseInstagramActor]
  }
  
  extension [Self <: InsightsServicePostResponseInstagramActor](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstagram_actor_id(value: String): Self = StObject.set(x, "instagram_actor_id", value.asInstanceOf[js.Any])
  }
}
