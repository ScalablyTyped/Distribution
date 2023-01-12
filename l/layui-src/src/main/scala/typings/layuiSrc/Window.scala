package typings.layuiSrc

import typings.layuiSrc.Layui.LAY_
import typings.layuiSrc.Layui.Lay
import typings.layuiSrc.Layui.Layer
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /**
    * 查找 DOM 作为返回实例的操作对象
    * @param [selector] 选择器 原始dom或者选择器串
    */
  def lay(): LAY_
  def lay(selector: String): LAY_
  def lay(selector: HTMLElement): LAY_
  @JSName("lay")
  var lay_Original: Lay
  
  var layer: Layer
  
  var layui: Layui
}
object Window {
  
  inline def apply(lay: Lay, layer: Layer, layui: Layui): Window = {
    val __obj = js.Dynamic.literal(lay = lay.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layui = layui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setLay(value: Lay): Self = StObject.set(x, "lay", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayui(value: Layui): Self = StObject.set(x, "layui", value.asInstanceOf[js.Any])
  }
}
