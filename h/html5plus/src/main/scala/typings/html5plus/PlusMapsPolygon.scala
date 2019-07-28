package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图上显示的多边形对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsPolygon extends js.Object {
  /**
    * 获取多边形的填充色
    * 如果填充色为无色，则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getFillColor(): String = js.native
  /**
    * 获取多边形填充色的透明度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getFillOpacity(): Double = js.native
  /**
    * 获取多边形边框的宽度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLineWidth(): Double = js.native
  /**
    * 获取多边形的顶点坐标
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPath(): js.Array[_] = js.native
  /**
    * 获取多边形边框的颜色
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeColor(): String = js.native
  /**
    * 获取多边形边框的透明度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeOpacity(): Double = js.native
  /**
    * 设置多边形的填充颜色
    * 多边形默认填充颜色为无色，该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setFillColor(): Unit = js.native
  def setFillColor(color: String): Unit = js.native
  /**
    * 设置多边形填充色的透明度
    * 多边形填充色默认值为不透明。
    * 	如果设置的值不合法则保持原有的透明度；该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setFillOpacity(): Unit = js.native
  def setFillOpacity(opacity: Double): Unit = js.native
  /**
    * 设置多边形的边框宽度
    * 多边形边框的宽度默认值为5。
    * 	如果设置的值不合法则保持原有的宽度；该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLineWidth(): Unit = js.native
  def setLineWidth(width: Double): Unit = js.native
  /**
    * 设置多边形的顶点坐标
    * 该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setPath(): Unit = js.native
  def setPath(points: js.Array[_]): Unit = js.native
  /**
    * 设置多边形的颜色
    * 多边形边框默认的颜色为黑色"#000000"，该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeColor(): Unit = js.native
  def setStrokeColor(color: String): Unit = js.native
  /**
    * 设置多边形的透明度
    * 多边形边框默认值为不透明。
    * 	如果设置的值不合法则保持原有的透明度；该方法设置将导致地图中的多边形立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeOpacity(): Unit = js.native
  def setStrokeOpacity(opacity: Double): Unit = js.native
}

