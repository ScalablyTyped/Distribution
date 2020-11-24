package typings.heremaps.H.service

import typings.heremaps.H.map.layer.TileLayer
import typings.heremaps.H.map.provider.ImageTileProvider
import typings.heremaps.H.service.MapTileService.Info
import typings.heremaps.H.util.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates a map tile end point of the HERE Map Tile API.
  */
@js.native
trait MapTileService_
  extends EventTarget
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
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: js.UndefOr[scala.Nothing],
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: Boolean,
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: Double
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: Double,
    opt_dark: js.UndefOr[scala.Nothing],
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: Double,
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: js.UndefOr[scala.Nothing],
    opt_opacity: Double,
    opt_dark: Boolean,
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
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: js.UndefOr[scala.Nothing],
    opt_options: TileProviderOptions
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: Boolean
  ): TileLayer = js.native
  def createTileLayer(
    tileType: String,
    scheme: String,
    tileSize: Double,
    format: String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: js.UndefOr[scala.Nothing],
    opt_dark: Boolean,
    opt_options: TileProviderOptions
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
    opt_dark: js.UndefOr[scala.Nothing],
    opt_options: TileProviderOptions
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
    opt_additionalParameters: js.UndefOr[scala.Nothing],
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
