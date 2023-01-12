package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redis extends StObject {
  
  var redis: Stream
}
object Redis {
  
  inline def apply(redis: Stream): Redis = {
    val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Redis] (val x: Self) extends AnyVal {
    
    inline def setRedis(value: Stream): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
  }
}
