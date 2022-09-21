package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "PlacedSymbolStruct")
@js.native
open class PlacedSymbolStruct protected () extends Struct {
  /**
  	 * @param {StructArray} structArray The StructArray the struct is stored in
  	 * @param {number} index The index of the struct in the StructArray.
  	 * @private
  	 */
  def this(structArray: StructArray, index: Double) = this()
  
  @JSName("_structArray")
  var _structArray_PlacedSymbolStruct: PlacedSymbolArray = js.native
  
  def anchorX: Double = js.native
  
  def anchorY: Double = js.native
  
  def associatedIconIndex: Double = js.native
  
  def crossTileID: Double = js.native
  def crossTileID_=(x: Double): scala.Unit = js.native
  
  def glyphStartIndex: Double = js.native
  
  def hidden: Double = js.native
  def hidden_=(x: Double): scala.Unit = js.native
  
  def lineLength: Double = js.native
  
  def lineOffsetX: Double = js.native
  
  def lineOffsetY: Double = js.native
  
  def lineStartIndex: Double = js.native
  
  def lowerSize: Double = js.native
  
  def numGlyphs: Double = js.native
  
  def placedOrientation: Double = js.native
  def placedOrientation_=(x: Double): scala.Unit = js.native
  
  def segment: Double = js.native
  
  def upperSize: Double = js.native
  
  def vertexStartIndex: Double = js.native
  
  def writingMode: Double = js.native
}
