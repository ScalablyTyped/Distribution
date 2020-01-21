package typings.materialDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusTrapMod {
  type ActivateOptions = typings.std.Pick[
    typings.materialDrawer.focusTrapMod.Options, 
    typings.materialDrawer.materialDrawerStrings.onActivate
  ]
  type FocusTarget = typings.std.HTMLElement | java.lang.String | js.Function0[typings.std.HTMLElement]
}
