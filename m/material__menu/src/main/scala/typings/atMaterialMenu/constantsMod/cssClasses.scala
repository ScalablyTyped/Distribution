package typings.atMaterialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialMenu.atMaterialMenuStrings.`mdc-list-item--selected`
import typings.atMaterialMenu.atMaterialMenuStrings.`mdc-menu--animating-closed`
import typings.atMaterialMenu.atMaterialMenuStrings.`mdc-menu--animating-open`
import typings.atMaterialMenu.atMaterialMenuStrings.`mdc-menu--open`
import typings.atMaterialMenu.atMaterialMenuStrings.`mdc-menu`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ANIMATING_CLOSED: `mdc-menu--animating-closed`
  var ANIMATING_OPEN: `mdc-menu--animating-open`
  var OPEN: `mdc-menu--open`
  var ROOT: `mdc-menu`
  var SELECTED_LIST_ITEM: `mdc-list-item--selected`
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATING_CLOSED: `mdc-menu--animating-closed`,
    ANIMATING_OPEN: `mdc-menu--animating-open`,
    OPEN: `mdc-menu--open`,
    ROOT: `mdc-menu`,
    SELECTED_LIST_ITEM: `mdc-list-item--selected`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], SELECTED_LIST_ITEM = SELECTED_LIST_ITEM.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

