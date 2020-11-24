package typings.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  /** block user activity for the page */
  var blockUI: js.UndefOr[JQBlockUIStatic] = js.native
  
  /** unblock the page */
  var unblockUI: js.UndefOr[JQBlockUIStatic] = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
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
    def setBlockUI(value: JQBlockUIStatic): Self = this.set("blockUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockUI: Self = this.set("blockUI", js.undefined)
    
    @scala.inline
    def setUnblockUI(value: JQBlockUIStatic): Self = this.set("unblockUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnblockUI: Self = this.set("unblockUI", js.undefined)
  }
}
