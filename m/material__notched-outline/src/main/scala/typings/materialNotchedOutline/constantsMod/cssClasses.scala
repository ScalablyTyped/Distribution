package typings.materialNotchedOutline.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialNotchedOutline.materialNotchedOutlineStrings.`mdc-notched-outline--notched`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var OUTLINE_NOTCHED: `mdc-notched-outline--notched`
}

object cssClasses {
  @scala.inline
  def apply(OUTLINE_NOTCHED: `mdc-notched-outline--notched`, StringDictionary: StringDictionary[String] = null): cssClasses = {
    val __obj = js.Dynamic.literal(OUTLINE_NOTCHED = OUTLINE_NOTCHED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

