package typings
package atMaterialMenuLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ANIMATING_CLOSED: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--animating-closed`
  var ANIMATING_OPEN: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--animating-open`
  var OPEN: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--open`
  var ROOT: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu`
  var SELECTED_LIST_ITEM: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-list-item--selected`
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATING_CLOSED: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--animating-closed`,
    ANIMATING_OPEN: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--animating-open`,
    OPEN: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu--open`,
    ROOT: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-menu`,
    SELECTED_LIST_ITEM: atMaterialMenuLib.atMaterialMenuLibStrings.`mdc-list-item--selected`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ANIMATING_CLOSED")(ANIMATING_CLOSED)
    __obj.updateDynamic("ANIMATING_OPEN")(ANIMATING_OPEN)
    __obj.updateDynamic("OPEN")(OPEN)
    __obj.updateDynamic("ROOT")(ROOT)
    __obj.updateDynamic("SELECTED_LIST_ITEM")(SELECTED_LIST_ITEM)
    __obj.asInstanceOf[cssClasses]
  }
}

