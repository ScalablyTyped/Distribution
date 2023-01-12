package typings.jsreportScripts

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Recipe
import typings.jsreportCore.mod.Template
import typings.jsreportScripts.jsreportScriptsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(cfg: Configuration): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(cfg.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-scripts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var allowedModules: js.UndefOr[js.Array[String] | Asterisk] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setAllowedModules(value: js.Array[String] | Asterisk): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      inline def setAllowedModulesUndefined: Self = StObject.set(x, "allowedModules", js.undefined)
      
      inline def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value*))
    }
  }
  
  trait ScriptsTemplate
    extends StObject
       with Template {
    
    var scripts: js.UndefOr[js.Array[TemplateScript]] = js.undefined
  }
  object ScriptsTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: Recipe | String): ScriptsTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptsTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptsTemplate] (val x: Self) extends AnyVal {
      
      inline def setScripts(value: js.Array[TemplateScript]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setScriptsVarargs(value: TemplateScript*): Self = StObject.set(x, "scripts", js.Array(value*))
    }
  }
  
  trait TemplateScript extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var shortid: js.UndefOr[String] = js.undefined
  }
  object TemplateScript {
    
    inline def apply(): TemplateScript = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateScript] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShortid(value: String): Self = StObject.set(x, "shortid", value.asInstanceOf[js.Any])
      
      inline def setShortidUndefined: Self = StObject.set(x, "shortid", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var ScriptsTemplate: typings.jsreportScripts.mod.ScriptsTemplate
    }
    object TemplateRegistry {
      
      inline def apply(ScriptsTemplate: ScriptsTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(ScriptsTemplate = ScriptsTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
        
        inline def setScriptsTemplate(value: ScriptsTemplate): Self = StObject.set(x, "ScriptsTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
