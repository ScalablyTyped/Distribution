package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.full
import typings.atIonicCore.atIonicCoreStrings.inset
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonList extends js.Object {
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: js.UndefOr[Boolean] = js.undefined
  /**
    * How the bottom border should be displayed on all items.
    */
  var lines: js.UndefOr[full | inset | none] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}

object IonList {
  @scala.inline
  def apply(
    inset: js.UndefOr[Boolean] = js.undefined,
    lines: full | inset | none = null,
    mode: ios | md = null
  ): IonList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonList]
  }
}

