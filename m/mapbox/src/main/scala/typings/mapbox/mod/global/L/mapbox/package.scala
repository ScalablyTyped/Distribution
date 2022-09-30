package typings.mapbox.mod.global.L.mapbox

import typings.mapbox.mod.global.L.mapbox.^
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//////////////////////////////////////////////////////////////////////
///////////////////////////// MAP OBJECT /////////////////////////////
//////////////////////////////////////////////////////////////////////
// Map
//////////////////////////////////////////////////////////////////////
inline def accessToken: String = ^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[String]
inline def accessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])

// FeatureLayer
//////////////////////////////////////////////////////////////////////
/**
  * L.mapbox.featureLayer provides an easy way to integrate GeoJSON from Mapbox and elsewhere into your map.
  */
inline def featureLayer(): FeatureLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")().asInstanceOf[FeatureLayer_]
inline def featureLayer(idOrGeoJson: Any): FeatureLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any]).asInstanceOf[FeatureLayer_]
inline def featureLayer(idOrGeoJson: Any, options: FeatureLayerOptions): FeatureLayer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FeatureLayer_]
inline def featureLayer(idOrGeoJson: Unit, options: FeatureLayerOptions): FeatureLayer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(idOrGeoJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FeatureLayer_]

//////////////////////////////////////////////////////////////////////
////////////////////////////// GEOCODING /////////////////////////////
//////////////////////////////////////////////////////////////////////
// Geocoder
//////////////////////////////////////////////////////////////////////
/**
  * A low-level interface to geocoding, useful for more complex uses and reverse-geocoding.
  */
inline def geocoder(id: String): Geocoder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocoder")(id.asInstanceOf[js.Any]).asInstanceOf[Geocoder_]

// GeocoderControl
//////////////////////////////////////////////////////////////////////
/**
  * Adds geocoder functionality as well as a UI element to a map. This uses the Mapbox Geocoding API.
  */
inline def geocoderControl(id: String): GeocoderControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocoderControl")(id.asInstanceOf[js.Any]).asInstanceOf[GeocoderControl_]
inline def geocoderControl(id: String, options: GeocoderControlOptions): GeocoderControl_ = (^.asInstanceOf[js.Dynamic].applyDynamic("geocoderControl")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeocoderControl_]

// GridControl
//////////////////////////////////////////////////////////////////////
/**
  * Interaction is what we call interactive parts of maps that are created with
  * the powerful tooltips & regions system in TileMill. Under the hood, it's powered by the open UTFGrid specification.
  */
inline def gridControl(layer: String): GridControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridControl")(layer.asInstanceOf[js.Any]).asInstanceOf[GridControl_]
inline def gridControl(layer: String, options: GridControlOptions): GridControl_ = (^.asInstanceOf[js.Dynamic].applyDynamic("gridControl")(layer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GridControl_]

// GridLayer
//////////////////////////////////////////////////////////////////////
/**
  * An L.mapbox.gridLayer loads UTFGrid tiles of interactivity into your map, which you can easily access with L.mapbox.gridControl.
  */
inline def gridLayer(idOrTileJson: Any): GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(idOrTileJson.asInstanceOf[js.Any]).asInstanceOf[GridLayer_]

// InfoControl
//////////////////////////////////////////////////////////////////////
/**
  * A map control that shows a toggleable info container. If set, attribution is auto-detected from active layers and added to the info container.
  */
inline def infoControl(): InfoControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("infoControl")().asInstanceOf[InfoControl_]
inline def infoControl(options: ControlOptions): InfoControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("infoControl")(options.asInstanceOf[js.Any]).asInstanceOf[InfoControl_]

// LegendControl
//////////////////////////////////////////////////////////////////////
/**
  * A map control that shows legends added to maps in Mapbox.
  * Legends are auto-detected from active layers.
  */
inline def legendControl(): LegendControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legendControl")().asInstanceOf[LegendControl_]
inline def legendControl(options: ControlOptions): LegendControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legendControl")(options.asInstanceOf[js.Any]).asInstanceOf[LegendControl_]

/**
  * Create and automatically configure a map with layers, markers, and interactivity.
  */
inline def map(element: String, idOrTileJson: Any): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any])).asInstanceOf[Map_]
inline def map(element: String, idOrTileJson: Any, options: MapOptions): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map_]
inline def map(element: Element, idOrTileJson: Any): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any])).asInstanceOf[Map_]
inline def map(element: Element, idOrTileJson: Any, options: MapOptions): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map_]

//////////////////////////////////////////////////////////////////////
/////////////////////////////// UTILITY //////////////////////////////
//////////////////////////////////////////////////////////////////////
/**
  * A HTML sanitization function, with the same effect as the default value of the sanitizer option of L.mapbox.featureLayer, L.mapbox.gridControl, and L.mapbox.legendControl.
  */
inline def sanitize(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(text.asInstanceOf[js.Any]).asInstanceOf[String]

// ShareControl
//////////////////////////////////////////////////////////////////////
/**
  * Adds a "Share" button to the map, which can be used to share the map to Twitter or Facebook, or generate HTML for a map embed.
  */
inline def shareControl(id: String): ShareControl_ = ^.asInstanceOf[js.Dynamic].applyDynamic("shareControl")(id.asInstanceOf[js.Any]).asInstanceOf[ShareControl_]
inline def shareControl(id: String, options: ShareControlOptions): ShareControl_ = (^.asInstanceOf[js.Dynamic].applyDynamic("shareControl")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShareControl_]

// StyleLayer
//////////////////////////////////////////////////////////////////////
/**
  * L.mapbox.styleLayer provides a way to integrate styles created with Mapbox Studio into your map.
  */
inline def styleLayer(url: String): StyleLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("styleLayer")(url.asInstanceOf[js.Any]).asInstanceOf[StyleLayer_]
inline def styleLayer(url: String, options: StyleLayerOptions): StyleLayer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("styleLayer")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StyleLayer_]

/**
  * A mustache template rendering function, as used by the templating feature provided by L.mapbox.gridControl.
  */
inline def template(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any]).asInstanceOf[String]
inline def template(template: String, data: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]

//////////////////////////////////////////////////////////////////////
/////////////////////////////// LAYERS ///////////////////////////////
//////////////////////////////////////////////////////////////////////
// TileLayer
//////////////////////////////////////////////////////////////////////
/**
  * You can add a tiled layer to your map with L.mapbox.tileLayer(), a simple interface to layers from Mapbox and elsewhere.
  */
inline def tileLayer(idOrTileJson: String): TileLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tileLayer")(idOrTileJson.asInstanceOf[js.Any]).asInstanceOf[TileLayer_]
inline def tileLayer(idOrTileJson: String, options: TileLayerOptions): TileLayer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tileLayer")(idOrTileJson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TileLayer_]

type FilterFunction = js.Function1[/* feature */ Any, Boolean]

type StyleLayer_ = typings.leaflet.mod.TileLayer_
