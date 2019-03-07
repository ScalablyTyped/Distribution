package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图上显示的圆圈对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsCircle extends js.Object {
  /**
    * 获取圆圈中心点的坐标
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getCenter(): PlusMapsPoint = js.native
  /**
    * 获取圆圈的填充颜色
    * 如果填充颜色为无色，则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getFillColor(): java.lang.String = js.native
  /**
    * 获取圆圈填充色的透明度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getFillOpacity(): scala.Double = js.native
  /**
    * 获取圆圈边框的线条宽度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLineWidth(): scala.Double = js.native
  /**
    * 获取圆圈的半径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getRadius(): scala.Double = js.native
  /**
    * 获取圆圈的边框颜色
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeColor(): java.lang.String = js.native
  /**
    * 获取圆圈边框的透明度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getStrokeOpacity(): scala.Double = js.native
  /**
    * 设置圆圈中心点的经纬度坐标
    * 该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setCenter(): scala.Unit = js.native
  def setCenter(point: PlusMapsPoint): scala.Unit = js.native
  /**
    * 设置圆圈的填充颜色
    * 圆圈默认的圆圈填充颜色为无色，该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setFillColor(): scala.Unit = js.native
  def setFillColor(color: java.lang.String): scala.Unit = js.native
  /**
    * 设置圆圈填充颜色的透明度
    * 圆圈默认值为不透明。
    * 	如果设置的值不合法则保持原有的透明度；该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setFillOpacity(): scala.Unit = js.native
  def setFillOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
    * 设置圆圈边框的线条宽度
    * 圆圈边框的默认值为5。
    * 	如果设置的值不合法则保持原有的宽度；该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLineWidth(): scala.Unit = js.native
  def setLineWidth(width: scala.Double): scala.Unit = js.native
  /**
    * 设置圆圈的半径，单位为米
    * 该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setRadius(): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  /**
    * 设置圆圈的边框颜色
    * 圆圈默认的圆圈边框颜色为黑色"#000000"，该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeColor(): scala.Unit = js.native
  def setStrokeColor(color: java.lang.String): scala.Unit = js.native
  /**
    * 设置圆圈的边框颜色
    * 圆圈默认值为不透明。
    * 	如果设置的值不合法则保持原有的透明度；该方法设置将导致地图中的圆圈立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStrokeOpacity(): scala.Unit = js.native
  def setStrokeOpacity(opacity: scala.Double): scala.Unit = js.native
}

