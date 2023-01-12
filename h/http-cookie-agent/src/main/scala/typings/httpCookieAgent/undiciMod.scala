package typings.httpCookieAgent

import org.scalablytyped.runtime.Instantiable2
import typings.httpCookieAgent.anon.Cookies
import typings.httpCookieAgent.httpCookieAgentBooleans.`true`
import typings.httpCookieAgent.undiciMod.CookieAgent.Options
import typings.std.URL
import typings.toughCookie.mod.CookieJar
import typings.undici.mod.Agent
import typings.undici.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undiciMod {
  
  @JSImport("http-cookie-agent/undici", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-cookie-agent/undici", "CookieAgent")
  @js.native
  open class CookieAgent () extends Agent {
    def this(options: Options) = this()
  }
  object CookieAgent {
    
    trait Options
      extends StObject
         with typings.undici.typesAgentMod.Options {
      
      var cookies: js.UndefOr[CookieOptions] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      }
    }
  }
  
  @JSImport("http-cookie-agent/undici", "CookieClient")
  @js.native
  open class CookieClient protected () extends Client {
    def this(url: String) = this()
    def this(url: URL) = this()
    def this(url: String, options: typings.httpCookieAgent.undiciMod.CookieClient.Options) = this()
    def this(url: URL, options: typings.httpCookieAgent.undiciMod.CookieClient.Options) = this()
  }
  object CookieClient {
    
    trait Options
      extends StObject
         with typings.undici.typesClientMod.Options {
      
      var cookies: js.UndefOr[CookieOptions] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.httpCookieAgent.undiciMod.CookieClient.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.httpCookieAgent.undiciMod.CookieClient.Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.httpCookieAgent.undiciMod.CookieClient.Options] (val x: Self) extends AnyVal {
        
        inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      }
    }
  }
  
  inline def createCookieClient[BaseClient /* <: Client */, BaseClientOptions](
    BaseClientClass: Instantiable2[/* origin */ String | URL, /* options */ BaseClientOptions, BaseClient]
  ): Instantiable2[
    /* origin */ String | URL, 
    /* options */ js.UndefOr[BaseClientOptions & Cookies], 
    BaseClient
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCookieClient")(BaseClientClass.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
    /* origin */ String | URL, 
    /* options */ js.UndefOr[BaseClientOptions & Cookies], 
    BaseClient
  ]]
  
  trait CookieOptions extends StObject {
    
    var async_UNSTABLE: js.UndefOr[`true`] = js.undefined
    
    var jar: CookieJar
  }
  object CookieOptions {
    
    inline def apply(jar: CookieJar): CookieOptions = {
      val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync_UNSTABLE(value: `true`): Self = StObject.set(x, "async_UNSTABLE", value.asInstanceOf[js.Any])
      
      inline def setAsync_UNSTABLEUndefined: Self = StObject.set(x, "async_UNSTABLE", js.undefined)
      
      inline def setJar(value: CookieJar): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    }
  }
}
