package typings.httpsnippet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInfo[C /* <: String */] extends js.Object {
  
  var default: C = js.native
  
  var extname: String = js.native
  
  var key: String = js.native
  
  var title: String = js.native
}
object TargetInfo {
  
  @scala.inline
  def apply[C /* <: String */](default: C, extname: String, key: String, title: String): TargetInfo[C] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo[C]]
  }
  
  @scala.inline
  implicit class TargetInfoOps[Self <: TargetInfo[_], C /* <: String */] (val x: Self with TargetInfo[C]) extends AnyVal {
    
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
    def setDefault(value: C): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
