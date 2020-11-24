package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyExtend extends js.Object {
  
  @JSName("apply")
  var apply: `true` = js.native
  
  var extend: js.UndefOr[Boolean] = js.native
}
object ApplyExtend {
  
  @scala.inline
  def apply(apply: `true`): ApplyExtend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyExtend]
  }
  
  @scala.inline
  implicit class ApplyExtendOps[Self <: ApplyExtend] (val x: Self) extends AnyVal {
    
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
    def setApply(value: `true`): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: Boolean): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
  }
}
