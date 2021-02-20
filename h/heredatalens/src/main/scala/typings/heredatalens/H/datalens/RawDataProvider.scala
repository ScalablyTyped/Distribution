package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.ObjectLayer.Row
import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heremaps.H.map.provider.RemoteTileProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how to load data from a raw data file
  * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
  */
@js.native
trait RawDataProvider extends RemoteTileProvider {
  
  /**
    * Updates the data url. Note that new data will be fetched only after the reload method is called.
    */
  def setDataUrl(dataUrl: String): Unit = js.native
}
object RawDataProvider {
  
  /**
    * A GeoJSON feature
    * A GeoJSON feature object which conforms to the standard GeoJSON spec
    */
  type Feature = js.Any
  
  /**
    * Geographic coordinates
    * A geographic coordinates pair [lat, lng]
    */
  type GeoCoordinates = js.Tuple2[Double, Double]
  
  /**
    * A helper class used in the worker thread
    * This helper class provides convenience functions you can use in the worker thread
    */
  @js.native
  trait Helpers extends StObject {
    
    /** Translates geographical coordinates (latitude, longitude) to world pixel coordinates. */
    var latLngToPixel: js.UndefOr[
        js.Function4[
          /* latitude */ Latitude, 
          /* longitude */ Longitude, 
          /* z */ Zoom, 
          /* tileSize */ TileSize, 
          PixelCoordinates
        ]
      ] = js.native
    
    /** Takes CSV data as input, parses it, and return the parsed result. */
    var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.native
    
    /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
    var pixelToLatLng: js.UndefOr[
        js.Function4[/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize, GeoCoordinates]
      ] = js.native
  }
  object Helpers {
    
    @scala.inline
    def apply(): Helpers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Helpers]
    }
    
    @scala.inline
    implicit class HelpersMutableBuilder[Self <: Helpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatLngToPixel(
        value: (/* latitude */ Latitude, /* longitude */ Longitude, /* z */ Zoom, /* tileSize */ TileSize) => PixelCoordinates
      ): Self = StObject.set(x, "latLngToPixel", js.Any.fromFunction4(value))
      
      @scala.inline
      def setLatLngToPixelUndefined: Self = StObject.set(x, "latLngToPixel", js.undefined)
      
      @scala.inline
      def setParseCSV(value: /* obj */ js.Any => js.Array[_]): Self = StObject.set(x, "parseCSV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseCSVUndefined: Self = StObject.set(x, "parseCSV", js.undefined)
      
      @scala.inline
      def setPixelToLatLng(value: (/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize) => GeoCoordinates): Self = StObject.set(x, "pixelToLatLng", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPixelToLatLngUndefined: Self = StObject.set(x, "pixelToLatLng", js.undefined)
    }
  }
  
  /**
    * Latitude coordinate
    * The latitude in the geographic coordinates pair
    */
  type Latitude = Double
  
  /**
    * Longitude coordinate
    * The longitude in the geographic coordinates pair
    */
  type Longitude = Double
  
  @js.native
  trait Options extends StObject {
    
    /** Defines how the input data is mapped to an array of GeoJSON features */
    var dataToFeatures: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[Feature]]] = js.native
    
    /** The data url to fetch */
    var dataUrl: js.UndefOr[String] = js.native
    
    /** Defines how GeoJSON features on a tile should be mapped to data rows, which are inputs to layers such as ObjectLayer and HeatmapLayer */
    var featuresToRows: js.UndefOr[
        js.Function6[
          /* features */ js.Array[Feature], 
          /* x */ X, 
          /* y */ Y, 
          /* z */ Zoom, 
          /* tileSize */ TileSize, 
          /* helpers */ Helpers, 
          js.Array[Row]
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataToFeatures(value: /* obj */ js.Any => js.Array[Feature]): Self = StObject.set(x, "dataToFeatures", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataToFeaturesUndefined: Self = StObject.set(x, "dataToFeatures", js.undefined)
      
      @scala.inline
      def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
      
      @scala.inline
      def setFeaturesToRows(
        value: (/* features */ js.Array[Feature], /* x */ X, /* y */ Y, /* z */ Zoom, /* tileSize */ TileSize, /* helpers */ Helpers) => js.Array[Row]
      ): Self = StObject.set(x, "featuresToRows", js.Any.fromFunction6(value))
      
      @scala.inline
      def setFeaturesToRowsUndefined: Self = StObject.set(x, "featuresToRows", js.undefined)
    }
  }
  
  /**
    * Pixel coordinate in the x direction
    * The x coordinate of the pixel coordinates pair [px, py]
    */
  type PX = Double
  
  /**
    * Pixel coordinate in the y direction
    * The y coordinate of the pixel coordinates pair [px, py]
    */
  type PY = Double
  
  /**
    * Pixel coordinates
    * Pixel coordinates [px, py] pair
    */
  type PixelCoordinates = js.Tuple2[Double, Double]
  
  /**
    * Tile size
    * The tile size in pixels.
    */
  type TileSize = js.Any
}
