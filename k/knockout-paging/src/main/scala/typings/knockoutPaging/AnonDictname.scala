package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictname extends /* name */ StringDictionary[KnockoutPageGenerator] {
  var sliding: KnockoutSlidingPageGenerator
}

object AnonDictname {
  @scala.inline
  def apply(
    sliding: KnockoutSlidingPageGenerator,
    StringDictionary: /* name */ StringDictionary[KnockoutPageGenerator] = null
  ): AnonDictname = {
    val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictname]
  }
}

