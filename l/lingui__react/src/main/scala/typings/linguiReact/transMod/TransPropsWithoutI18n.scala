package typings.linguiReact.transMod

import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransPropsWithoutI18n extends RenderProps {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var components: js.UndefOr[js.Array[ReactElement]] = js.native
  
  var defaults: js.UndefOr[String] = js.native
  
  var formats: js.UndefOr[js.Object] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Object] = js.native
}
object TransPropsWithoutI18n {
  
  @scala.inline
  def apply(): TransPropsWithoutI18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransPropsWithoutI18n]
  }
  
  @scala.inline
  implicit class TransPropsWithoutI18nOps[Self <: TransPropsWithoutI18n] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: ReactElement*): Self = this.set("components", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[ReactElement]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDefaults(value: String): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Object): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setValues(value: js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
