package typings.materialDrawer

import typings.materialDom.focusTrapMod.FocusOptions
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = js.native
  type MDCDrawerFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}

