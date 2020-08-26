package typings.hdrHistogramJs.anon

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramConstr extends js.Object {
  var histogramConstr: HistogramConstructor = js.native
}

object HistogramConstr {
  @scala.inline
  def apply(histogramConstr: HistogramConstructor): HistogramConstr = {
    val __obj = js.Dynamic.literal(histogramConstr = histogramConstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConstr]
  }
  @scala.inline
  implicit class HistogramConstrOps[Self <: HistogramConstr] (val x: Self) extends AnyVal {
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
    def setHistogramConstr(value: HistogramConstructor): Self = this.set("histogramConstr", value.asInstanceOf[js.Any])
  }
  
}

