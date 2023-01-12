package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserId_ extends StObject {
  
  var userId: String
}
object UserId_ {
  
  inline def apply(userId: String): UserId_ = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserId_] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
