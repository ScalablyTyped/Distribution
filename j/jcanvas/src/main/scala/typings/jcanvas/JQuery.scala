package typings.jcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * This clearCanvas() clears all or any part of the canvas
    * If nothing is passed, the entire canvas is cleared.
    * Clearing a section works in the same way as drawing a rectangle,
    * with the rectangle being drawn from its center (by default).
    */
  def clearCanvas(): Unit = js.native
  def clearCanvas(rect: JCanvasRect): Unit = js.native
  
  /**
    * A slice in jCanvas is, essentially, a slice of a circle (similar to a pizza slice).
    * You can draw a slice using the drawSlice() method. The size of a slice is determined by its start, end, and radius properties.
    * The position of a slice is determined by its x and y properties. These coordinates lie at the tip of the slice.
    */
  def drawSlice(`def`: JCanvasSliceDef): Unit = js.native
  
  /**
    * To draw text on the canvas, use the drawText() method.
    * The resulting text on the canvas is determined by the value of the text property, as well as any of the following font properties:
    * fontStyle
    * fontSize
    * fontFamily
    */
  def drawText(`def`: JCanvasTextDef): Unit = js.native
}
