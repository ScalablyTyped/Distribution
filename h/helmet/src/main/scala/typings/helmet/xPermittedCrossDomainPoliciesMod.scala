package typings.helmet

import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xPermittedCrossDomainPoliciesMod {
  
  @JSImport("helmet/dist/middlewares/x-permitted-cross-domain-policies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  @scala.inline
  def default(options: ReadonlyXPermittedCrossDo): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait XPermittedCrossDomainPoliciesOptions extends StObject {
    
    var permittedPolicies: js.UndefOr[String] = js.undefined
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
