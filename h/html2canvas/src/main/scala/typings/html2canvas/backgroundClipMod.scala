package typings.html2canvas

import typings.html2canvas.html2canvasNumbers.`0`
import typings.html2canvas.html2canvasNumbers.`1`
import typings.html2canvas.html2canvasNumbers.`2`
import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundClipMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-clip", "backgroundClip")
  @js.native
  val backgroundClip: IPropertyListDescriptor[BackgroundClip_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasNumbers.`0`
    - typings.html2canvas.html2canvasNumbers.`1`
    - typings.html2canvas.html2canvasNumbers.`2`
  */
  trait BACKGROUND_CLIP extends StObject
  object BACKGROUND_CLIP {
    
    inline def BORDER_BOX: `0` = 0.asInstanceOf[`0`]
    
    inline def CONTENT_BOX: `2` = 2.asInstanceOf[`2`]
    
    inline def PADDING_BOX: `1` = 1.asInstanceOf[`1`]
  }
  
  type BackgroundClip_ = js.Array[BACKGROUND_CLIP]
}
