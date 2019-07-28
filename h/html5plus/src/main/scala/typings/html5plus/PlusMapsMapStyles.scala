package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图控件对象的参数
  * 设置地图对象显示时使用的参数，如地图的中心位置、缩放级别等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsMapStyles extends js.Object {
  /**
    * 地图的中心位置
    * 未设置则使用地图的默认中心点（由地图供应商确定）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var center: js.UndefOr[PlusMapsPoint] = js.undefined
  /**
    * 地图控件的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * 地图控件左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度；
    * 		自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 地图控件在Webview窗口的布局模式
    * 可取值：
    * 		"static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    * 		"absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    * 	默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * 地图控件左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 地图的是否显示交通信息
    * true表示显示地图的交通信息图层，false则不显示，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var traffic: js.UndefOr[Boolean] = js.undefined
  /**
    * 地图的视图类型
    * 可设置普通街道视图、卫星视图，默认值为普通街道视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var `type`: js.UndefOr[PlusMapsMapType] = js.undefined
  /**
    * 地图控件的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var width: js.UndefOr[String] = js.undefined
  /**
    * 地图的缩放级别
    * 有效范围为1-22，默认值为12，设置无效的值则使用默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var zoom: js.UndefOr[Double] = js.undefined
  /**
    * 是否显示地图的内置缩放控件
    * true表示显示地图的内置缩放控件，false则不显示，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var zoomControls: js.UndefOr[Boolean] = js.undefined
}

object PlusMapsMapStyles {
  @scala.inline
  def apply(
    center: PlusMapsPoint = null,
    height: String = null,
    left: String = null,
    position: String = null,
    top: String = null,
    traffic: js.UndefOr[Boolean] = js.undefined,
    `type`: PlusMapsMapType = null,
    width: String = null,
    zoom: Int | Double = null,
    zoomControls: js.UndefOr[Boolean] = js.undefined
  ): PlusMapsMapStyles = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (position != null) __obj.updateDynamic("position")(position)
    if (top != null) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(traffic)) __obj.updateDynamic("traffic")(traffic)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControls)) __obj.updateDynamic("zoomControls")(zoomControls)
    __obj.asInstanceOf[PlusMapsMapStyles]
  }
}

