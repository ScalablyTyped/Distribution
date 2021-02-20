package typings.kubeProbe

import typings.express.mod.Express
import typings.overloadProtection.mod.ProtectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kube-probe", JSImport.Namespace)
  @js.native
  def apply(app: Express): Unit = js.native
  @JSImport("kube-probe", JSImport.Namespace)
  @js.native
  def apply(app: Express, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var bypassProtection: js.UndefOr[Boolean] = js.native
    
    var livenessCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var livenessUrl: js.UndefOr[String] = js.native
    
    var protectionConfig: js.UndefOr[ProtectionConfig] = js.native
    
    var readinessCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var readinessUrl: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBypassProtection(value: Boolean): Self = StObject.set(x, "bypassProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassProtectionUndefined: Self = StObject.set(x, "bypassProtection", js.undefined)
      
      @scala.inline
      def setLivenessCallback(value: () => Unit): Self = StObject.set(x, "livenessCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLivenessCallbackUndefined: Self = StObject.set(x, "livenessCallback", js.undefined)
      
      @scala.inline
      def setLivenessUrl(value: String): Self = StObject.set(x, "livenessUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivenessUrlUndefined: Self = StObject.set(x, "livenessUrl", js.undefined)
      
      @scala.inline
      def setProtectionConfig(value: ProtectionConfig): Self = StObject.set(x, "protectionConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectionConfigUndefined: Self = StObject.set(x, "protectionConfig", js.undefined)
      
      @scala.inline
      def setReadinessCallback(value: () => Unit): Self = StObject.set(x, "readinessCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadinessCallbackUndefined: Self = StObject.set(x, "readinessCallback", js.undefined)
      
      @scala.inline
      def setReadinessUrl(value: String): Self = StObject.set(x, "readinessUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadinessUrlUndefined: Self = StObject.set(x, "readinessUrl", js.undefined)
    }
  }
}
