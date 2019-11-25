package typings.knockoutDashPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends /* name */ StringDictionary[KnockoutPageGenerator] {
  var sliding: KnockoutSlidingPageGenerator
}

object Anon_Name {
  @scala.inline
  def apply(
    sliding: KnockoutSlidingPageGenerator,
    StringDictionary: /* name */ StringDictionary[KnockoutPageGenerator] = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Name]
  }
}

