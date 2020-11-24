package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRendered extends js.Object {
  
  var config: TableOption = js.native
  
  def reload(options: TableOption): Unit = js.native
  
  def resize(): Unit = js.native
  
  def setColsWidth(): Unit = js.native
}
object TableRendered {
  
  @scala.inline
  def apply(config: TableOption, reload: TableOption => Unit, resize: () => Unit, setColsWidth: () => Unit): TableRendered = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], reload = js.Any.fromFunction1(reload), resize = js.Any.fromFunction0(resize), setColsWidth = js.Any.fromFunction0(setColsWidth))
    __obj.asInstanceOf[TableRendered]
  }
  
  @scala.inline
  implicit class TableRenderedOps[Self <: TableRendered] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: TableOption): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: TableOption => Unit): Self = this.set("reload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColsWidth(value: () => Unit): Self = this.set("setColsWidth", js.Any.fromFunction0(value))
  }
}
