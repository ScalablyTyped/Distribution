package typings.jpm

import typings.jpm.anon.BadgeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toggle button to the Firefox user interface
  * With this module you can create buttons that function like a check box, representing an on/off choice
  */
object toggleMod {
  
  @JSImport("sdk/ui/button/toggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ToggleButton(options: BadgeColor): typings.jpm.FFAddonSDK.ToggleButton = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButton")(options.asInstanceOf[js.Any]).asInstanceOf[typings.jpm.FFAddonSDK.ToggleButton]
}
