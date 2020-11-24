package typings.ionicCore.contentInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBaseDetail extends js.Object {
  
  var isScrolling: Boolean = js.native
}
object ScrollBaseDetail {
  
  @scala.inline
  def apply(isScrolling: Boolean): ScrollBaseDetail = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBaseDetail]
  }
  
  @scala.inline
  implicit class ScrollBaseDetailOps[Self <: ScrollBaseDetail] (val x: Self) extends AnyVal {
    
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
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
  }
}
