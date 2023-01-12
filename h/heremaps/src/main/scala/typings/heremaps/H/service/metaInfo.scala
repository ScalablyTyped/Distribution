package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.map.layer.TileLayer
import typings.heremaps.H.map.provider.RemoteTileProvider
import typings.heremaps.H.service.metaInfo.Service.Info
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaInfo {
  
  /**
    * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
    */
  @js.native
  trait Service
    extends StObject
       with EventTarget
       with IConfigurable {
    
    /**
      * This method creates a tile layer. This layer can be used as a layer on a map's data model.
      * @param tileSize {number} - The tile size
      * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
      * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
      * @param opt_tileType {string=} - the tile type (default is 'maptile')
      * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
      * @returns {H.map.layer.TileLayer} - the tile layer
      */
    def createTileLayer(tileSize: Double, pixelRatio: Double): TileLayer = js.native
    def createTileLayer(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: Unit,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: Unit,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: Unit,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: Unit,
      opt_scheme: String
    ): TileLayer = js.native
    
    /**
      * This method creates a tile provider which uses the meta info tile backend. This provider can be used as a data source for an TileLayer.
      * @param tileSize {number} - The tile size
      * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
      * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
      * @param opt_tileType {string=} - the tile type (default is 'maptile')
      * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
      * @returns {H.map.provider.TileProvider} - the tile provider
      */
    def createTileProvider(tileSize: Double, pixelRatio: Double): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: String,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: Unit,
      opt_tileType: Unit,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: Unit,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: String,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: Unit,
      opt_tileType: Unit,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: Unit,
      opt_additionalParameters: ServiceParameters,
      opt_tileType: Unit,
      opt_scheme: String
    ): typings.heremaps.H.map.provider.TileProvider = js.native
    
    /**
      * This method returns the meta info tile service's meta information. The method will return an object once the map tile service's data has been fetched.
      * @returns {(H.service.metaInfo.Service.Info | undefined)} - meta information for this meta info tile service
      */
    def getInfo(): Info | Unit = js.native
    
    /**
      * This method returns the meta info tile service's newest version hash.
      * @returns {string} - meta information for this map tile service
      */
    def getVersion(): String = js.native
  }
  object Service {
    
    /**
      * @property maps {Object<string, Object>} -
      * @property schemes {Object<string, Object>} -
      * @property tiletypes {Object<string, Object>} -
      * @property formats {Object<string, Object>} -
      * @property resolutions {Object<string, Object>} -
      * @property languages {Object<string, Object>} -
      */
    trait Info extends StObject {
      
      var formats: StringDictionary[Any]
      
      var languages: StringDictionary[Any]
      
      var maps: StringDictionary[Any]
      
      var resolutions: StringDictionary[Any]
      
      var schemes: StringDictionary[Any]
      
      var tiletypes: StringDictionary[Any]
    }
    object Info {
      
      inline def apply(
        formats: StringDictionary[Any],
        languages: StringDictionary[Any],
        maps: StringDictionary[Any],
        resolutions: StringDictionary[Any],
        schemes: StringDictionary[Any],
        tiletypes: StringDictionary[Any]
      ): Info = {
        val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any], tiletypes = tiletypes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Info]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
        
        inline def setFormats(value: StringDictionary[Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
        
        inline def setLanguages(value: StringDictionary[Any]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        inline def setMaps(value: StringDictionary[Any]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
        
        inline def setResolutions(value: StringDictionary[Any]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
        
        inline def setSchemes(value: StringDictionary[Any]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
        
        inline def setTiletypes(value: StringDictionary[Any]): Self = StObject.set(x, "tiletypes", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @property type {string=} - the type of the map tile service to communicate with, e.g. 'base' (default), 'aerial', etc. (refer to the Map Tile REST API documentation for
      * available types)
      * @property version {string=} - the map version hash to use for retrieving tiles, default is newest and will be automatically updated
      * @property subDomain {string=} - the sub-domain of the map tile service relative to the platform's base URL, default is 'maps'
      */
    trait Options extends StObject {
      
      var subDomain: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
        
        inline def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
  
  object TileProvider {
    
    /**
      * Configuration object which can be used to initialize the TileProvider.
      * @property tileType {string=} - The tile type for which to request meta info
      * @property scheme {string=} - The map scheme for which to request meta info
      * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
      * @property tileSize {number=} - The size of the tiles rendered by this provider (must be power of 2, default is 256)
      * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
      * @property categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      */
    trait Options extends StObject {
      
      var categoryFilter: js.UndefOr[js.Array[String]] = js.undefined
      
      var pixelRatio: js.UndefOr[Double] = js.undefined
      
      var scheme: js.UndefOr[String] = js.undefined
      
      var tileCacheSize: js.UndefOr[Double] = js.undefined
      
      var tileSize: js.UndefOr[Double] = js.undefined
      
      var tileType: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setCategoryFilter(value: js.Array[String]): Self = StObject.set(x, "categoryFilter", value.asInstanceOf[js.Any])
        
        inline def setCategoryFilterUndefined: Self = StObject.set(x, "categoryFilter", js.undefined)
        
        inline def setCategoryFilterVarargs(value: String*): Self = StObject.set(x, "categoryFilter", js.Array(value*))
        
        inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
        
        inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
        
        inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
        
        inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
        
        inline def setTileCacheSize(value: Double): Self = StObject.set(x, "tileCacheSize", value.asInstanceOf[js.Any])
        
        inline def setTileCacheSizeUndefined: Self = StObject.set(x, "tileCacheSize", js.undefined)
        
        inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        inline def setTileType(value: String): Self = StObject.set(x, "tileType", value.asInstanceOf[js.Any])
        
        inline def setTileTypeUndefined: Self = StObject.set(x, "tileType", js.undefined)
      }
    }
  }
  /**
    * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
    */
  type TileProvider = RemoteTileProvider
}
