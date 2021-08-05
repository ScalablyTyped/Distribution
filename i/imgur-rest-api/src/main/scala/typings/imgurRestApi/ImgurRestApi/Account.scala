package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var bio: String
  
  var created: Double
  
  var id: Double
  
  var pro_expiration: js.Any
  
  var reputation: Double
  
  var url: String
}
object Account {
  
  inline def apply(bio: String, created: Double, id: Double, pro_expiration: js.Any, reputation: Double, url: String): Account = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pro_expiration = pro_expiration.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPro_expiration(value: js.Any): Self = StObject.set(x, "pro_expiration", value.asInstanceOf[js.Any])
    
    inline def setReputation(value: Double): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
