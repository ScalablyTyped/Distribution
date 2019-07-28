package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubtitleObject extends SVGElement {
  /**
    * Modify options for the subtitle.
    *
    * @param subtitleOptions
    *        Options to modify.
    *
    * @param redraw
    *        Whether to redraw the chart after the subtitle is altered. If
    *        doing more operations on the chart, it is a good idea to set
    *        redraw to false and call Chart#redraw after.
    */
  def update(subtitleOptions: SubtitleOptions): Unit = js.native
  def update(subtitleOptions: SubtitleOptions, redraw: Boolean): Unit = js.native
}

