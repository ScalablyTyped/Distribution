package typings.linguiReact.withI18nMod

import typings.linguiCore.mod.I18n_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withI18nProps extends js.Object {
  
  var i18n: I18n_ = js.native
  
  var i18nHash: js.UndefOr[String | Null] = js.native
}
object withI18nProps {
  
  @scala.inline
  def apply(i18n: I18n_): withI18nProps = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[withI18nProps]
  }
  
  @scala.inline
  implicit class withI18nPropsOps[Self <: withI18nProps] (val x: Self) extends AnyVal {
    
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
    def setI18n(value: I18n_): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nHash(value: String): Self = this.set("i18nHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18nHash: Self = this.set("i18nHash", js.undefined)
    
    @scala.inline
    def setI18nHashNull: Self = this.set("i18nHash", null)
  }
}
