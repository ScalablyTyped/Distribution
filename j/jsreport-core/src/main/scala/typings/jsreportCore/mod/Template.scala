package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  var content: String = js.native
  
  var engine: Engine | String = js.native
  
  var helpers: Helpers = js.native
  
  var recipe: Recipe | String = js.native
}
object Template {
  
  @scala.inline
  def apply(content: String, engine: Engine | String, helpers: Helpers, recipe: Recipe | String): Template = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: Engine | String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpers(value: Helpers): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipe(value: Recipe | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
  }
}
