package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPointUpdateEventObject extends Event {
  /**
    * Options data of the update event.
    */
  var options: Double | js.Object | (js.Array[Double | String]) | Null = js.native
}

