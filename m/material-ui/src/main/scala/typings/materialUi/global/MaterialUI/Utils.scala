package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.Utils.ColorManipulator.MuiColorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__MaterialUI.Utils")
@js.native
object Utils extends js.Object {
  
  var Dom: typings.materialUi.MaterialUI.Utils.Dom = js.native
  
  var Events: typings.materialUi.MaterialUI.Utils.Events = js.native
  
  @js.native
  object ColorManipulator extends js.Object {
    
    def convertColorToString(color: js.Any): String = js.native
    
    def convertHexToRGB(color: String): String = js.native
    
    def darken(color: String, coefficient: Double): String = js.native
    
    def decomposeColor(color: String): MuiColorObject = js.native
    
    def emphasize(color: String): String = js.native
    def emphasize(color: String, coefficient: Double): String = js.native
    
    def fade(color: String, value: Double): String = js.native
    
    def getContrastRatio(foreground: String, background: String): Double = js.native
    
    def getLuminance(color: String): Double = js.native
    
    def lighten(color: String, coefficient: Double): String = js.native
  }
}
