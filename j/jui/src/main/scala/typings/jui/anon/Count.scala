package typings.jui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /**
    * @cfg {Integer} [count=0]
    * Total number of data records subject to paging)
    */
  var count: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [pageCount=10]
    * Number of data records per page
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Integer} [screenCount=5]
    * Number of pages shown on the paging screen
    */
  var screenCount: js.UndefOr[Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Count {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    event: js.Any = null,
    pageCount: js.UndefOr[Double] = js.undefined,
    screenCount: js.UndefOr[Double] = js.undefined,
    tpl: js.Any = null
  ): Count = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(pageCount)) __obj.updateDynamic("pageCount")(pageCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCount)) __obj.updateDynamic("screenCount")(screenCount.get.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

