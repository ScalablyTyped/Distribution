package typings.jsreportJsrender

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportJsrender.jsreportJsrenderStrings.jsrender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-jsrender", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var engine: jsrender | String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(engine: jsrender | String): Template = {
        val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEngine(value: jsrender | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      }
    }
  }
}
