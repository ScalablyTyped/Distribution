package typings.helmet

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSecurityPolicyMod {
  
  @JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ]]
    inline def apply(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ]]
    
    @JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("helmet/dist/middlewares/content-security-policy", "default.getDefaultDirectives")
    @js.native
    def getDefaultDirectives: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
    inline def getDefaultDirectives_=(x: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDirectives")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultDirectives(): StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectives")().asInstanceOf[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]]
  
  type ContentSecurityPolicyDirectiveValue = String | ContentSecurityPolicyDirectiveValueFunction
  
  type ContentSecurityPolicyDirectiveValueFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, String]
  
  type ContentSecurityPolicyDirectives = StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]
  
  trait ContentSecurityPolicyOptions extends StObject {
    
    var directives: js.UndefOr[ContentSecurityPolicyDirectives] = js.undefined
    
    var reportOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ContentSecurityPolicyOptions {
    
    inline def apply(): ContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentSecurityPolicyOptions]
    }
    
    extension [Self <: ContentSecurityPolicyOptions](x: Self) {
      
      inline def setDirectives(value: ContentSecurityPolicyDirectives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
    }
  }
}
