package typings.koa

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: Any
  }
  object Body {
    
    inline def apply(body: Any): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyResponseBodyT[ResponseBodyT] extends StObject {
    
    var body: ResponseBodyT
  }
  object BodyResponseBodyT {
    
    inline def apply[ResponseBodyT](body: ResponseBodyT): BodyResponseBodyT[ResponseBodyT] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyResponseBodyT[ResponseBodyT]]
    }
    
    extension [Self <: BodyResponseBodyT[?], ResponseBodyT](x: Self & BodyResponseBodyT[ResponseBodyT]) {
      
      inline def setBody(value: ResponseBodyT): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  trait Env extends StObject {
    
    var env: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxIpsCount: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[Boolean] = js.undefined
    
    var proxyIpHeader: js.UndefOr[String] = js.undefined
    
    var subdomainOffset: js.UndefOr[Double] = js.undefined
  }
  object Env {
    
    inline def apply(): Env = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Env]
    }
    
    extension [Self <: Env](x: Self) {
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setMaxIpsCount(value: Double): Self = StObject.set(x, "maxIpsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxIpsCountUndefined: Self = StObject.set(x, "maxIpsCount", js.undefined)
      
      inline def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyIpHeader(value: String): Self = StObject.set(x, "proxyIpHeader", value.asInstanceOf[js.Any])
      
      inline def setProxyIpHeaderUndefined: Self = StObject.set(x, "proxyIpHeader", js.undefined)
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSubdomainOffset(value: Double): Self = StObject.set(x, "subdomainOffset", value.asInstanceOf[js.Any])
      
      inline def setSubdomainOffsetUndefined: Self = StObject.set(x, "subdomainOffset", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: Any): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Double): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Double, msg: String): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Double, msg: String, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Double, msg: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Double, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Unit, msg: String): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Unit, msg: String, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Unit, msg: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    def apply(value: Any, status: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
  }
  
  trait Response[StateT, ResponseBodyT] extends StObject {
    
    var body: ResponseBodyT
    
    var response: BodyResponseBodyT[ResponseBodyT]
    
    var state: StateT
  }
  object Response {
    
    inline def apply[StateT, ResponseBodyT](body: ResponseBodyT, response: BodyResponseBodyT[ResponseBodyT], state: StateT): Response[StateT, ResponseBodyT] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[StateT, ResponseBodyT]]
    }
    
    extension [Self <: Response[?, ?], StateT, ResponseBodyT](x: Self & (Response[StateT, ResponseBodyT])) {
      
      inline def setBody(value: ResponseBodyT): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: BodyResponseBodyT[ResponseBodyT]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setState(value: StateT): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
