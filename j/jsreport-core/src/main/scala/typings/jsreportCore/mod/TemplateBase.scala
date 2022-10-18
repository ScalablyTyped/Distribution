package typings.jsreportCore.mod

import typings.jsreportCore.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateBase extends StObject {
  
  /** template for the engine */
  var content: js.UndefOr[String] = js.undefined
  
  /** templating engine used to assemble document */
  var engine: Engine | String
  
  /** javascript helper functions used by templating engines */
  var helpers: js.UndefOr[Helpers] = js.undefined
  
  var pathToEngine: js.UndefOr[String] = js.undefined
  
  /** recipe used for printing previously assembled document */
  var recipe: Recipe | String
  
  var unoconv: js.UndefOr[Format] = js.undefined
}
object TemplateBase {
  
  inline def apply(engine: Engine | String, recipe: Recipe | String): TemplateBase = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBase]
  }
  
  extension [Self <: TemplateBase](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEngine(value: Engine | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setHelpers(value: Helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setPathToEngine(value: String): Self = StObject.set(x, "pathToEngine", value.asInstanceOf[js.Any])
    
    inline def setPathToEngineUndefined: Self = StObject.set(x, "pathToEngine", js.undefined)
    
    inline def setRecipe(value: Recipe | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setUnoconv(value: Format): Self = StObject.set(x, "unoconv", value.asInstanceOf[js.Any])
    
    inline def setUnoconvUndefined: Self = StObject.set(x, "unoconv", js.undefined)
  }
}
