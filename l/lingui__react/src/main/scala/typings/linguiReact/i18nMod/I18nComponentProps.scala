package typings.linguiReact.i18nMod

import typings.linguiReact.anon.I18n
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nComponentProps extends js.Object {
  
  def children(hasI18nI18nHash: I18n): ReactNode = js.native
  
  var update: js.UndefOr[Boolean] = js.native
  
  var withHash: js.UndefOr[Boolean] = js.native
}
object I18nComponentProps {
  
  @scala.inline
  def apply(children: I18n => ReactNode): I18nComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[I18nComponentProps]
  }
  
  @scala.inline
  implicit class I18nComponentPropsOps[Self <: I18nComponentProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: I18n => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWithHash(value: Boolean): Self = this.set("withHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithHash: Self = this.set("withHash", js.undefined)
  }
}
