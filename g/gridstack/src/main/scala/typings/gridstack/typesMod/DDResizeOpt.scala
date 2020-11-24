package typings.gridstack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDResizeOpt extends js.Object {
  
  /** do resize handle hide by default until mouse over ? - default: true */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /**
    * sides where you can resize from (ex: 'e, se, s, sw, w') - default 'se' (south-east)
    * Note: it is not recommended to resize from the top sides as weird side effect may occur.
    */
  var handles: js.UndefOr[String] = js.native
}
object DDResizeOpt {
  
  @scala.inline
  def apply(): DDResizeOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DDResizeOpt]
  }
  
  @scala.inline
  implicit class DDResizeOptOps[Self <: DDResizeOpt] (val x: Self) extends AnyVal {
    
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setHandles(value: String): Self = this.set("handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
  }
}
