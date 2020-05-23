package typings.knockoutPaging.anon

import org.scalablytyped.runtime.StringDictionary
import typings.knockoutPaging.KnockoutPageGenerator
import typings.knockoutPaging.KnockoutSlidingPageGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictname extends /* name */ StringDictionary[KnockoutPageGenerator] {
  var sliding: KnockoutSlidingPageGenerator
}

object Dictname {
  @scala.inline
  def apply(
    sliding: KnockoutSlidingPageGenerator,
    StringDictionary: /* name */ StringDictionary[KnockoutPageGenerator] = null
  ): Dictname = {
    val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictname]
  }
}

