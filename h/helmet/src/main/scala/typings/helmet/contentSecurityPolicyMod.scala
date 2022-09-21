package typings.helmet

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSecurityPolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/content-security-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("helmet/dist/types/middlewares/content-security-policy", JSImport.Default)
  @js.native
  val default: ContentSecurityPolicy = js.native
  
  @JSImport("helmet/dist/types/middlewares/content-security-policy", "dangerouslyDisableDefaultSrc")
  @js.native
  val dangerouslyDisableDefaultSrc: js.Symbol = js.native
  
  inline def getDefaultDirectives(): StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectives")().asInstanceOf[StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]]]
  
  @js.native
  trait ContentSecurityPolicy extends StObject {
    
    def apply(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    def apply(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    
    var dangerouslyDisableDefaultSrc: js.Symbol = js.native
    
    def getDefaultDirectives(): StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]] = js.native
    @JSName("getDefaultDirectives")
    var getDefaultDirectives_Original: js.Function0[StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
  }
  
  type ContentSecurityPolicyDirectiveValue = String | ContentSecurityPolicyDirectiveValueFunction
  
  type ContentSecurityPolicyDirectiveValueFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], String]
  
  trait ContentSecurityPolicyOptions extends StObject {
    
    var directives: js.UndefOr[
        Record[String, Null | js.Iterable[ContentSecurityPolicyDirectiveValue] | js.Symbol]
      ] = js.undefined
    
    var reportOnly: js.UndefOr[Boolean] = js.undefined
    
    var useDefaults: js.UndefOr[Boolean] = js.undefined
  }
  object ContentSecurityPolicyOptions {
    
    inline def apply(): ContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentSecurityPolicyOptions]
    }
    
    extension [Self <: ContentSecurityPolicyOptions](x: Self) {
      
      inline def setDirectives(value: Record[String, Null | js.Iterable[ContentSecurityPolicyDirectiveValue] | js.Symbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
      
      inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
}
