package typings.jpm

import typings.jpm.anon.Badge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a button to the Firefox user interface
  * With this module you can create buttons that display icons and can respond to click events
  */
@JSImport("sdk/ui/button/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  
  def ActionButton(options: Badge): typings.jpm.FFAddonSDK.ActionButton = js.native
}
