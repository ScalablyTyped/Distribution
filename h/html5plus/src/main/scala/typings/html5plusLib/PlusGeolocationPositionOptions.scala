package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，监听设备位置信息参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationPositionOptions extends js.Object {
  /**
    * 指定获取的定位数据坐标系类型
    * 可取以下坐标系类型：
    * 	"wgs84"：表示WGS-84坐标系；
    * 	"gcj02"：表示国测局经纬度坐标系；
    * 	"bd09"：表示百度墨卡托坐标系；
    * 	"bd09ll"：表示百度经纬度坐标系；
    * 	provider为"system"时，默认使用"wgs84"坐标系；provider为"baidu"时，默认使用"gcj02"坐标系；provider为"amap"时，默认使用"gcj02"坐标系。
    * 	如果设置的坐标系类型provider不支持，则返回错误。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coordsType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否高精确度获取位置信息
    * 高精度获取表示需要使用更多的系统资源，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否解析地址信息
    * 解析的地址信息保存到Position对象的address、addresses属性中，true表示解析地址信息，false表示不解析地址信息，返回的Position对象的address、addresses属性值为undefined，默认值为true。
    * 	如果解析地址信息失败则返回的Position对象的address、addresses属性值为null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var geocode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 获取位置信息的间隔时间
    * 单位为毫秒（ms），默认值为5000（即5秒）。调用plus.geolocation.watchPosition时为更新位置信息的间隔时间。
    * 	注意：在不同定位模块下支持范围值可能不同，如百度定位模块的间隔范围为大于等于1秒，如果设置的值小于最小值则使用最小值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * 优先使用的定位模块
    * 可取以下供应者：
    * 	"system"：表示系统定位模块，支持wgs84坐标系；
    * 	"baidu"：表示百度定位模块，支持gcj02/bd09/bd09ll坐标系；
    * 	"amap"：表示高德定位模板，支持gcj02坐标系。
    * 	默认值按以下优先顺序获取（amap&gt;baidu&gt;system），若指定的provider不存在或无效则返回错误回调。
    * 	注意：百度/高德定位模块需要配置百度/高德地图相关参数才能正常使用。
    * - system: 优先使用系统定位模块
    * - baidu: 优先使用百度定位模块
    * - amap: 优先使用高德定位模块
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var provider: js.UndefOr[
    html5plusLib.html5plusLibStrings.system | html5plusLib.html5plusLibStrings.baidu | html5plusLib.html5plusLibStrings.amap
  ] = js.undefined
  /**
    * 获取位置信息的超时时间
    * 单位为毫秒（ms），默认值为不超时。如果在指定的时间内没有获取到位置信息则触发错误回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object PlusGeolocationPositionOptions {
  @scala.inline
  def apply(
    coordsType: java.lang.String = null,
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    geocode: js.UndefOr[scala.Boolean] = js.undefined,
    maximumAge: scala.Int | scala.Double = null,
    provider: html5plusLib.html5plusLibStrings.system | html5plusLib.html5plusLibStrings.baidu | html5plusLib.html5plusLibStrings.amap = null,
    timeout: scala.Int | scala.Double = null
  ): PlusGeolocationPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (coordsType != null) __obj.updateDynamic("coordsType")(coordsType)
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (!js.isUndefined(geocode)) __obj.updateDynamic("geocode")(geocode)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusGeolocationPositionOptions]
  }
}

