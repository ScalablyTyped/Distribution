package typings.atMaterialToolbar.atMaterialToolbarMod

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import typings.atMaterialToolbar.foundationMod.default
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", "MDCToolbar")
@js.native
class MDCToolbar () extends MDCComponent[MDCToolbarAdapter, default] {
  var fixedAdjustElement: HTMLElement = js.native
}

/* static members */
@JSImport("@material/toolbar", "MDCToolbar")
@js.native
object MDCToolbar extends js.Object {
  def attachTo(root: Element): MDCToolbar = js.native
}

