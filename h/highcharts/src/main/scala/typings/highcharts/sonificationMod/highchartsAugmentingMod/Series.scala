package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /**
    * Sonify a series.
    *
    * @param options
    *        The options for sonifying this series.
    */
  def sonify(options: SonifySeriesOptionsObject): Unit
}

object Series {
  @scala.inline
  def apply(sonify: SonifySeriesOptionsObject => Unit): Series = {
    val __obj = js.Dynamic.literal(sonify = js.Any.fromFunction1(sonify))
  
    __obj.asInstanceOf[Series]
  }
}

