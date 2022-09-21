package typings.layuiSrc.anon

import typings.layuiSrc.Layui.SliderOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetValue extends StObject {
  
  var config: SliderOption = js.native
  
  /**
    * 改变指定滑块实例的数值
    * @param [value]
    * @param [index] 若滑块开启了范围（range: true） 则index需要0和1
    */
  def setValue(value: Any): Unit = js.native
  def setValue(value: Any, index: Double): Unit = js.native
}
