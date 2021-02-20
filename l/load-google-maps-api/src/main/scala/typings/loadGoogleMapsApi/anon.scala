package typings.loadGoogleMapsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofgeometry extends StObject {
    
    val encoding: js.Any = js.native
    
    val poly: js.Any = js.native
    
    /**
      * Utility functions for computing geodesic angles, distances and areas.
      * The default radius is Earth's radius of 6378137 meters.
      */
    val spherical: js.Any = js.native
  }
  object Typeofgeometry {
    
    @scala.inline
    def apply(encoding: js.Any, poly: js.Any, spherical: js.Any): Typeofgeometry = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofgeometry]
    }
    
    @scala.inline
    implicit class TypeofgeometryMutableBuilder[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: js.Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoly(value: js.Any): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpherical(value: js.Any): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofmaps extends StObject {
    
    val Data: js.Any = js.native
    
    val Marker: js.Any = js.native
    
    val OverlayView: js.Any = js.native
    
    // TODO find source documentation
    val adsense: js.Any = js.native
    
    val drawing: js.Any = js.native
    
    val event: js.Any = js.native
    
    val geometry: Typeofgeometry = js.native
    
    val places: js.Any = js.native
    
    val visualization: js.Any = js.native
  }
  object Typeofmaps {
    
    @scala.inline
    def apply(
      Data: js.Any,
      Marker: js.Any,
      OverlayView: js.Any,
      adsense: js.Any,
      drawing: js.Any,
      event: js.Any,
      geometry: Typeofgeometry,
      places: js.Any,
      visualization: js.Any
    ): Typeofmaps = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofmaps]
    }
    
    @scala.inline
    implicit class TypeofmapsMutableBuilder[Self <: Typeofmaps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdsense(value: js.Any): Self = StObject.set(x, "adsense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawing(value: js.Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: js.Any): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayView(value: js.Any): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaces(value: js.Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualization(value: js.Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
    }
  }
}
