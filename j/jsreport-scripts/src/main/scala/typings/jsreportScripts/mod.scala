package typings.jsreportScripts

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportScripts.jsreportScriptsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-scripts", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-scripts", JSImport.Namespace)
  @js.native
  def apply(cfg: Configuration): ExtensionDefinition = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    var allowedModules: js.UndefOr[js.Array[String] | Asterisk] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedModules(value: js.Array[String] | Asterisk): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModulesUndefined: Self = StObject.set(x, "allowedModules", js.undefined)
      
      @scala.inline
      def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TemplateScript extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var shortid: js.UndefOr[String] = js.native
  }
  object TemplateScript {
    
    @scala.inline
    def apply(): TemplateScript = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateScript]
    }
    
    @scala.inline
    implicit class TemplateScriptMutableBuilder[Self <: TemplateScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShortid(value: String): Self = StObject.set(x, "shortid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortidUndefined: Self = StObject.set(x, "shortid", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var scripts: js.UndefOr[js.Array[TemplateScript]] = js.native
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
        def setScripts(value: js.Array[TemplateScript]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
        
        @scala.inline
        def setScriptsVarargs(value: TemplateScript*): Self = StObject.set(x, "scripts", js.Array(value :_*))
      }
    }
  }
}
