package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 保存位置检索、周边检索和范围检索返回的结果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsSearchPoiResult extends js.Object {
  /**
    * 当前页的POI检索结果数
    * 当前页POI检索结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var currentNumber: js.UndefOr[Double] = js.undefined
  /**
    * 获取当前页的索引
    * 当前页的索引值，从0开始，即0表示第一页。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * 本次POI检索的总页数
    * 本次POI检索的总页数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  /**
    * 本次POI检索结果数组
    * POI检索结果数组，Array数组对象，数组内容为Position对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var poiList: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * POI检索总结果数
    * POI检索总结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var totalNumber: js.UndefOr[Double] = js.undefined
  /**
    * 获取指定索引的检索结果
    * 如果index值超出范围则返回null对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPosition(): PlusMapsPosition
}

object PlusMapsSearchPoiResult {
  @scala.inline
  def apply(
    getPosition: () => PlusMapsPosition,
    currentNumber: Int | Double = null,
    pageIndex: Int | Double = null,
    pageNumber: Int | Double = null,
    poiList: js.Array[_] = null,
    totalNumber: Int | Double = null
  ): PlusMapsSearchPoiResult = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition))
    if (currentNumber != null) __obj.updateDynamic("currentNumber")(currentNumber.asInstanceOf[js.Any])
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (poiList != null) __obj.updateDynamic("poiList")(poiList.asInstanceOf[js.Any])
    if (totalNumber != null) __obj.updateDynamic("totalNumber")(totalNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsSearchPoiResult]
  }
}

