package typings
package intlDashTelDashInputLib.intlDashTelDashInputMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var intlTelInputGlobals: intlDashTelDashInputLib.intlDashTelDashInputMod.IntlTelInputNs.Static = js.native
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def intlTelInput(node: stdLib.Element): intlDashTelDashInputLib.intlDashTelDashInputMod.IntlTelInputNs.Plugin = js.native
  def intlTelInput(
    node: stdLib.Element,
    options: intlDashTelDashInputLib.intlDashTelDashInputMod.IntlTelInputNs.Options
  ): intlDashTelDashInputLib.intlDashTelDashInputMod.IntlTelInputNs.Plugin = js.native
}

