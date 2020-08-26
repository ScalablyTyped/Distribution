package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait manifestParsedData extends js.Object {
  var firstLevel: Double = js.native
  var levels: js.Array[Double] = js.native
}

object manifestParsedData {
  @scala.inline
  def apply(firstLevel: Double, levels: js.Array[Double]): manifestParsedData = {
    val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestParsedData]
  }
  @scala.inline
  implicit class manifestParsedDataOps[Self <: manifestParsedData] (val x: Self) extends AnyVal {
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
    def setFirstLevel(value: Double): Self = this.set("firstLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelsVarargs(value: Double*): Self = this.set("levels", js.Array(value :_*))
    @scala.inline
    def setLevels(value: js.Array[Double]): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
  
}

