package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageThreshold extends /* path */ StringDictionary[StringDictionary[Double]] {
  var global: StringDictionary[Double] = js.native
}

object CoverageThreshold {
  @scala.inline
  def apply(global: StringDictionary[Double]): CoverageThreshold = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageThreshold]
  }
  @scala.inline
  implicit class CoverageThresholdOps[Self <: CoverageThreshold] (val x: Self) extends AnyVal {
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
    def setGlobal(value: StringDictionary[Double]): Self = this.set("global", value.asInstanceOf[js.Any])
  }
  
}

