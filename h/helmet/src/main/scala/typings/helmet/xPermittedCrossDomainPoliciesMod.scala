package typings.helmet

import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xPermittedCrossDomainPoliciesMod {
  
  @JSImport("helmet/dist/middlewares/x-permitted-cross-domain-policies", JSImport.Default)
  @js.native
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  @JSImport("helmet/dist/middlewares/x-permitted-cross-domain-policies", JSImport.Default)
  @js.native
  def default(options: ReadonlyXPermittedCrossDo): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @js.native
  trait XPermittedCrossDomainPoliciesOptions extends StObject {
    
    var permittedPolicies: js.UndefOr[String] = js.native
  }
  object XPermittedCrossDomainPoliciesOptions {
    
    @scala.inline
    def apply(): XPermittedCrossDomainPoliciesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XPermittedCrossDomainPoliciesOptions]
    }
    
    @scala.inline
    implicit class XPermittedCrossDomainPoliciesOptionsMutableBuilder[Self <: XPermittedCrossDomainPoliciesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPermittedPolicies(value: String): Self = StObject.set(x, "permittedPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermittedPoliciesUndefined: Self = StObject.set(x, "permittedPolicies", js.undefined)
    }
  }
}
