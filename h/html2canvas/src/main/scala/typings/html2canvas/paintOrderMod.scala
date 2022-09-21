package typings.html2canvas

import typings.html2canvas.html2canvasNumbers.`0`
import typings.html2canvas.html2canvasNumbers.`1`
import typings.html2canvas.html2canvasNumbers.`2`
import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paintOrderMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/paint-order", "paintOrder")
  @js.native
  val paintOrder: IPropertyListDescriptor[PaintOrder_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasNumbers.`0`
    - typings.html2canvas.html2canvasNumbers.`1`
    - typings.html2canvas.html2canvasNumbers.`2`
  */
  trait PAINT_ORDER_LAYER extends StObject
  object PAINT_ORDER_LAYER {
    
    inline def FILL: `0` = 0.asInstanceOf[`0`]
    
    inline def MARKERS: `2` = 2.asInstanceOf[`2`]
    
    inline def STROKE: `1` = 1.asInstanceOf[`1`]
  }
  
  type PaintOrder_ = js.Array[PAINT_ORDER_LAYER]
}
