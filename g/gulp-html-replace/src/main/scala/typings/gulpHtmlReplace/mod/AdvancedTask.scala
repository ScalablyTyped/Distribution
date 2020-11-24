package typings.gulpHtmlReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedTask extends js.Object {
  
  var src: String | js.Array[String] = js.native
  
  var tpl: String = js.native
}
object AdvancedTask {
  
  @scala.inline
  def apply(src: String | js.Array[String], tpl: String): AdvancedTask = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tpl = tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedTask]
  }
  
  @scala.inline
  implicit class AdvancedTaskOps[Self <: AdvancedTask] (val x: Self) extends AnyVal {
    
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
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl(value: String): Self = this.set("tpl", value.asInstanceOf[js.Any])
  }
}
