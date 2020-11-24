package typings.materialUiStyles.getStylesCreatorGetStylesCreatorMod

import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends js.Object {
  
  def create(theme: Theme, name: String): StyleRules[Props, ClassKey] = js.native
  
  var themingEnabled: Boolean = js.native
}
object StylesCreator {
  
  @scala.inline
  def apply[Theme, Props /* <: js.Object */, ClassKey /* <: String */](create: (Theme, String) => StyleRules[Props, ClassKey], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
  }
  
  @scala.inline
  implicit class StylesCreatorOps[Self <: StylesCreator[_, _, _], Theme, Props /* <: js.Object */, ClassKey /* <: String */] (val x: Self with (StylesCreator[Theme, Props, ClassKey])) extends AnyVal {
    
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
    def setCreate(value: (Theme, String) => StyleRules[Props, ClassKey]): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThemingEnabled(value: Boolean): Self = this.set("themingEnabled", value.asInstanceOf[js.Any])
  }
}
