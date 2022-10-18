package typings.helmet

import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresReferrerPolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/referrer-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def default(options: ReadonlyReferrerPolicyOpt): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait ReferrerPolicyOptions extends StObject {
    
    var policy: js.UndefOr[ReferrerPolicyToken | js.Array[ReferrerPolicyToken]] = js.undefined
  }
  object ReferrerPolicyOptions {
    
    inline def apply(): ReferrerPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferrerPolicyOptions]
    }
    
    extension [Self <: ReferrerPolicyOptions](x: Self) {
      
      inline def setPolicy(value: ReferrerPolicyToken | js.Array[ReferrerPolicyToken]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setPolicyVarargs(value: ReferrerPolicyToken*): Self = StObject.set(x, "policy", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.helmet.helmetStrings.`no-referrer`
    - typings.helmet.helmetStrings.`no-referrer-when-downgrade`
    - typings.helmet.helmetStrings.`same-origin`
    - typings.helmet.helmetStrings.origin
    - typings.helmet.helmetStrings.`strict-origin`
    - typings.helmet.helmetStrings.`origin-when-cross-origin`
    - typings.helmet.helmetStrings.`strict-origin-when-cross-origin`
    - typings.helmet.helmetStrings.`unsafe-url`
    - typings.helmet.helmetStrings._empty
  */
  trait ReferrerPolicyToken extends StObject
  object ReferrerPolicyToken {
    
    inline def _empty: typings.helmet.helmetStrings._empty = "".asInstanceOf[typings.helmet.helmetStrings._empty]
    
    inline def `no-referrer`: typings.helmet.helmetStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.helmet.helmetStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typings.helmet.helmetStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.helmet.helmetStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typings.helmet.helmetStrings.origin = "origin".asInstanceOf[typings.helmet.helmetStrings.origin]
    
    inline def `origin-when-cross-origin`: typings.helmet.helmetStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.helmet.helmetStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typings.helmet.helmetStrings.`same-origin` = "same-origin".asInstanceOf[typings.helmet.helmetStrings.`same-origin`]
    
    inline def `strict-origin`: typings.helmet.helmetStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.helmet.helmetStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typings.helmet.helmetStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.helmet.helmetStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typings.helmet.helmetStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.helmet.helmetStrings.`unsafe-url`]
  }
}
