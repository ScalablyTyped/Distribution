package typings.ioredis

import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanStreamMod {
  
  @JSImport("ioredis/built/ScanStream", JSImport.Default)
  @js.native
  open class default protected () extends ScanStream {
    def this(opt: Options) = this()
  }
  
  trait Options
    extends StObject
       with ReadableOptions {
    
    var command: String
    
    var count: js.UndefOr[String | Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var `match`: js.UndefOr[String] = js.undefined
    
    var redis: Any
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(command: String, redis: Any): Options = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCount(value: String | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setRedis(value: Any): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ScanStream extends Readable {
    
    def _read(): Unit = js.native
    
    /* private */ var _redisCursor: Any = js.native
    
    /* private */ var _redisDrained: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var opt: Any = js.native
  }
}
