package typings.hexoUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0
  extends /* index */ NumberDictionary[js.Any]
     with /* name */ StringDictionary[js.Any] {
  var `0`: String
}

object Anon0 {
  @scala.inline
  def apply(
    `0`: String,
    NumberDictionary: /* index */ NumberDictionary[js.Any] = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon0]
  }
}

