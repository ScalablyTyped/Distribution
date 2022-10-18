package typings.httpCookieAgent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.httpCookieAgent.httpCookieAgentBooleans.`true`
import typings.node.httpMod.AgentOptions
import typings.node.nodeColonhttpMod.Agent
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("http-cookie-agent/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-cookie-agent/http", "HttpCookieAgent")
  @js.native
  val HttpCookieAgent: Instantiable1[/* options */ AgentOptions & CookieAgentOptions, CookieAgent[Agent]] = js.native
  
  @JSImport("http-cookie-agent/http", "HttpsCookieAgent")
  @js.native
  val HttpsCookieAgent: Instantiable1[
    /* options */ typings.node.httpsMod.AgentOptions & CookieAgentOptions, 
    CookieAgent[typings.node.nodeColonhttpsMod.Agent]
  ] = js.native
  
  @JSImport("http-cookie-agent/http", "MixedCookieAgent")
  @js.native
  val MixedCookieAgent: Instantiable1[
    /* options */ AgentOptions & typings.node.httpsMod.AgentOptions & CookieAgentOptions, 
    CookieAgent[typings.node.nodeColonhttpsMod.Agent]
  ] = js.native
  
  inline def createCookieAgent[BaseAgent /* <: Agent */, BaseAgentOptions, BaseAgentConstructorRestParams /* <: js.Array[Any] */](
    BaseAgent: Instantiable2[/* options */ BaseAgentOptions, /* rest */ BaseAgentConstructorRestParams, BaseAgent]
  ): Instantiable2[
    /* options */ BaseAgentOptions & CookieAgentOptions, 
    /* rest */ BaseAgentConstructorRestParams, 
    CookieAgent[BaseAgent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCookieAgent")(BaseAgent.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
    /* options */ BaseAgentOptions & CookieAgentOptions, 
    /* rest */ BaseAgentConstructorRestParams, 
    CookieAgent[BaseAgent]
  ]]
  
  type CookieAgent[BaseAgent /* <: Agent */] = BaseAgent
  
  trait CookieAgentOptions extends StObject {
    
    var cookies: js.UndefOr[CookieOptions] = js.undefined
  }
  object CookieAgentOptions {
    
    inline def apply(): CookieAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieAgentOptions]
    }
    
    extension [Self <: CookieAgentOptions](x: Self) {
      
      inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    }
  }
  
  trait CookieOptions extends StObject {
    
    var async_UNSTABLE: js.UndefOr[`true`] = js.undefined
    
    var jar: CookieJar
  }
  object CookieOptions {
    
    inline def apply(jar: CookieJar): CookieOptions = {
      val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setAsync_UNSTABLE(value: `true`): Self = StObject.set(x, "async_UNSTABLE", value.asInstanceOf[js.Any])
      
      inline def setAsync_UNSTABLEUndefined: Self = StObject.set(x, "async_UNSTABLE", js.undefined)
      
      inline def setJar(value: CookieJar): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    }
  }
}
