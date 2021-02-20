package typings.hapiServerSession

import org.scalablytyped.runtime.Shortcut
import typings.hapiHapi.mod.CachePolicyOptions
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ServerStateCookieOptions
import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-server-session", JSImport.Default)
  @js.native
  val default: Plugin[Options] = js.native
  
  @JSImport("hapi-server-session", "plugin")
  @js.native
  val plugin: Plugin[Options] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var cache: js.UndefOr[CachePolicyOptions[_]] = js.native
    
    var cookie: js.UndefOr[ServerStateCookieOptions] = js.native
    
    var expiresIn: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[BinaryLike] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var vhost: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setCache(value: CachePolicyOptions[_]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCookie(value: ServerStateCookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setKey(value: BinaryLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      @scala.inline
      def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value :_*))
    }
  }
  
  type _To = Plugin[Options]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[Options] = default
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var session: js.Any = js.native
    }
    object Request {
      
      @scala.inline
      def apply(session: js.Any): Request = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSession(value: js.Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      }
    }
  }
}
