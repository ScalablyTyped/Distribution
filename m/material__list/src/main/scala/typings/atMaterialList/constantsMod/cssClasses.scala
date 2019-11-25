package typings.atMaterialList.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialList.atMaterialListStrings.`mdc-list-item--activated`
import typings.atMaterialList.atMaterialListStrings.`mdc-list-item--selected`
import typings.atMaterialList.atMaterialListStrings.`mdc-list-item`
import typings.atMaterialList.atMaterialListStrings.`mdc-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var LIST_ITEM_ACTIVATED_CLASS: `mdc-list-item--activated`
  var LIST_ITEM_CLASS: `mdc-list-item`
  var LIST_ITEM_SELECTED_CLASS: `mdc-list-item--selected`
  var ROOT: `mdc-list`
}

object cssClasses {
  @scala.inline
  def apply(
    LIST_ITEM_ACTIVATED_CLASS: `mdc-list-item--activated`,
    LIST_ITEM_CLASS: `mdc-list-item`,
    LIST_ITEM_SELECTED_CLASS: `mdc-list-item--selected`,
    ROOT: `mdc-list`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LIST_ITEM_ACTIVATED_CLASS = LIST_ITEM_ACTIVATED_CLASS.asInstanceOf[js.Any], LIST_ITEM_CLASS = LIST_ITEM_CLASS.asInstanceOf[js.Any], LIST_ITEM_SELECTED_CLASS = LIST_ITEM_SELECTED_CLASS.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

