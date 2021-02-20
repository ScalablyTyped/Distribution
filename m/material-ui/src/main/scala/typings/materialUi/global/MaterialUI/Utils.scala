package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.Utils.ColorManipulator.MuiColorObject
import typings.materialUi.MaterialUI.Utils.Dom
import typings.materialUi.MaterialUI.Utils.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSGlobal("__MaterialUI.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  object ColorManipulator {
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.convertColorToString")
    @js.native
    def convertColorToString(color: js.Any): String = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.convertHexToRGB")
    @js.native
    def convertHexToRGB(color: String): String = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.darken")
    @js.native
    def darken(color: String, coefficient: Double): String = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.decomposeColor")
    @js.native
    def decomposeColor(color: String): MuiColorObject = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.emphasize")
    @js.native
    def emphasize(color: String): String = js.native
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.emphasize")
    @js.native
    def emphasize(color: String, coefficient: Double): String = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.fade")
    @js.native
    def fade(color: String, value: Double): String = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.getContrastRatio")
    @js.native
    def getContrastRatio(foreground: String, background: String): Double = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.getLuminance")
    @js.native
    def getLuminance(color: String): Double = js.native
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator.lighten")
    @js.native
    def lighten(color: String, coefficient: Double): String = js.native
  }
  
  @JSGlobal("__MaterialUI.Utils.Dom")
  @js.native
  def Dom: typings.materialUi.MaterialUI.Utils.Dom = js.native
  @scala.inline
  def Dom_=(x: Dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Utils.Events")
  @js.native
  def Events: typings.materialUi.MaterialUI.Utils.Events = js.native
  @scala.inline
  def Events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Events")(x.asInstanceOf[js.Any])
}
