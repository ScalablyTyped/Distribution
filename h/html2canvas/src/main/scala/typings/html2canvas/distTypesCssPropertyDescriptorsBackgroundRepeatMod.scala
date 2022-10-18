package typings.html2canvas

import typings.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor
import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.html2canvasInts.`2`
import typings.html2canvas.html2canvasInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsBackgroundRepeatMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-repeat", "backgroundRepeat")
  @js.native
  val backgroundRepeat: IPropertyListDescriptor[BackgroundRepeat_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
    - typings.html2canvas.html2canvasInts.`3`
  */
  trait BACKGROUND_REPEAT extends StObject
  object BACKGROUND_REPEAT {
    
    inline def NO_REPEAT: `1` = 1.asInstanceOf[`1`]
    
    inline def REPEAT: `0` = 0.asInstanceOf[`0`]
    
    inline def REPEAT_X: `2` = 2.asInstanceOf[`2`]
    
    inline def REPEAT_Y: `3` = 3.asInstanceOf[`3`]
  }
  
  type BackgroundRepeat_ = js.Array[BACKGROUND_REPEAT]
}
