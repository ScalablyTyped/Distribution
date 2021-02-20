package typings.mapbox.mod.global.L

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mapbox {
  
  type FilterFunction = js.Function1[/* feature */ js.Any, scala.Boolean]
  
  type StyleLayer_ = typings.leaflet.mod.TileLayer_
  
  //////////////////////////////////////////////////////////////////////
  ///////////////////////////// MAP OBJECT /////////////////////////////
  //////////////////////////////////////////////////////////////////////
  // Map
  //////////////////////////////////////////////////////////////////////
  @scala.inline
  def accessToken: java.lang.String = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[java.lang.String]
  @scala.inline
  def accessToken_=(x: java.lang.String): scala.Unit = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])
  
  // FeatureLayer
  //////////////////////////////////////////////////////////////////////
  /**
    * L.mapbox.featureLayer provides an easy way to integrate GeoJSON from Mapbox and elsewhere into your map.
    */
  @scala.inline
  def featureLayer(): typings.mapbox.mod.global.L.mapbox.FeatureLayer_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")().asInstanceOf[typings.mapbox.mod.global.L.mapbox.FeatureLayer_]
  @scala.inline
  def featureLayer(
    idOrGeoJson: js.UndefOr[scala.Nothing],
    options: typings.mapbox.mod.global.L.mapbox.FeatureLayerOptions
  ): typings.mapbox.mod.global.L.mapbox.FeatureLayer_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.FeatureLayer_]
  @scala.inline
  def featureLayer(idOrGeoJson: js.Any): typings.mapbox.mod.global.L.mapbox.FeatureLayer_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.FeatureLayer_]
  @scala.inline
  def featureLayer(idOrGeoJson: js.Any, options: typings.mapbox.mod.global.L.mapbox.FeatureLayerOptions): typings.mapbox.mod.global.L.mapbox.FeatureLayer_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.FeatureLayer_]
  
  //////////////////////////////////////////////////////////////////////
  ////////////////////////////// GEOCODING /////////////////////////////
  //////////////////////////////////////////////////////////////////////
  // Geocoder
  //////////////////////////////////////////////////////////////////////
  /**
    * A low-level interface to geocoding, useful for more complex uses and reverse-geocoding.
    */
  @scala.inline
  def geocoder(id: java.lang.String): typings.mapbox.mod.global.L.mapbox.Geocoder_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("geocoder")(id.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.Geocoder_]
  
  // GeocoderControl
  //////////////////////////////////////////////////////////////////////
  /**
    * Adds geocoder functionality as well as a UI element to a map. This uses the Mapbox Geocoding API.
    */
  @scala.inline
  def geocoderControl(id: java.lang.String): typings.mapbox.mod.global.L.mapbox.GeocoderControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("geocoderControl")(id.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.GeocoderControl_]
  @scala.inline
  def geocoderControl(id: java.lang.String, options: typings.mapbox.mod.global.L.mapbox.GeocoderControlOptions): typings.mapbox.mod.global.L.mapbox.GeocoderControl_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("geocoderControl")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.GeocoderControl_]
  
  // GridControl
  //////////////////////////////////////////////////////////////////////
  /**
    * Interaction is what we call interactive parts of maps that are created with
    * the powerful tooltips & regions system in TileMill. Under the hood, it's powered by the open UTFGrid specification.
    */
  @scala.inline
  def gridControl(layer: java.lang.String): typings.mapbox.mod.global.L.mapbox.GridControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("gridControl")(layer.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.GridControl_]
  @scala.inline
  def gridControl(layer: java.lang.String, options: typings.mapbox.mod.global.L.mapbox.GridControlOptions): typings.mapbox.mod.global.L.mapbox.GridControl_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("gridControl")(layer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.GridControl_]
  
  // GridLayer
  //////////////////////////////////////////////////////////////////////
  /**
    * An L.mapbox.gridLayer loads UTFGrid tiles of interactivity into your map, which you can easily access with L.mapbox.gridControl.
    */
  @scala.inline
  def gridLayer(idOrTileJson: js.Any): typings.mapbox.mod.global.L.mapbox.GridLayer_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(idOrTileJson.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.GridLayer_]
  
  // InfoControl
  //////////////////////////////////////////////////////////////////////
  /**
    * A map control that shows a toggleable info container. If set, attribution is auto-detected from active layers and added to the info container.
    */
  @scala.inline
  def infoControl(): typings.mapbox.mod.global.L.mapbox.InfoControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("infoControl")().asInstanceOf[typings.mapbox.mod.global.L.mapbox.InfoControl_]
  @scala.inline
  def infoControl(options: typings.mapbox.mod.global.L.mapbox.ControlOptions): typings.mapbox.mod.global.L.mapbox.InfoControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("infoControl")(options.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.InfoControl_]
  
  // LegendControl
  //////////////////////////////////////////////////////////////////////
  /**
    * A map control that shows legends added to maps in Mapbox.
    * Legends are auto-detected from active layers.
    */
  @scala.inline
  def legendControl(): typings.mapbox.mod.global.L.mapbox.LegendControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("legendControl")().asInstanceOf[typings.mapbox.mod.global.L.mapbox.LegendControl_]
  @scala.inline
  def legendControl(options: typings.mapbox.mod.global.L.mapbox.ControlOptions): typings.mapbox.mod.global.L.mapbox.LegendControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("legendControl")(options.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.LegendControl_]
  
  /**
    * Create and automatically configure a map with layers, markers, and interactivity.
    */
  @scala.inline
  def map(element: java.lang.String, idOrTileJson: js.Any): typings.mapbox.mod.global.L.mapbox.Map_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.Map_]
  @scala.inline
  def map(
    element: java.lang.String,
    idOrTileJson: js.Any,
    options: typings.mapbox.mod.global.L.mapbox.MapOptions
  ): typings.mapbox.mod.global.L.mapbox.Map_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.Map_]
  @scala.inline
  def map(element: typings.std.Element, idOrTileJson: js.Any): typings.mapbox.mod.global.L.mapbox.Map_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.Map_]
  @scala.inline
  def map(
    element: typings.std.Element,
    idOrTileJson: js.Any,
    options: typings.mapbox.mod.global.L.mapbox.MapOptions
  ): typings.mapbox.mod.global.L.mapbox.Map_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.Map_]
  
  //////////////////////////////////////////////////////////////////////
  /////////////////////////////// UTILITY //////////////////////////////
  //////////////////////////////////////////////////////////////////////
  /**
    * A HTML sanitization function, with the same effect as the default value of the sanitizer option of L.mapbox.featureLayer, L.mapbox.gridControl, and L.mapbox.legendControl.
    */
  @scala.inline
  def sanitize(text: java.lang.String): java.lang.String = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  // ShareControl
  //////////////////////////////////////////////////////////////////////
  /**
    * Adds a "Share" button to the map, which can be used to share the map to Twitter or Facebook, or generate HTML for a map embed.
    */
  @scala.inline
  def shareControl(id: java.lang.String): typings.mapbox.mod.global.L.mapbox.ShareControl_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("shareControl")(id.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.ShareControl_]
  @scala.inline
  def shareControl(id: java.lang.String, options: typings.mapbox.mod.global.L.mapbox.ShareControlOptions): typings.mapbox.mod.global.L.mapbox.ShareControl_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("shareControl")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.ShareControl_]
  
  // StyleLayer
  //////////////////////////////////////////////////////////////////////
  /**
    * L.mapbox.styleLayer provides a way to integrate styles created with Mapbox Studio into your map.
    */
  @scala.inline
  def styleLayer(url: java.lang.String): typings.mapbox.mod.global.L.mapbox.StyleLayer_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("styleLayer")(url.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.StyleLayer_]
  @scala.inline
  def styleLayer(url: java.lang.String, options: typings.mapbox.mod.global.L.mapbox.StyleLayerOptions): typings.mapbox.mod.global.L.mapbox.StyleLayer_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("styleLayer")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.StyleLayer_]
  
  /**
    * A mustache template rendering function, as used by the templating feature provided by L.mapbox.gridControl.
    */
  @scala.inline
  def template(template: java.lang.String): java.lang.String = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def template(template: java.lang.String, data: js.Any): java.lang.String = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  //////////////////////////////////////////////////////////////////////
  /////////////////////////////// LAYERS ///////////////////////////////
  //////////////////////////////////////////////////////////////////////
  // TileLayer
  //////////////////////////////////////////////////////////////////////
  /**
    * You can add a tiled layer to your map with L.mapbox.tileLayer(), a simple interface to layers from Mapbox and elsewhere.
    */
  @scala.inline
  def tileLayer(idOrTileJson: java.lang.String): typings.mapbox.mod.global.L.mapbox.TileLayer_ = typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("tileLayer")(idOrTileJson.asInstanceOf[js.Any]).asInstanceOf[typings.mapbox.mod.global.L.mapbox.TileLayer_]
  @scala.inline
  def tileLayer(idOrTileJson: java.lang.String, options: typings.mapbox.mod.global.L.mapbox.TileLayerOptions): typings.mapbox.mod.global.L.mapbox.TileLayer_ = (typings.mapbox.mod.global.L.mapbox.^.asInstanceOf[js.Dynamic].applyDynamic("tileLayer")(idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mapbox.mod.global.L.mapbox.TileLayer_]
}
