package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.Utils.ColorManipulator.MuiColorObject
import typings.materialUi.MaterialUI.Utils.Dom
import typings.materialUi.MaterialUI.Utils.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSGlobal("__MaterialUI.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  object ColorManipulator {
    
    @JSGlobal("__MaterialUI.Utils.ColorManipulator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertColorToString(color: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertColorToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def convertHexToRGB(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def decomposeColor(color: String): MuiColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[MuiColorObject]
    
    inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def fade(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSGlobal("__MaterialUI.Utils.Dom")
  @js.native
  def Dom: typings.materialUi.MaterialUI.Utils.Dom = js.native
  inline def Dom_=(x: Dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Utils.Events")
  @js.native
  def Events: typings.materialUi.MaterialUI.Utils.Events = js.native
  inline def Events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Events")(x.asInstanceOf[js.Any])
}
