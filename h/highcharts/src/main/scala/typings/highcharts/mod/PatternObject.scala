package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternObject extends _ColorType {
  /**
    * Animation options for the image pattern loading.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * Pattern options
    */
  var pattern: PatternOptionsObject = js.native
  /**
    * Optionally an index referencing which pattern to use. Highcharts adds 10
    * default patterns to the `Highcharts.patterns` array. Additional pattern
    * definitions can be pushed to this array if desired. This option is an
    * index into this array.
    */
  var patternIndex: js.UndefOr[Double] = js.native
}

object PatternObject {
  @scala.inline
  def apply(pattern: PatternOptionsObject): PatternObject = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternObject]
  }
  @scala.inline
  implicit class PatternObjectOps[Self <: PatternObject] (val x: Self) extends AnyVal {
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
    def setPattern(value: PatternOptionsObject): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setPatternIndex(value: Double): Self = this.set("patternIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternIndex: Self = this.set("patternIndex", js.undefined)
  }
  
}

