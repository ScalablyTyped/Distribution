package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appid extends StObject {
  
  var `app-id`: String
  
  var `channel-name`: String
  
  var `max-store`: String
  
  var `min-background-duration`: String
  
  var `update-api`: String
  
  var `update-method`: String
}
object Appid {
  
  inline def apply(
    `app-id`: String,
    `channel-name`: String,
    `max-store`: String,
    `min-background-duration`: String,
    `update-api`: String,
    `update-method`: String
  ): Appid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app-id")(`app-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("channel-name")(`channel-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-store")(`max-store`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-background-duration")(`min-background-duration`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-api")(`update-api`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-method")(`update-method`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  
  extension [Self <: Appid](x: Self) {
    
    inline def `setApp-id`(value: String): Self = StObject.set(x, "app-id", value.asInstanceOf[js.Any])
    
    inline def `setChannel-name`(value: String): Self = StObject.set(x, "channel-name", value.asInstanceOf[js.Any])
    
    inline def `setMax-store`(value: String): Self = StObject.set(x, "max-store", value.asInstanceOf[js.Any])
    
    inline def `setMin-background-duration`(value: String): Self = StObject.set(x, "min-background-duration", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-api`(value: String): Self = StObject.set(x, "update-api", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-method`(value: String): Self = StObject.set(x, "update-method", value.asInstanceOf[js.Any])
  }
}
