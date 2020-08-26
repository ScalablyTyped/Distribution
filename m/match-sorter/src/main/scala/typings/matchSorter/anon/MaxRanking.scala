package typings.matchSorter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxRanking extends js.Object {
  var maxRanking: Double = js.native
}

object MaxRanking {
  @scala.inline
  def apply(maxRanking: Double): MaxRanking = {
    val __obj = js.Dynamic.literal(maxRanking = maxRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxRanking]
  }
  @scala.inline
  implicit class MaxRankingOps[Self <: MaxRanking] (val x: Self) extends AnyVal {
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
    def setMaxRanking(value: Double): Self = this.set("maxRanking", value.asInstanceOf[js.Any])
  }
  
}

