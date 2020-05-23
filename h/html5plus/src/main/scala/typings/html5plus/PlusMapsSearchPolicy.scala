package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 检索策略类型
  * 在线路检索时设置检索策略时使用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsSearchPolicy extends js.Object {
  /**
    * 最短距离优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_DIS_FIRST: js.UndefOr[Double] = js.undefined
  /**
    * 最少费用优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_FEE_FIRST: js.UndefOr[Double] = js.undefined
  /**
    * 无高速公路线路
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_NO_EXPRESSWAY: js.UndefOr[Double] = js.undefined
  /**
    * 选择车票花销最少优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_FEE_FIRST: js.UndefOr[Double] = js.undefined
  /**
    * 时间优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TIME_FIRST: js.UndefOr[Double] = js.undefined
  /**
    * 最少换乘优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TRANSFER_FIRST: js.UndefOr[Double] = js.undefined
  /**
    * 最少步行距离优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_WALK_FIRST: js.UndefOr[Double] = js.undefined
}

object PlusMapsSearchPolicy {
  @scala.inline
  def apply(
    DRIVING_DIS_FIRST: js.UndefOr[Double] = js.undefined,
    DRIVING_FEE_FIRST: js.UndefOr[Double] = js.undefined,
    DRIVING_NO_EXPRESSWAY: js.UndefOr[Double] = js.undefined,
    TRANSIT_FEE_FIRST: js.UndefOr[Double] = js.undefined,
    TRANSIT_TIME_FIRST: js.UndefOr[Double] = js.undefined,
    TRANSIT_TRANSFER_FIRST: js.UndefOr[Double] = js.undefined,
    TRANSIT_WALK_FIRST: js.UndefOr[Double] = js.undefined
  ): PlusMapsSearchPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DRIVING_DIS_FIRST)) __obj.updateDynamic("DRIVING_DIS_FIRST")(DRIVING_DIS_FIRST.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DRIVING_FEE_FIRST)) __obj.updateDynamic("DRIVING_FEE_FIRST")(DRIVING_FEE_FIRST.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DRIVING_NO_EXPRESSWAY)) __obj.updateDynamic("DRIVING_NO_EXPRESSWAY")(DRIVING_NO_EXPRESSWAY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TRANSIT_FEE_FIRST)) __obj.updateDynamic("TRANSIT_FEE_FIRST")(TRANSIT_FEE_FIRST.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TRANSIT_TIME_FIRST)) __obj.updateDynamic("TRANSIT_TIME_FIRST")(TRANSIT_TIME_FIRST.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TRANSIT_TRANSFER_FIRST)) __obj.updateDynamic("TRANSIT_TRANSFER_FIRST")(TRANSIT_TRANSFER_FIRST.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TRANSIT_WALK_FIRST)) __obj.updateDynamic("TRANSIT_WALK_FIRST")(TRANSIT_WALK_FIRST.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsSearchPolicy]
  }
}

