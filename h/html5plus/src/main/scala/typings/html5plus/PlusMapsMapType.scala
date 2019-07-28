package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图视图类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsMapType extends js.Object {
  /**
    * 普通街道视图类型
    * 地图视图类型常量，普通街道视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_NORMAL: js.UndefOr[Double] = js.undefined
  /**
    * 卫星视图
    * 地图视图类型常量，卫星视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_SATELLITE: js.UndefOr[Double] = js.undefined
}

object PlusMapsMapType {
  @scala.inline
  def apply(MAPTYPE_NORMAL: Int | Double = null, MAPTYPE_SATELLITE: Int | Double = null): PlusMapsMapType = {
    val __obj = js.Dynamic.literal()
    if (MAPTYPE_NORMAL != null) __obj.updateDynamic("MAPTYPE_NORMAL")(MAPTYPE_NORMAL.asInstanceOf[js.Any])
    if (MAPTYPE_SATELLITE != null) __obj.updateDynamic("MAPTYPE_SATELLITE")(MAPTYPE_SATELLITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsMapType]
  }
}

