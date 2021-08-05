package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRendered extends StObject {
  
  var config: TableOption
  
  def reload(options: TableOption): Unit
  
  def resize(): Unit
  
  def setColsWidth(): Unit
}
object TableRendered {
  
  inline def apply(config: TableOption, reload: TableOption => Unit, resize: () => Unit, setColsWidth: () => Unit): TableRendered = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], reload = js.Any.fromFunction1(reload), resize = js.Any.fromFunction0(resize), setColsWidth = js.Any.fromFunction0(setColsWidth))
    __obj.asInstanceOf[TableRendered]
  }
  
  extension [Self <: TableRendered](x: Self) {
    
    inline def setConfig(value: TableOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setReload(value: TableOption => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
    
    inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    inline def setSetColsWidth(value: () => Unit): Self = StObject.set(x, "setColsWidth", js.Any.fromFunction0(value))
  }
}
