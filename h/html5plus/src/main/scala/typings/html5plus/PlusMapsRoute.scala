package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图中的路线对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsRoute extends js.Object {
  /**
    * 路线总距离
    * 路线从起始点到终点的距离，单位为米。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * 路线终点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var endPoint: js.UndefOr[PlusMapsPoint] = js.undefined
  /**
    * 路线坐标点段数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointCount: js.UndefOr[PlusMapsPoint] = js.undefined
  /**
    * 路线的地理坐标点数组
    * 路线的地理坐标点数组，数组中保存Point对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointList: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 线路的提示信息
    * 线路提示信息，没有提示信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var routeTip: js.UndefOr[String] = js.undefined
  /**
    * 路线起点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var startPoint: js.UndefOr[PlusMapsPoint] = js.undefined
}

object PlusMapsRoute {
  @scala.inline
  def apply(
    distance: js.UndefOr[Double] = js.undefined,
    endPoint: PlusMapsPoint = null,
    pointCount: PlusMapsPoint = null,
    pointList: js.Array[_] = null,
    routeTip: String = null,
    startPoint: PlusMapsPoint = null
  ): PlusMapsRoute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (pointCount != null) __obj.updateDynamic("pointCount")(pointCount.asInstanceOf[js.Any])
    if (pointList != null) __obj.updateDynamic("pointList")(pointList.asInstanceOf[js.Any])
    if (routeTip != null) __obj.updateDynamic("routeTip")(routeTip.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsRoute]
  }
}

