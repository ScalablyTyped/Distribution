package typings.hapiServerSession

import org.scalablytyped.runtime.Shortcut
import typings.hapiHapi.libTypesPluginMod.Plugin
import typings.hapiHapi.libTypesServerCacheMod.CachePolicyOptions
import typings.hapiHapi.libTypesServerStateMod.ServerStateCookieOptions
import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-server-session", JSImport.Default)
  @js.native
  val default: Plugin[Options, Unit] = js.native
  
  @JSImport("hapi-server-session", "plugin")
  @js.native
  val plugin: Plugin[Options, Unit] = js.native
  
  trait Options extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[CachePolicyOptions[Any]] = js.undefined
    
    var cookie: js.UndefOr[ServerStateCookieOptions] = js.undefined
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[BinaryLike] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCache(value: CachePolicyOptions[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookie(value: ServerStateCookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setKey(value: BinaryLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
    }
  }
  
  type _To = Plugin[Options, Unit]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[Options, Unit] = default
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait Request extends StObject {
      
      var session: Any
    }
    object Request {
      
      inline def apply(session: Any): Request = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      }
    }
  }
}
