package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SymbolInstanceStruct")
@js.native
open class SymbolInstanceStruct protected () extends Struct {
  /**
  	 * @param {StructArray} structArray The StructArray the struct is stored in
  	 * @param {number} index The index of the struct in the StructArray.
  	 * @private
  	 */
  def this(structArray: StructArray, index: Double) = this()
  
  @JSName("_structArray")
  var _structArray_SymbolInstanceStruct: SymbolInstanceArray = js.native
  
  def anchorX: Double = js.native
  
  def anchorY: Double = js.native
  
  def centerJustifiedTextSymbolIndex: Double = js.native
  
  def collisionCircleDiameter: Double = js.native
  
  def crossTileID: Double = js.native
  def crossTileID_=(x: Double): scala.Unit = js.native
  
  def featureIndex: Double = js.native
  
  def iconBoxEndIndex: Double = js.native
  
  def iconBoxStartIndex: Double = js.native
  
  def key: Double = js.native
  
  def leftJustifiedTextSymbolIndex: Double = js.native
  
  def numHorizontalGlyphVertices: Double = js.native
  
  def numIconVertices: Double = js.native
  
  def numVerticalGlyphVertices: Double = js.native
  
  def numVerticalIconVertices: Double = js.native
  
  def placedIconSymbolIndex: Double = js.native
  
  def rightJustifiedTextSymbolIndex: Double = js.native
  
  def textBoxEndIndex: Double = js.native
  
  def textBoxScale: Double = js.native
  
  def textBoxStartIndex: Double = js.native
  
  def textOffset0: Double = js.native
  
  def textOffset1: Double = js.native
  
  def useRuntimeCollisionCircles: Double = js.native
  
  def verticalIconBoxEndIndex: Double = js.native
  
  def verticalIconBoxStartIndex: Double = js.native
  
  def verticalPlacedIconSymbolIndex: Double = js.native
  
  def verticalPlacedTextSymbolIndex: Double = js.native
  
  def verticalTextBoxEndIndex: Double = js.native
  
  def verticalTextBoxStartIndex: Double = js.native
}
