package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地理区域
  * 有西南及东北坐标点数据组成的矩形区域。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsBounds extends js.Object {
  
  /**
    * 判断制定的坐标是否在地理区域中
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def contains(): Boolean = js.native
  def contains(point: PlusMapsPoint): Boolean = js.native
  
  /**
    * 判断两个地理区域是否相等
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def equals(): Boolean = js.native
  def equals(bounds: PlusMapsBounds): Boolean = js.native
  
  /**
    * 获取地理区域的中心点坐标
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getCenter(): PlusMapsPoint = js.native
  
  /**
    * 地理区域的东北坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getNorthEase(): PlusMapsPoint = js.native
  
  /**
    * 地理区域的西南坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getSouthWest(): PlusMapsPoint = js.native
  
  /**
    * 设置地理区域的东北坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setNorthEase(): Unit = js.native
  def setNorthEase(point: PlusMapsPoint): Unit = js.native
  
  /**
    * 设置地理区域的西南坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setSouthWest(): Unit = js.native
  def setSouthWest(point: PlusMapsPoint): Unit = js.native
}
