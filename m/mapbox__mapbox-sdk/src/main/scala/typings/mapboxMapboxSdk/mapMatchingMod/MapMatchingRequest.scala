package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typings.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typings.mapboxMapboxSdk.directionsMod.DirectionsProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMatchingRequest extends js.Object {
  
  /**
    * Specify additional metadata that should be returned.
    */
  var annotations: js.UndefOr[DirectionsAnnotation] = js.native
  
  /**
    * Format of the returned geometry. (optional, default "polyline")
    */
  var geometries: js.UndefOr[DirectionsGeometry] = js.native
  
  /**
    * Language of returned turn-by-turn text instructions. See supported languages. (optional, default "en")
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Type of returned overview geometry. (optional, default "simplified"
    */
  var overview: js.UndefOr[DirectionsOverview] = js.native
  
  /**
    * An ordered array of MapMatchingPoints, between 2 and 100 (inclusive).
    */
  var points: js.Array[MapMatchingPoint] = js.native
  
  /**
    * A directions profile ID. (optional, default driving)
    */
  var profile: js.UndefOr[DirectionsProfile] = js.native
  
  /**
    * Whether to return steps and turn-by-turn instructions. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to transparently remove clusters and re-sample traces for improved map matching results. (optional, default false)
    */
  var tidy: js.UndefOr[Boolean] = js.native
}
object MapMatchingRequest {
  
  @scala.inline
  def apply(points: js.Array[MapMatchingPoint]): MapMatchingRequest = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingRequest]
  }
  
  @scala.inline
  implicit class MapMatchingRequestOps[Self <: MapMatchingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPointsVarargs(value: MapMatchingPoint*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[MapMatchingPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotations(value: DirectionsAnnotation): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setGeometries(value: DirectionsGeometry): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOverview(value: DirectionsOverview): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setProfile(value: DirectionsProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setTidy(value: Boolean): Self = this.set("tidy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTidy: Self = this.set("tidy", js.undefined)
  }
}
