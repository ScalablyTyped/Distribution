package typings.materialLineRipple.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialLineRipple.materialLineRippleStrings.`mdc-line-ripple--active`
import typings.materialLineRipple.materialLineRippleStrings.`mdc-line-ripple--deactivating`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var LINE_RIPPLE_ACTIVE: `mdc-line-ripple--active`
  var LINE_RIPPLE_DEACTIVATING: `mdc-line-ripple--deactivating`
}

object cssClasses {
  @scala.inline
  def apply(
    LINE_RIPPLE_ACTIVE: `mdc-line-ripple--active`,
    LINE_RIPPLE_DEACTIVATING: `mdc-line-ripple--deactivating`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LINE_RIPPLE_ACTIVE = LINE_RIPPLE_ACTIVE.asInstanceOf[js.Any], LINE_RIPPLE_DEACTIVATING = LINE_RIPPLE_DEACTIVATING.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

