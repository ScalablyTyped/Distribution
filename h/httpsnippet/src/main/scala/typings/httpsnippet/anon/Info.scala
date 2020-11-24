package typings.httpsnippet.anon

import typings.httpsnippet.mod.TargetInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info[C /* <: String */] extends js.Object {
  
  var info: TargetInfo[C] = js.native
}
object Info {
  
  @scala.inline
  def apply[C /* <: String */](info: TargetInfo[C]): Info[C] = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info[C]]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info[_], C /* <: String */] (val x: Self with Info[C]) extends AnyVal {
    
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
    def setInfo(value: TargetInfo[C]): Self = this.set("info", value.asInstanceOf[js.Any])
  }
}
