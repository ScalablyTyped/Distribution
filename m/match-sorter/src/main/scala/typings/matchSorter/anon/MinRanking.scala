package typings.matchSorter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinRanking extends js.Object {
  var minRanking: Double = js.native
}

object MinRanking {
  @scala.inline
  def apply(minRanking: Double): MinRanking = {
    val __obj = js.Dynamic.literal(minRanking = minRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinRanking]
  }
  @scala.inline
  implicit class MinRankingOps[Self <: MinRanking] (val x: Self) extends AnyVal {
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
    def setMinRanking(value: Double): Self = this.set("minRanking", value.asInstanceOf[js.Any])
  }
  
}

