package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
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

object AnonCount {
  @scala.inline
  def apply(
    count: Int | Double = null,
    event: js.Any = null,
    pageCount: Int | Double = null,
    screenCount: Int | Double = null,
    tpl: js.Any = null
  ): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (screenCount != null) __obj.updateDynamic("screenCount")(screenCount.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

