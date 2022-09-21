package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureTile extends StObject {
  
  /**
    * The global tile coordinates that uniquely identify this tile.
    */
  var coordinates: js.UndefOr[SchemaTileCoordinates] = js.undefined
  
  /**
    * Features present on this map tile.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.undefined
  
  /**
    * Resource name of the tile. The tile resource name is prefixed by its collection ID `tiles/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom level as `@,,z`. For example, `tiles/@1,2,3z`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data providers for the data contained in this tile.
    */
  var providers: js.UndefOr[js.Array[SchemaProviderInfo]] = js.undefined
  
  /**
    * Tile response status code to support tile caching.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An opaque value, usually less than 30 characters, that contains version info about this tile and the data that was used to generate it. The client should store this value in its tile cache and pass it back to the API in the client_tile_version_id field of subsequent tile requests in order to enable the API to detect when the new tile would be the same as the one the client already has in its cache. Also see STATUS_OK_DATA_UNCHANGED.
    */
  var versionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureTile {
  
  inline def apply(): SchemaFeatureTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureTile]
  }
  
  extension [Self <: SchemaFeatureTile](x: Self) {
    
    inline def setCoordinates(value: SchemaTileCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setFeatures(value: js.Array[SchemaFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: SchemaFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProviders(value: js.Array[SchemaProviderInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: SchemaProviderInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
