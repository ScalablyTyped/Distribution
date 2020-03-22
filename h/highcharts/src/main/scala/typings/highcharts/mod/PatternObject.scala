package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternObject extends _ColorType {
  /**
    * Animation options for the image pattern loading.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * Pattern options
    */
  var pattern: PatternOptionsObject
  /**
    * Optionally an index referencing which pattern to use. Highcharts adds 10
    * default patterns to the `Highcharts.patterns` array. Additional pattern
    * definitions can be pushed to this array if desired. This option is an
    * index into this array.
    */
  var patternIndex: js.UndefOr[Double] = js.undefined
}

object PatternObject {
  @scala.inline
  def apply(
    pattern: PatternOptionsObject,
    animation: Boolean | AnimationOptionsObject = null,
    patternIndex: Int | Double = null
  ): PatternObject = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (patternIndex != null) __obj.updateDynamic("patternIndex")(patternIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternObject]
  }
}

