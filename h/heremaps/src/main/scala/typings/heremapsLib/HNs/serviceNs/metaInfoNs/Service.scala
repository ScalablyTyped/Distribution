package typings
package heremapsLib.HNs.serviceNs.metaInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
             */
@JSGlobal("H.service.metaInfo.Service")
@js.native
class Service ()
  extends heremapsLib.HNs.utilNs.EventTarget
     with heremapsLib.HNs.serviceNs.IConfigurable {
  /**
                   * Constructor
                   * @param opt_options {H.service.metaInfo.Service.Options=} - additional service parameters
                   */
  def this(opt_options: heremapsLib.HNs.serviceNs.metaInfoNs.ServiceNs.Options) = this()
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
  def createTileLayer(tileSize: scala.Double, pixelRatio: scala.Double): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(tileSize: scala.Double, pixelRatio: scala.Double, opt_categoryFilter: js.Array[java.lang.String]): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters,
    opt_tileType: java.lang.String
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileLayer(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters,
    opt_tileType: java.lang.String,
    opt_scheme: java.lang.String
  ): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
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
  def createTileProvider(tileSize: scala.Double, pixelRatio: scala.Double): heremapsLib.HNs.mapNs.providerNs.TileProvider = js.native
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
  def createTileProvider(tileSize: scala.Double, pixelRatio: scala.Double, opt_categoryFilter: js.Array[java.lang.String]): heremapsLib.HNs.mapNs.providerNs.TileProvider = js.native
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
  def createTileProvider(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters
  ): heremapsLib.HNs.mapNs.providerNs.TileProvider = js.native
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
  def createTileProvider(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters,
    opt_tileType: java.lang.String
  ): heremapsLib.HNs.mapNs.providerNs.TileProvider = js.native
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
  def createTileProvider(
    tileSize: scala.Double,
    pixelRatio: scala.Double,
    opt_categoryFilter: js.Array[java.lang.String],
    opt_additionalParameters: heremapsLib.HNs.serviceNs.ServiceParameters,
    opt_tileType: java.lang.String,
    opt_scheme: java.lang.String
  ): heremapsLib.HNs.mapNs.providerNs.TileProvider = js.native
  /**
                   * This method returns the meta info tile service's meta information. The method will return an object once the map tile service's data has been fetched.
                   * @returns {(H.service.metaInfo.Service.Info | undefined)} - meta information for this meta info tile service
                   */
  def getInfo(): heremapsLib.HNs.serviceNs.metaInfoNs.ServiceNs.Info | scala.Unit = js.native
  /**
                   * This method returns the meta info tile service's newest version hash.
                   * @returns {string} - meta information for this map tile service
                   */
  def getVersion(): java.lang.String = js.native
}

