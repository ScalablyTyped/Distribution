package typings.imageminSvgo

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin-svgo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * SVGO imagemin plugin
    */
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SvgoOptions * / any */ trait Options extends StObject {
    
    /**
      * Pass over SVGs multiple times to ensure all optimizations are applied
      * @default true
      */
    var multipass: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMultipass(value: Boolean): Self = StObject.set(x, "multipass", value.asInstanceOf[js.Any])
      
      inline def setMultipassUndefined: Self = StObject.set(x, "multipass", js.undefined)
    }
  }
}
