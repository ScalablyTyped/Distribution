package typings.marked.markedMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends /* ruleName */ StringDictionary[RegExp | Rules]

object Rules {
  @scala.inline
  def apply(StringDictionary: /* ruleName */ StringDictionary[RegExp | Rules] = null): Rules = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Rules]
  }
}

