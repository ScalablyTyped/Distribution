package typings.atMaterialDrawer

import typings.atMaterialDrawer.Fn_HTMLElement
import typings.atMaterialDrawer.atMaterialDrawerStrings.onActivate
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusDashTrapMod {
  type ActivateOptions = Pick[Options, onActivate]
  type FocusTarget = HTMLElement | String | Fn_HTMLElement
}
