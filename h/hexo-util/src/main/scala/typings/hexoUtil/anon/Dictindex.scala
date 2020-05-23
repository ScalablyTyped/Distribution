package typings.hexoUtil.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex
  extends /* index */ NumberDictionary[js.Any]
     with /* name */ StringDictionary[js.Any] {
  var `0`: String
}

object Dictindex {
  @scala.inline
  def apply(
    `0`: String,
    NumberDictionary: /* key */ NumberDictionary[js.Any] = null,
    StringDictionary: /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] = null
  ): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictindex]
  }
}

