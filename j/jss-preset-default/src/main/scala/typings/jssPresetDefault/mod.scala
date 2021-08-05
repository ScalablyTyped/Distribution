package typings.jssPresetDefault

import typings.jss.mod.JssOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jss-preset-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[JssOptions]
  inline def default(options: Options): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[JssOptions]
  
  trait Options extends StObject {
    
    var defaultUnit: js.UndefOr[typings.jssPluginDefaultUnit.mod.Options] = js.undefined
    
    var observable: js.UndefOr[typings.jssPluginRuleValueObservable.mod.Options] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultUnit(value: typings.jssPluginDefaultUnit.mod.Options): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      inline def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      inline def setObservable(value: typings.jssPluginRuleValueObservable.mod.Options): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      
      inline def setObservableUndefined: Self = StObject.set(x, "observable", js.undefined)
    }
  }
}
