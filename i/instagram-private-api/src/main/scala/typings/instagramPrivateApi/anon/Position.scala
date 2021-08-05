package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: js.Tuple2[Double, Double]
  
  var user_id: Double | String
}
object Position {
  
  inline def apply(position: js.Tuple2[Double, Double], user_id: Double | String): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double | String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
