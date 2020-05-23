package typings.hdrHistogramJs.anon

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramConstr extends js.Object {
  var histogramConstr: HistogramConstructor
}

object HistogramConstr {
  @scala.inline
  def apply(histogramConstr: HistogramConstructor): HistogramConstr = {
    val __obj = js.Dynamic.literal(histogramConstr = histogramConstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConstr]
  }
}

