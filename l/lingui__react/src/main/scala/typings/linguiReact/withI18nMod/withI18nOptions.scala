package typings.linguiReact.withI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withI18nOptions extends js.Object {
  
  var update: js.UndefOr[Boolean] = js.native
  
  var withHash: js.UndefOr[Boolean] = js.native
  
  var withRef: js.UndefOr[Boolean] = js.native
}
object withI18nOptions {
  
  @scala.inline
  def apply(): withI18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[withI18nOptions]
  }
  
  @scala.inline
  implicit class withI18nOptionsOps[Self <: withI18nOptions] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWithHash(value: Boolean): Self = this.set("withHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithHash: Self = this.set("withHash", js.undefined)
    
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
}
