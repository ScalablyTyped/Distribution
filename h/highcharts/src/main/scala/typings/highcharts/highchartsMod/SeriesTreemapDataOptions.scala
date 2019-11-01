package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTreemapDataOptions extends js.Object {
  /**
    * (Highcharts) Use this option to build a tree structure. The value should
    * be the id of the point which is the parent. If no points has a matching
    * id, or this option is undefined, then the parent will be set to the root.
    */
  var parent: js.UndefOr[String] = js.undefined
}

object SeriesTreemapDataOptions {
  @scala.inline
  def apply(parent: String = null): SeriesTreemapDataOptions = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[SeriesTreemapDataOptions]
  }
}

