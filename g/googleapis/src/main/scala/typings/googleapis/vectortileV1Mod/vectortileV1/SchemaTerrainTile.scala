package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTerrainTile extends StObject {
  
  /**
    * The global tile coordinates that uniquely identify this tile.
    */
  var coordinates: js.UndefOr[SchemaTileCoordinates] = js.undefined
  
  /**
    * Terrain elevation data encoded as a FirstDerivativeElevationGrid. cs/symbol:FirstDerivativeElevationGrid.
    */
  var firstDerivative: js.UndefOr[SchemaFirstDerivativeElevationGrid] = js.undefined
  
  /**
    * Resource name of the tile. The tile resource name is prefixed by its collection ID `terrain/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom level as `@,,z`. For example, `terrain/@1,2,3z`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Terrain elevation data encoded as a SecondDerivativeElevationGrid. cs/symbol:SecondDerivativeElevationGrid. See go/byte-encoded-terrain for more details.
    */
  var secondDerivative: js.UndefOr[SchemaSecondDerivativeElevationGrid] = js.undefined
}
object SchemaTerrainTile {
  
  inline def apply(): SchemaTerrainTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTerrainTile]
  }
  
  extension [Self <: SchemaTerrainTile](x: Self) {
    
    inline def setCoordinates(value: SchemaTileCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setFirstDerivative(value: SchemaFirstDerivativeElevationGrid): Self = StObject.set(x, "firstDerivative", value.asInstanceOf[js.Any])
    
    inline def setFirstDerivativeUndefined: Self = StObject.set(x, "firstDerivative", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecondDerivative(value: SchemaSecondDerivativeElevationGrid): Self = StObject.set(x, "secondDerivative", value.asInstanceOf[js.Any])
    
    inline def setSecondDerivativeUndefined: Self = StObject.set(x, "secondDerivative", js.undefined)
  }
}
