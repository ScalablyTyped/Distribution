package typings.leafletDraw.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.PathOptions
import typings.leafletDraw.anon.PolylineOptionsclickableb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawOptions {
  
  trait CircleMarkerOptions extends StObject {
    
    /**
      * Whether you can click the circle marker.
      *
      * @default true
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The stroke color of the circle marker.
      *
      * @default '#3388ff'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to fill the circle marker with color.
      *
      * @default true
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fill color of the circle marker. Defaults to the value of the color option.
      *
      * @default null
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /**
      * The opacity of the circle marker.
      *
      * @default 0.2
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke opacity of the circle marker.
      *
      * @default 0.5
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to draw stroke around the circle marker.
      *
      * @default true
      */
    var stroke: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The stroke width in pixels of the circle marker.
      *
      * @default 4
      */
    var weight: js.UndefOr[Double] = js.undefined
    
    /**
      * This should be a high number to ensure that you can draw over all other layers on the map.
      *
      * @default 2000
      */
    var zIndexOffset: js.UndefOr[Double] = js.undefined
  }
  object CircleMarkerOptions {
    
    @scala.inline
    def apply(): CircleMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleMarkerOptions]
    }
    
    @scala.inline
    implicit class CircleMarkerOptionsMutableBuilder[Self <: CircleMarkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      @scala.inline
      def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
    }
  }
  
  trait CircleOptions
    extends StObject
       with SimpleShapeOptions {
    
    /**
      * When not metric, use feet instead of yards for display
      *
      * @default true
      */
    var feet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use the metric measurement system or imperial
      *
      * @default true
      */
    var metric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When not metric, not feet use nautic mile for display
      *
      * @default false
      */
    var nautic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The options used when drawing the circle on the map.
      *
      * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, clickable: true }
      */
    var shapeOptions: js.UndefOr[PathOptions] = js.undefined
    
    /**
      * Whether to show the radius in the tooltip
      *
      * @default true
      */
    var showRadius: js.UndefOr[Boolean] = js.undefined
  }
  object CircleOptions {
    
    @scala.inline
    def apply(): CircleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleOptions]
    }
    
    @scala.inline
    implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeet(value: Boolean): Self = StObject.set(x, "feet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeetUndefined: Self = StObject.set(x, "feet", js.undefined)
      
      @scala.inline
      def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      @scala.inline
      def setNautic(value: Boolean): Self = StObject.set(x, "nautic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNauticUndefined: Self = StObject.set(x, "nautic", js.undefined)
      
      @scala.inline
      def setShapeOptions(value: PathOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
      
      @scala.inline
      def setShowRadius(value: Boolean): Self = StObject.set(x, "showRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRadiusUndefined: Self = StObject.set(x, "showRadius", js.undefined)
    }
  }
  
  trait DrawErrorOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object DrawErrorOptions {
    
    @scala.inline
    def apply(): DrawErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawErrorOptions]
    }
    
    @scala.inline
    implicit class DrawErrorOptionsMutableBuilder[Self <: DrawErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait EditHandlerOptions extends StObject {
    
    /**
      * The path options for how the layers will look while in edit mode.
      * If this is set to null the editable path options will not be set.
      *
      * @default { dashArray: '10, 10', fill: true, fillColor: '#fe57a1', fillOpacity: 0.1, maintainColor: false }
      */
    var selectedPathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object EditHandlerOptions {
    
    @scala.inline
    def apply(): EditHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditHandlerOptions]
    }
    
    @scala.inline
    implicit class EditHandlerOptionsMutableBuilder[Self <: EditHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedPathOptions(value: PathOptions): Self = StObject.set(x, "selectedPathOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedPathOptionsUndefined: Self = StObject.set(x, "selectedPathOptions", js.undefined)
    }
  }
  
  trait EditPolyOptions extends StObject {
    
    /**
      * Determines if line segments can cross
      *
      * @default true
      */
    var allowIntersection: Boolean
    
    /**
      * Edit handler options. Set to false to disable handler.
      */
    var edit: EditHandlerOptions
    
    /**
      * This is the FeatureGroup that stores all editable shapes
      * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
      */
    var featureGroup: FeatureGroup_[js.Any]
    
    /**
      * Set polygon editing options
      */
    var poly: EditPolyOptions
    
    /**
      * Delete handler options. Set to false to disable handler.
      */
    var remove: js.Any
  }
  object EditPolyOptions {
    
    @scala.inline
    def apply(
      allowIntersection: Boolean,
      edit: EditHandlerOptions,
      featureGroup: FeatureGroup_[js.Any],
      poly: EditPolyOptions,
      remove: js.Any
    ): EditPolyOptions = {
      val __obj = js.Dynamic.literal(allowIntersection = allowIntersection.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], featureGroup = featureGroup.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditPolyOptions]
    }
    
    @scala.inline
    implicit class EditPolyOptionsMutableBuilder[Self <: EditPolyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowIntersection(value: Boolean): Self = StObject.set(x, "allowIntersection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdit(value: EditHandlerOptions): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureGroup(value: FeatureGroup_[js.Any]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoly(value: EditPolyOptions): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: js.Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerOptions extends StObject {
    
    /**
      * The icon displayed when drawing a marker.
      *
      * @default L.Icon.Default()
      */
    var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    /**
      * Determines if the draw tool remains enabled after drawing a shape.
      *
      * @default false
      */
    var repeatMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This should be a high number to ensure that you can draw over all other layers on the map.
      *
      * @default 2000
      */
    var zIndexOffset: js.UndefOr[Double] = js.undefined
  }
  object MarkerOptions {
    
    @scala.inline
    def apply(): MarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerOptions]
    }
    
    @scala.inline
    implicit class MarkerOptionsMutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRepeatMode(value: Boolean): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatModeUndefined: Self = StObject.set(x, "repeatMode", js.undefined)
      
      @scala.inline
      def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
    }
  }
  
  trait PolygonOptions
    extends StObject
       with PolylineOptions {
    
    /**
      * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
      *
      * @default {}
      */
    var precision: js.UndefOr[PrecisionOptions] = js.undefined
    
    /**
      * Show the area of the drawn polygon in m², ha or km².
      * The area is only approximate and become less accurate the larger the polygon is.
      *
      * @default false
      */
    var showArea: js.UndefOr[Boolean] = js.undefined
  }
  object PolygonOptions {
    
    @scala.inline
    def apply(): PolygonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolygonOptions]
    }
    
    @scala.inline
    implicit class PolygonOptionsMutableBuilder[Self <: PolygonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrecision(value: PrecisionOptions): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
    }
  }
  
  trait PolylineOptions
    extends StObject
       with SimpleShapeOptions {
    
    /**
      * Determines if line segments can cross.
      *
      * @default true
      */
    var allowIntersection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration options for the error that displays if an intersection is detected.
      *
      * @default { color: '#b00b00', timeout: 2500 }
      */
    var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
    
    /**
      * To change distance calculation
      *
      * @default 1
      */
    var factor: js.UndefOr[Double] = js.undefined
    
    /**
      * When not metric, to use feet instead of yards for display.
      *
      * @default true
      */
    var feet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Distance in pixels between each guide dash.
      *
      * @default 20
      */
    var guidelineDistance: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    /**
      * The maximum length of the guide line
      *
      * @default 4000
      */
    var maxGuideLineLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Once this number of points are placed, finish shape
      *
      * @default 0
      */
    var maxPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines which measurement system (metric or imperial) is used.
      *
      * @default true
      */
    var metric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When not metric, not feet use nautic mile for display
      *
      * @default false
      */
    var nautic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The options used when drawing the polyline/polygon on the map.
      *
      * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: false, clickable: true }
      */
    var shapeOptions: js.UndefOr[PolylineOptionsclickableb] = js.undefined
    
    /**
      * Whether to display distance in the tooltip
      *
      * @default true
      */
    var showLength: js.UndefOr[Boolean] = js.undefined
    
    var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    /**
      * This should be a high number to ensure that you can draw over all other layers on the map.
      *
      * @default 2000
      */
    var zIndexOffset: js.UndefOr[Double] = js.undefined
  }
  object PolylineOptions {
    
    @scala.inline
    def apply(): PolylineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolylineOptions]
    }
    
    @scala.inline
    implicit class PolylineOptionsMutableBuilder[Self <: PolylineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowIntersection(value: Boolean): Self = StObject.set(x, "allowIntersection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowIntersectionUndefined: Self = StObject.set(x, "allowIntersection", js.undefined)
      
      @scala.inline
      def setDrawError(value: DrawErrorOptions): Self = StObject.set(x, "drawError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawErrorUndefined: Self = StObject.set(x, "drawError", js.undefined)
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setFeet(value: Boolean): Self = StObject.set(x, "feet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeetUndefined: Self = StObject.set(x, "feet", js.undefined)
      
      @scala.inline
      def setGuidelineDistance(value: Double): Self = StObject.set(x, "guidelineDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidelineDistanceUndefined: Self = StObject.set(x, "guidelineDistance", js.undefined)
      
      @scala.inline
      def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaxGuideLineLength(value: Double): Self = StObject.set(x, "maxGuideLineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxGuideLineLengthUndefined: Self = StObject.set(x, "maxGuideLineLength", js.undefined)
      
      @scala.inline
      def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
      
      @scala.inline
      def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      @scala.inline
      def setNautic(value: Boolean): Self = StObject.set(x, "nautic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNauticUndefined: Self = StObject.set(x, "nautic", js.undefined)
      
      @scala.inline
      def setShapeOptions(value: PolylineOptionsclickableb): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
      
      @scala.inline
      def setShowLength(value: Boolean): Self = StObject.set(x, "showLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLengthUndefined: Self = StObject.set(x, "showLength", js.undefined)
      
      @scala.inline
      def setTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchIconUndefined: Self = StObject.set(x, "touchIcon", js.undefined)
      
      @scala.inline
      def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
    }
  }
  
  trait RectangleOptions
    extends StObject
       with SimpleShapeOptions {
    
    /**
      * Whether to use the metric measurement system or imperial
      *
      * @default true
      */
    var metric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The options used when drawing the rectangle on the map.
      *
      * @default {stroke: true, weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, showArea: true, clickable: true }
      */
    var shapeOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object RectangleOptions {
    
    @scala.inline
    def apply(): RectangleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleOptions]
    }
    
    @scala.inline
    implicit class RectangleOptionsMutableBuilder[Self <: RectangleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      @scala.inline
      def setShapeOptions(value: PathOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    }
  }
  
  trait SimpleShapeOptions extends StObject {
    
    /**
      * Determines if the draw tool remains enabled after drawing a shape.
      *
      * @default false
      */
    var repeatMode: js.UndefOr[Boolean] = js.undefined
  }
  object SimpleShapeOptions {
    
    @scala.inline
    def apply(): SimpleShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleShapeOptions]
    }
    
    @scala.inline
    implicit class SimpleShapeOptionsMutableBuilder[Self <: SimpleShapeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepeatMode(value: Boolean): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatModeUndefined: Self = StObject.set(x, "repeatMode", js.undefined)
    }
  }
}
