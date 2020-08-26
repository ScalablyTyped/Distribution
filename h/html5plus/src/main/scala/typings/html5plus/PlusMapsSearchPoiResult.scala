package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 保存位置检索、周边检索和范围检索返回的结果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearchPoiResult extends js.Object {
  /**
    * 当前页的POI检索结果数
    * 当前页POI检索结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var currentNumber: js.UndefOr[Double] = js.native
  /**
    * 获取当前页的索引
    * 当前页的索引值，从0开始，即0表示第一页。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * 本次POI检索的总页数
    * 本次POI检索的总页数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * 本次POI检索结果数组
    * POI检索结果数组，Array数组对象，数组内容为Position对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var poiList: js.UndefOr[js.Array[_]] = js.native
  /**
    * POI检索总结果数
    * POI检索总结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var totalNumber: js.UndefOr[Double] = js.native
  /**
    * 获取指定索引的检索结果
    * 如果index值超出范围则返回null对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPosition(): PlusMapsPosition = js.native
}

object PlusMapsSearchPoiResult {
  @scala.inline
  def apply(getPosition: () => PlusMapsPosition): PlusMapsSearchPoiResult = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[PlusMapsSearchPoiResult]
  }
  @scala.inline
  implicit class PlusMapsSearchPoiResultOps[Self <: PlusMapsSearchPoiResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPosition(value: () => PlusMapsPosition): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentNumber(value: Double): Self = this.set("currentNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentNumber: Self = this.set("currentNumber", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    @scala.inline
    def setPoiListVarargs(value: js.Any*): Self = this.set("poiList", js.Array(value :_*))
    @scala.inline
    def setPoiList(value: js.Array[_]): Self = this.set("poiList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoiList: Self = this.set("poiList", js.undefined)
    @scala.inline
    def setTotalNumber(value: Double): Self = this.set("totalNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalNumber: Self = this.set("totalNumber", js.undefined)
  }
  
}

