package typings.highcharts.highchartsMod

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
}

object PatternObject {
  @scala.inline
  def apply(pattern: PatternOptionsObject, animation: Boolean | AnimationOptionsObject = null): PatternObject = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternObject]
  }
}

