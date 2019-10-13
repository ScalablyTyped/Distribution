package typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_

import typings.intlDashTelDashInput.intlDashTelDashInputMod.Options
import typings.intlDashTelDashInput.intlDashTelDashInputMod.Plugin
import typings.intlDashTelDashInput.intlDashTelDashInputMod.Static
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var intlTelInputGlobals: Static = js.native
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def intlTelInput(node: Element): Plugin = js.native
  def intlTelInput(node: Element, options: Options): Plugin = js.native
}

