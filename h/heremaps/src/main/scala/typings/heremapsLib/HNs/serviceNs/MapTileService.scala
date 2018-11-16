package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class encapsulates a map tile end point of the HERE Map Tile API.
         */
@JSGlobal("H.service.MapTileService")
@js.native
class MapTileService ()
  extends heremapsLib.HNs.utilNs.EventTarget
     with IConfigurable {
  /**
               * Constructor
               * @param opt_options {H.service.MapTileService.Options=}
               */
  def this(opt_options: heremapsLib.HNs.serviceNs.MapTileServiceNs.Options) = this()
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
  def createTileLayer(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: scala.Double
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: scala.Double,
    opt_dark: scala.Boolean
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters,
    opt_opacity: scala.Double,
    opt_dark: scala.Boolean,
    opt_options: TileProviderOptions
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileProvider(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String
  ): heremapsLib.HNs.mapNs.providerNs.ImageTileProvider = js.native
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
  def createTileProvider(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters
  ): heremapsLib.HNs.mapNs.providerNs.ImageTileProvider = js.native
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
  def createTileProvider(
    tileType: java.lang.String,
    scheme: java.lang.String,
    tileSize: scala.Double,
    format: java.lang.String,
    opt_additionalParameters: ServiceParameters,
    opt_options: TileProviderOptions
  ): heremapsLib.HNs.mapNs.providerNs.ImageTileProvider = js.native
  /**
               * This method returns the map tile service's meta information. The method will return an object once the map tile service's data has been fetched.
               * @returns {(H.service.MapTileService.Info | undefined)} - meta information for this map tile service
               */
  def getInfo(): heremapsLib.HNs.serviceNs.MapTileServiceNs.Info | scala.Unit = js.native
  /**
               * This method returns the map tile type provided by this service.
               * @returns {string} - the map tile type
               */
  def getType(): java.lang.String = js.native
  /**
               * This method returns the map tile service's newest version hash.
               * @returns {string} - meta information for this map tile service
               */
  def getVersion(): java.lang.String = js.native
}

