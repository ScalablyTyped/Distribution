package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.map.layer.TileLayer
import typings.heremaps.H.map.provider.ImageTileProvider
import typings.heremaps.H.service.MapTileService.Info
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates a map tile end point of the HERE Map Tile API.
  */
@js.native
trait MapTileService
  extends StObject
     with EventTarget
     with IConfigurable {
  
  /**
    * This method creates a tile layer. This layer can be used as a layer on a map's data model.
    * @param tileType {string} - the tile type
    * @param scheme {string} - the tile scheme
    * @param tileSize {number} - the tile size
    * @param format {string} - the tile image format
    * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the map tile service
    * @param opt_opacity {number=} - The opacity of this layer
    * @param opt_dark {boolean=} - Indicates whether the content of this layer is mainly dark, default is false See also H.Map.Options#autoColor
    * @param opt_options {H.service.TileProviderOptions=} - additional set of options for the provider
    * @returns {H.map.layer.TileLayer} - the tile layer
    */
  def createTileLayer(tileType: String, scheme: String, tileSize: Double, format: String): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Double
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Double,
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Double,
    opt_dark: Boolean,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Double,
    opt_dark: Unit,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Unit,
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Unit,
    opt_dark: Boolean,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_opacity: Unit,
    opt_dark: Unit,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Double
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Double,
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Double,
    opt_dark: Boolean,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Double,
    opt_dark: Unit,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Unit,
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Unit,
    opt_dark: Boolean,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: Unit,
    opt_dark: Unit,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  
  /**
    * This method creates a tile provider which uses the specified map tiles. This provider can be used as a data source for an ImageTileLayer.
    * @param tileType {string} - the tile type
    * @param scheme {string} - the tile scheme
    * @param tileSize {number} - the tile size
    * @param format {string} - the tile image format
    * @param opt_additionalParameters {H.service.ServiceParameters=} - a hash of additional parameters to be
    * @param opt_options {H.service.TileProviderOptions=} - additional set of options for the provider
    * @returns {H.map.provider.ImageTileProvider} - the image tile provider
    */
  def createTileProvider(tileType: String, scheme: String, tileSize: Double, format: String): ImageTileProvider = js.native
  def createTileProvider(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: Unit,
    opt_options: TileProviderOptions
  ): ImageTileProvider = js.native
  def createTileProvider(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters
  ): ImageTileProvider = js.native
  def createTileProvider(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_options: TileProviderOptions
  ): ImageTileProvider = js.native
  
  /**
    * This method returns the map tile service's meta information. The method will return an object once the map tile service's data has been fetched.
    * @returns {(H.service.MapTileService.Info | undefined)} - meta information for this map tile service
    */
  def getInfo(): Info | Unit = js.native
  
  /**
    * This method returns the map tile type provided by this service.
    * @returns {string} - the map tile type
    */
  def getType(): String = js.native
  
  /**
    * This method returns the map tile service's newest version hash.
    * @returns {string} - meta information for this map tile service
    */
  def getVersion(): String = js.native
}
object MapTileService {
  
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
    * @property type {string=} - the type of the map tile service to communicate with, e.g. 'base' (default), 'aerial', etc. (refer to the Map Tile REST API documentation for available types)
    * @property version {string=} - the map version hash to use for retrieving tiles, default is newest and will be automatically updated
    * @property subDomain {string=} - the sub-domain of the map tile service relative to the platform's base URL, default is 'maps'
    * @property path {string=} - the path of the map tile service, default is 'maptile/2.1'
    */
  trait Options extends StObject {
    
    var path: js.UndefOr[String] = js.undefined
    
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
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
      
      inline def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
