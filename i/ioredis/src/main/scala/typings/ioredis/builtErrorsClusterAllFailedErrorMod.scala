package typings.ioredis

import typings.redisErrors.mod.RedisError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtErrorsClusterAllFailedErrorMod {
  
  @JSImport("ioredis/built/errors/ClusterAllFailedError", JSImport.Default)
  @js.native
  open class default protected () extends ClusterAllFailedError {
    def this(message: Any, lastNodeError: RedisError) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ioredis/built/errors/ClusterAllFailedError", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ioredis/built/errors/ClusterAllFailedError", "default.defaultMessage")
    @js.native
    def defaultMessage: String = js.native
    inline def defaultMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessage")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ClusterAllFailedError extends RedisError {
    
    var lastNodeError: RedisError = js.native
    
    @JSName("name")
    def name_MClusterAllFailedError: String = js.native
  }
}
