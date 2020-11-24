package typings.jpm

import typings.jpm.anon.BadgeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toggle button to the Firefox user interface
  * With this module you can create buttons that function like a check box, representing an on/off choice
  */
@JSImport("sdk/ui/button/toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  
  def ToggleButton(options: BadgeColor): typings.jpm.FFAddonSDK.ToggleButton = js.native
}
