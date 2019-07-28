package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图上显示的气泡对象
  * 此对象不能直接添加到地图上显示，只可关联到地图标点覆盖物上，用户点击标点时弹出显示。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsBubble extends js.Object {
  /**
    * 用户点击气泡事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onclick: js.UndefOr[js.Function1[/* result */ PlusMapsOverlay, Unit]] = js.native
  /**
    * 获取气泡所属的标点对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def belongMarker(): PlusMapsMarker = js.native
  /**
    * 获取气泡上显示的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLabel(): String = js.native
  /**
    * 从图片加载气泡显示的内容
    * 通过加载图片来自定义气泡显示的内容，加载图片后将清空气泡使用的图标及文字内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def loadImage(): Unit = js.native
  def loadImage(path: String): Unit = js.native
  /**
    * 从图片数据加载气泡显示的内容
    * 通过加载图片数据来自定义气泡显示的内容，加载图片后将清空气泡使用的图标及文字内容。
    * 	图片数据可通过Canvas自定义绘制后调用toDataURL来获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def loadImageDataURL(): Unit = js.native
  def loadImageDataURL(data: String): Unit = js.native
  /**
    * 设置气泡上显示的图标
    * 若为设置则无默认图标，已添加的显示的气泡在设置新值后将在地图上立即更新内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setIcon(): Unit = js.native
  def setIcon(icon: String): Unit = js.native
  /**
    * 设置气泡上显示的文字内容
    * 若未设置则不显示文字（默认为空字符串），已添加的显示的气泡在设置新值后将在地图上立即更新内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLabel(): Unit = js.native
  def setLabel(label: String): Unit = js.native
}

