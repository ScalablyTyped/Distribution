package typings.kubeProbe

import typings.express.mod.Express
import typings.overloadProtection.mod.ProtectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Express): Unit = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(app: Express, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("kube-probe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var bypassProtection: js.UndefOr[Boolean] = js.undefined
    
    var livenessCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var livenessUrl: js.UndefOr[String] = js.undefined
    
    var protectionConfig: js.UndefOr[ProtectionConfig] = js.undefined
    
    var readinessCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var readinessUrl: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBypassProtection(value: Boolean): Self = StObject.set(x, "bypassProtection", value.asInstanceOf[js.Any])
      
      inline def setBypassProtectionUndefined: Self = StObject.set(x, "bypassProtection", js.undefined)
      
      inline def setLivenessCallback(value: () => Unit): Self = StObject.set(x, "livenessCallback", js.Any.fromFunction0(value))
      
      inline def setLivenessCallbackUndefined: Self = StObject.set(x, "livenessCallback", js.undefined)
      
      inline def setLivenessUrl(value: String): Self = StObject.set(x, "livenessUrl", value.asInstanceOf[js.Any])
      
      inline def setLivenessUrlUndefined: Self = StObject.set(x, "livenessUrl", js.undefined)
      
      inline def setProtectionConfig(value: ProtectionConfig): Self = StObject.set(x, "protectionConfig", value.asInstanceOf[js.Any])
      
      inline def setProtectionConfigUndefined: Self = StObject.set(x, "protectionConfig", js.undefined)
      
      inline def setReadinessCallback(value: () => Unit): Self = StObject.set(x, "readinessCallback", js.Any.fromFunction0(value))
      
      inline def setReadinessCallbackUndefined: Self = StObject.set(x, "readinessCallback", js.undefined)
      
      inline def setReadinessUrl(value: String): Self = StObject.set(x, "readinessUrl", value.asInstanceOf[js.Any])
      
      inline def setReadinessUrlUndefined: Self = StObject.set(x, "readinessUrl", js.undefined)
    }
  }
}
