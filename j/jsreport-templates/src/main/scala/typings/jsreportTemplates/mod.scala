package typings.jsreportTemplates

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
    }
    object Template {
      
      @scala.inline
      def apply(): Template = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
