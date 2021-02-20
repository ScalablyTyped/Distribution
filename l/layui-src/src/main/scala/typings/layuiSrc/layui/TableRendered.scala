package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRendered extends StObject {
  
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
  implicit class TableRenderedMutableBuilder[Self <: TableRendered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: TableOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: TableOption => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColsWidth(value: () => Unit): Self = StObject.set(x, "setColsWidth", js.Any.fromFunction0(value))
  }
}
