package typings.materialRipple.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-fg-scale`
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-fg-size`
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-fg-translate-end`
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-fg-translate-start`
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-left`
import typings.materialRipple.materialRippleStrings.`--mdc-ripple-top`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var VAR_FG_SCALE: `--mdc-ripple-fg-scale`
  var VAR_FG_SIZE: `--mdc-ripple-fg-size`
  var VAR_FG_TRANSLATE_END: `--mdc-ripple-fg-translate-end`
  var VAR_FG_TRANSLATE_START: `--mdc-ripple-fg-translate-start`
  var VAR_LEFT: `--mdc-ripple-left`
  var VAR_TOP: `--mdc-ripple-top`
}

object strings {
  @scala.inline
  def apply(
    VAR_FG_SCALE: `--mdc-ripple-fg-scale`,
    VAR_FG_SIZE: `--mdc-ripple-fg-size`,
    VAR_FG_TRANSLATE_END: `--mdc-ripple-fg-translate-end`,
    VAR_FG_TRANSLATE_START: `--mdc-ripple-fg-translate-start`,
    VAR_LEFT: `--mdc-ripple-left`,
    VAR_TOP: `--mdc-ripple-top`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(VAR_FG_SCALE = VAR_FG_SCALE.asInstanceOf[js.Any], VAR_FG_SIZE = VAR_FG_SIZE.asInstanceOf[js.Any], VAR_FG_TRANSLATE_END = VAR_FG_TRANSLATE_END.asInstanceOf[js.Any], VAR_FG_TRANSLATE_START = VAR_FG_TRANSLATE_START.asInstanceOf[js.Any], VAR_LEFT = VAR_LEFT.asInstanceOf[js.Any], VAR_TOP = VAR_TOP.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

