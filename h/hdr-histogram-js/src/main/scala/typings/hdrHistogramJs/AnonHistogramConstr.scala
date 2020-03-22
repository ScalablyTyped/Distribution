package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistogramConstr extends js.Object {
  var histogramConstr: HistogramConstructor
}

object AnonHistogramConstr {
  @scala.inline
  def apply(histogramConstr: HistogramConstructor): AnonHistogramConstr = {
    val __obj = js.Dynamic.literal(histogramConstr = histogramConstr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHistogramConstr]
  }
}

