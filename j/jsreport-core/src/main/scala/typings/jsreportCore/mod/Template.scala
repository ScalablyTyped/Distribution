package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template
  extends StObject
     with TemplateBase {
  
  /** template for the engine */
  @JSName("content")
  var content_Template: String
}
object Template {
  
  inline def apply(content: String, engine: Engine | String, recipe: Recipe | String): Template = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  extension [Self <: Template](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
