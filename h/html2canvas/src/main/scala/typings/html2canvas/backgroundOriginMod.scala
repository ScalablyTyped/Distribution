package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.html2canvasInts.`2`
import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundOriginMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-origin", "backgroundOrigin")
  @js.native
  val backgroundOrigin: IPropertyListDescriptor[BackgroundOrigin_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
  */
  trait BACKGROUND_ORIGIN extends StObject
  object BACKGROUND_ORIGIN {
    
    inline def BORDER_BOX: `0` = 0.asInstanceOf[`0`]
    
    inline def CONTENT_BOX: `2` = 2.asInstanceOf[`2`]
    
    inline def PADDING_BOX: `1` = 1.asInstanceOf[`1`]
  }
  
  type BackgroundOrigin_ = js.Array[BACKGROUND_ORIGIN]
}
