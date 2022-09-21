package typings.html2canvas

import typings.html2canvas.fontStyleMod.FONT_STYLE
import typings.html2canvas.overflowWrapMod.OVERFLOW_WRAP
import typings.html2canvas.typesMod.CSSTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html2canvasStrings {
  
  @js.native
  sealed trait angle
    extends StObject
       with CSSTypes
  inline def angle: angle = "angle".asInstanceOf[angle]
  
  @js.native
  sealed trait `break-word`
    extends StObject
       with OVERFLOW_WRAP
  inline def `break-word`: `break-word` = "break-word".asInstanceOf[`break-word`]
  
  @js.native
  sealed trait color
    extends StObject
       with CSSTypes
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait image
    extends StObject
       with CSSTypes
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait italic
    extends StObject
       with FONT_STYLE
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait length
    extends StObject
       with CSSTypes
  inline def length: length = "length".asInstanceOf[length]
  
  @js.native
  sealed trait `length-percentage`
    extends StObject
       with CSSTypes
  inline def `length-percentage`: `length-percentage` = "length-percentage".asInstanceOf[`length-percentage`]
  
  @js.native
  sealed trait normal
    extends StObject
       with FONT_STYLE
       with OVERFLOW_WRAP
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait oblique
    extends StObject
       with FONT_STYLE
  inline def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait time
    extends StObject
       with CSSTypes
  inline def time: time = "time".asInstanceOf[time]
}
