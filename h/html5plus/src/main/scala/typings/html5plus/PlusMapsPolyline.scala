package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图上显示的折线对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsPolyline extends js.Object {
  
  /**
    * 获取折线的线条宽度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLineWidth(): Double = js.native
  
  /**
    * 获取折线的顶点坐标
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPath(): js.Array[_] = js.native
  
  /**
    * 获取折线的颜色
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeColor(): String = js.native
  
  /**
    * 获取折线的透明度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeOpacity(): Double = js.native
  
  /**
    * 设置折线的线条宽度
    * 折线线条的宽度默认值为5。
    *     如果设置的值不合法则保持原有的宽度；该方法设置将导致地图中的折线立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLineWidth(): Unit = js.native
  def setLineWidth(width: Double): Unit = js.native
  
  /**
    * 设置折线的顶点坐标
    * 该方法设置将导致地图中的折线立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setPath(): Unit = js.native
  def setPath(points: js.Array[_]): Unit = js.native
  
  /**
    * 设置折线的颜色
    * 折线默认的颜色为黑色"#000000"，该方法设置将导致地图中的折线立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeColor(): Unit = js.native
  def setStrokeColor(color: String): Unit = js.native
  
  /**
    * 设设置折线的透明度
    * 折线默认值为不透明。
    *     如果设置的值不合法则保持原有的透明度；该方法设置将导致地图中的折线立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeOpacity(): Unit = js.native
  def setStrokeOpacity(opacity: Double): Unit = js.native
}
