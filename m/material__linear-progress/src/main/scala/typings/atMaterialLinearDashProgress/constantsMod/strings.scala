package typings.atMaterialLinearDashProgress.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressStrings.`Dotmdc-linear-progress__buffer`
import typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressStrings.`Dotmdc-linear-progress__primary-bar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var BUFFER_SELECTOR: `Dotmdc-linear-progress__buffer`
  var PRIMARY_BAR_SELECTOR: `Dotmdc-linear-progress__primary-bar`
}

object strings {
  @scala.inline
  def apply(
    BUFFER_SELECTOR: `Dotmdc-linear-progress__buffer`,
    PRIMARY_BAR_SELECTOR: `Dotmdc-linear-progress__primary-bar`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(BUFFER_SELECTOR = BUFFER_SELECTOR.asInstanceOf[js.Any], PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

