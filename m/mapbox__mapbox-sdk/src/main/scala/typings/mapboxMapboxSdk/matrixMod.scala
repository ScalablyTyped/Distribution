package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.directionsMod.DirectionsProfile
import typings.mapboxMapboxSdk.mapMatchingMod.Point
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/matrix", JSImport.Default)
  @js.native
  def default(config: SdkConfig): MatrixService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/matrix", JSImport.Default)
  @js.native
  def default(config: typings.mapboxMapboxSdk.mod.default): MatrixService = js.native
  
  @js.native
  trait Destination extends StObject {
    
    var location: js.Array[Double] = js.native
    
    var name: String = js.native
  }
  object Destination {
    
    @scala.inline
    def apply(location: js.Array[Double], name: String): Destination = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    @scala.inline
    implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatrixRequest extends StObject {
    
    var annotations: js.UndefOr[DirectionsAnnotation] = js.native
    
    var destinations: js.UndefOr[js.Array[Double]] = js.native
    
    var points: js.Array[Point] = js.native
    
    var profile: js.UndefOr[DirectionsProfile] = js.native
    
    var sources: js.UndefOr[js.Array[Double]] = js.native
  }
  object MatrixRequest {
    
    @scala.inline
    def apply(points: js.Array[Point]): MatrixRequest = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixRequest]
    }
    
    @scala.inline
    implicit class MatrixRequestMutableBuilder[Self <: MatrixRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: DirectionsAnnotation): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setDestinations(value: js.Array[Double]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
      
      @scala.inline
      def setDestinationsVarargs(value: Double*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      @scala.inline
      def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setProfile(value: DirectionsProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[Double]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSourcesVarargs(value: Double*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MatrixResponse extends StObject {
    
    var code: String = js.native
    
    var destinations: js.Array[Destination] = js.native
    
    var distances: js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    var durations: js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    var sources: js.Array[Destination] = js.native
  }
  object MatrixResponse {
    
    @scala.inline
    def apply(code: String, destinations: js.Array[Destination], sources: js.Array[Destination]): MatrixResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixResponse]
    }
    
    @scala.inline
    implicit class MatrixResponseMutableBuilder[Self <: MatrixResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinations(value: js.Array[Destination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      @scala.inline
      def setDistances(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistancesUndefined: Self = StObject.set(x, "distances", js.undefined)
      
      @scala.inline
      def setDistancesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "distances", js.Array(value :_*))
      
      @scala.inline
      def setDurations(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationsUndefined: Self = StObject.set(x, "durations", js.undefined)
      
      @scala.inline
      def setDurationsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "durations", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[Destination]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: Destination*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MatrixService extends StObject {
    
    /**
      * Get a duration and/or distance matrix showing travel times and distances between coordinates.
      * @param request
      */
    def getMatrix(request: MatrixRequest): MapiRequest = js.native
  }
  object MatrixService {
    
    @scala.inline
    def apply(getMatrix: MatrixRequest => MapiRequest): MatrixService = {
      val __obj = js.Dynamic.literal(getMatrix = js.Any.fromFunction1(getMatrix))
      __obj.asInstanceOf[MatrixService]
    }
    
    @scala.inline
    implicit class MatrixServiceMutableBuilder[Self <: MatrixService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMatrix(value: MatrixRequest => MapiRequest): Self = StObject.set(x, "getMatrix", js.Any.fromFunction1(value))
    }
  }
}
