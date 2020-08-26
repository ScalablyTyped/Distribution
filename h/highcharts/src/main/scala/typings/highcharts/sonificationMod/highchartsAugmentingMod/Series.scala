package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series extends js.Object {
  /**
    * Sonify a series.
    *
    * @param options
    *        The options for sonifying this series.
    */
  def sonify(options: SonifySeriesOptionsObject): Unit = js.native
}

object Series {
  @scala.inline
  def apply(sonify: SonifySeriesOptionsObject => Unit): Series = {
    val __obj = js.Dynamic.literal(sonify = js.Any.fromFunction1(sonify))
    __obj.asInstanceOf[Series]
  }
  @scala.inline
  implicit class SeriesOps[Self <: Series] (val x: Self) extends AnyVal {
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
    def setSonify(value: SonifySeriesOptionsObject => Unit): Self = this.set("sonify", js.Any.fromFunction1(value))
  }
  
}

