package typings.koa2SessionRedis

import typings.koa2SessionRedis.anon.PartialSessionexpirenumbe
import typings.koa2SessionRedis.koa2SessionRedisStrings.session
import typings.koaSession.mod.stores
import typings.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa2-session-redis", JSImport.Namespace)
  @js.native
  class ^ () extends RedisStore {
    def this(config: ClientOpts) = this()
  }
  
  @js.native
  trait RedisStore extends stores {
    
    /**
      * get session object by key
      */
    def get(key: String): js.Any = js.native
    
    /**
      * sends the quit command to the redis server and ends cleanly right after all running commands were properly handled
      */
    def quit(): Unit = js.native
    
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(key: String, sess: PartialSessionexpirenumbe): js.Any = js.native
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double): js.Any = js.native
    @JSName("set")
    def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session): js.Any = js.native
  }
}
