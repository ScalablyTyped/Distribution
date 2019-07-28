package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，地理坐标信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationCoordinates extends js.Object {
  /**
    * 地理坐标信息的精确度信息
    * 数据类型对象，单位为米，其有效值必须大于0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * 海拔信息
    * 数据类型对象，如果无法获取此信息，则此值为空（null）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var altitude: js.UndefOr[Double] = js.undefined
  /**
    * 海拔的精确度信息
    * 数据类型对象，单位为米，其有效值必须大于0。如果无法获取海拔信息，则此值为空（null）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  /**
    * 表示设备移动的方向
    * 数据类型对象，范围为0到360，表示相对于正北方向的角度。如果无法获取此信息，则此值为空（null）。如果设备没有移动则此值为NaN。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var heading: js.UndefOr[Double] = js.undefined
  /**
    * 坐标纬度值
    * 数据类型对象，地理坐标中的纬度值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * 坐标经度值
    * 数据类型对象，地理坐标中的经度值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * 表示设备移动的速度
    * 数据类型对象，单位为米每秒（m/s），其有效值必须大于0。如果无法获取速度信息，则此值为空（null）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object PlusGeolocationCoordinates {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    heading: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    speed: Int | Double = null
  ): PlusGeolocationCoordinates = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusGeolocationCoordinates]
  }
}

