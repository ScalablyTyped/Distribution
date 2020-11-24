package typings.materialUiCore.withStylesMod

import typings.materialUiCore.anon.Index
import typings.materialUiCore.createMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesCreator extends js.Object {
  
  def create(theme: Theme, name: String): StyleRules[String] = js.native
  
  var options: Index = js.native
  
  var themingEnabled: Boolean = js.native
}
object StylesCreator {
  
  @scala.inline
  def apply(create: (Theme, String) => StyleRules[String], options: Index, themingEnabled: Boolean): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator]
  }
  
  @scala.inline
  implicit class StylesCreatorOps[Self <: StylesCreator] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (Theme, String) => StyleRules[String]): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Index): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemingEnabled(value: Boolean): Self = this.set("themingEnabled", value.asInstanceOf[js.Any])
  }
}
