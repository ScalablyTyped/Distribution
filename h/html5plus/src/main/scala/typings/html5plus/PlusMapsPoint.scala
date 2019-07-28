package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Point对象用于表示地图元素的坐标
  * 常用语对地图上元素进行定位时使用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsPoint extends js.Object {
  /**
    * 判断两个坐标点是否相等
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def equals(): Boolean = js.native
  def equals(pt: PlusMapsPoint): Boolean = js.native
  /**
    * 获取坐标的纬度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLat(): Double = js.native
  /**
    * 获取坐标的经度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLng(): Double = js.native
  /**
    * 设置坐标的纬度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLat(): Unit = js.native
  /**
    * 设置坐标点的经度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLng(): Unit = js.native
  def setLng(lng: Double): Unit = js.native
}

