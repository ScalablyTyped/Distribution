package typings.helmet

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSecurityPolicyMod {
  
  object default {
    
    @JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
    @js.native
    def apply(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = js.native
    @JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
    @js.native
    def apply(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = js.native
    @JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("helmet/dist/middlewares/content-security-policy", "default.getDefaultDirectives")
    @js.native
    def getDefaultDirectives: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
    @scala.inline
    def getDefaultDirectives_=(x: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDirectives")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("helmet/dist/middlewares/content-security-policy", "getDefaultDirectives")
  @js.native
  def getDefaultDirectives(): StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]] = js.native
  
  type ContentSecurityPolicyDirectiveValue = String | ContentSecurityPolicyDirectiveValueFunction
  
  type ContentSecurityPolicyDirectiveValueFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, String]
  
  type ContentSecurityPolicyDirectives = StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]
  
  @js.native
  trait ContentSecurityPolicyOptions extends StObject {
    
    var directives: js.UndefOr[ContentSecurityPolicyDirectives] = js.native
    
    var reportOnly: js.UndefOr[Boolean] = js.native
  }
  object ContentSecurityPolicyOptions {
    
    @scala.inline
    def apply(): ContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentSecurityPolicyOptions]
    }
    
    @scala.inline
    implicit class ContentSecurityPolicyOptionsMutableBuilder[Self <: ContentSecurityPolicyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectives(value: ContentSecurityPolicyDirectives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
    }
  }
}
