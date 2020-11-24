package typings.hexo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autodetect extends js.Object {
  
  val auto_detect: Boolean = js.native
  
  val enable: Boolean = js.native
  
  val line_number: Boolean = js.native
  
  val tab_replace: String | Null = js.native
}
object Autodetect {
  
  @scala.inline
  def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean): Autodetect = {
    val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autodetect]
  }
  
  @scala.inline
  implicit class AutodetectOps[Self <: Autodetect] (val x: Self) extends AnyVal {
    
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
    def setAuto_detect(value: Boolean): Self = this.set("auto_detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine_number(value: Boolean): Self = this.set("line_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_replace(value: String): Self = this.set("tab_replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_replaceNull: Self = this.set("tab_replace", null)
  }
}
