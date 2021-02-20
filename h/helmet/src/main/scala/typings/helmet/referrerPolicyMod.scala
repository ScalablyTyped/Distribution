package typings.helmet

import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referrerPolicyMod {
  
  @JSImport("helmet/dist/middlewares/referrer-policy", JSImport.Default)
  @js.native
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  @JSImport("helmet/dist/middlewares/referrer-policy", JSImport.Default)
  @js.native
  def default(options: ReadonlyReferrerPolicyOpt): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @js.native
  trait ReferrerPolicyOptions extends StObject {
    
    var policy: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ReferrerPolicyOptions {
    
    @scala.inline
    def apply(): ReferrerPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferrerPolicyOptions]
    }
    
    @scala.inline
    implicit class ReferrerPolicyOptionsMutableBuilder[Self <: ReferrerPolicyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String | js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value :_*))
    }
  }
}
