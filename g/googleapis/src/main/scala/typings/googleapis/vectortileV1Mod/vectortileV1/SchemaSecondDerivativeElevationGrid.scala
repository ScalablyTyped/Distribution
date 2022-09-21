package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecondDerivativeElevationGrid extends StObject {
  
  /**
    * A multiplier applied to the elements in the encoded data to extract the actual altitudes in meters.
    */
  var altitudeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of columns included in the encoded elevation data (i.e. the horizontal resolution of the grid).
    */
  var columnCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A stream of elements each representing a point on the tile running across each row from left to right, top to bottom. There will be precisely horizontal_resolution * vertical_resolution elements in the stream. The elements are not the heights, rather the second order derivative of the values one would expect in a stream of height data. Each element is a varint with the following encoding: ------------------------------------------------------------------------| | Head Nibble | ------------------------------------------------------------------------| | Bit 0 | Bit 1 | Bits 2-3 | | Terminator| Sign (1=neg) | Least significant 2 bits of absolute error | ------------------------------------------------------------------------| | Tail Nibble #1 | ------------------------------------------------------------------------| | Bit 0 | Bit 1-3 | | Terminator| Least significant 3 bits of absolute error | ------------------------------------------------------------------------| | ... | Tail Nibble #n | ------------------------------------------------------------------------| | Bit 0 | Bit 1-3 | | Terminator| Least significant 3 bits of absolute error | ------------------------------------------------------------------------|
    */
  var encodedData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of rows included in the encoded elevation data (i.e. the vertical resolution of the grid).
    */
  var rowCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSecondDerivativeElevationGrid {
  
  inline def apply(): SchemaSecondDerivativeElevationGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecondDerivativeElevationGrid]
  }
  
  extension [Self <: SchemaSecondDerivativeElevationGrid](x: Self) {
    
    inline def setAltitudeMultiplier(value: Double): Self = StObject.set(x, "altitudeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setAltitudeMultiplierNull: Self = StObject.set(x, "altitudeMultiplier", null)
    
    inline def setAltitudeMultiplierUndefined: Self = StObject.set(x, "altitudeMultiplier", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountNull: Self = StObject.set(x, "columnCount", null)
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataNull: Self = StObject.set(x, "encodedData", null)
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountNull: Self = StObject.set(x, "rowCount", null)
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
  }
}
