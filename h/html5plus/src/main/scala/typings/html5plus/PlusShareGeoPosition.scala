package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，用户位置信息
  * GeoPosition对象用于表示用户分享消息时的位置信息。用于标识分享操作时用户的位置信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareGeoPosition extends js.Object {
  /**
    * 用户位置的纬度坐标信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * 用户位置的经度坐标信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var longitude: js.UndefOr[Double] = js.undefined
}

object PlusShareGeoPosition {
  @scala.inline
  def apply(latitude: js.UndefOr[Double] = js.undefined, longitude: js.UndefOr[Double] = js.undefined): PlusShareGeoPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusShareGeoPosition]
  }
}

