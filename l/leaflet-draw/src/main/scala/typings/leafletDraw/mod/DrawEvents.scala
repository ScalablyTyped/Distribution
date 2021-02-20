package typings.leafletDraw.mod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import typings.leaflet.mod.Rectangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawEvents {
  
  @js.native
  trait Created extends LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
      */
    var layerType: String = js.native
    
    /**
      * Layer that was just created.
      */
    @JSName("layer")
    var layer_Created: Circle_[_] | CircleMarker_[_] | Marker_[_] | Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) | Rectangle_[_] = js.native
  }
  object Created {
    
    @scala.inline
    def apply(
      layer: Circle_[_] | CircleMarker_[_] | Marker_[_] | Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) | Rectangle_[_],
      layerType: String,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): Created = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(
        value: Circle_[_] | CircleMarker_[_] | Marker_[_] | Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) | Rectangle_[_]
      ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteStart extends LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String = js.native
  }
  object DeleteStart {
    
    @scala.inline
    def apply(
      handler: String,
      layer: js.Any,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): DeleteStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStart]
    }
    
    @scala.inline
    implicit class DeleteStartMutableBuilder[Self <: DeleteStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteStop extends LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String = js.native
  }
  object DeleteStop {
    
    @scala.inline
    def apply(
      handler: String,
      layer: js.Any,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): DeleteStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStop]
    }
    
    @scala.inline
    implicit class DeleteStopMutableBuilder[Self <: DeleteStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Triggered when layers have been removed (and saved) from the FeatureGroup.
    */
  @js.native
  trait Deleted extends LeafletEvent {
    
    /**
      * List of all layers just removed from the map.
      */
    var layers: LayerGroup_[_] = js.native
  }
  object Deleted {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layers: LayerGroup_[_],
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): Deleted = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deleted]
    }
    
    @scala.inline
    implicit class DeletedMutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: LayerGroup_[_]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawStart extends LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String = js.native
  }
  object DrawStart {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layerType: String,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): DrawStart = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStart]
    }
    
    @scala.inline
    implicit class DrawStartMutableBuilder[Self <: DrawStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawStop extends LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String = js.native
  }
  object DrawStop {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layerType: String,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): DrawStop = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStop]
    }
    
    @scala.inline
    implicit class DrawStopMutableBuilder[Self <: DrawStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawVertex extends LeafletEvent {
    
    /**
      * List of all layers just being added from the map.
      */
    var layers: LayerGroup_[_] = js.native
  }
  object DrawVertex {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layers: LayerGroup_[_],
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): DrawVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawVertex]
    }
    
    @scala.inline
    implicit class DrawVertexMutableBuilder[Self <: DrawVertex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: LayerGroup_[_]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditMove extends LeafletEvent {
    
    /**
      * Layer that was just moved.
      */
    @JSName("layer")
    var layer_EditMove: Layer = js.native
  }
  object EditMove {
    
    @scala.inline
    def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditMove = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditMove]
    }
    
    @scala.inline
    implicit class EditMoveMutableBuilder[Self <: EditMove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditResize extends LeafletEvent {
    
    /**
      * Layer that was just resized.
      */
    @JSName("layer")
    var layer_EditResize: Layer = js.native
  }
  object EditResize {
    
    @scala.inline
    def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditResize = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditResize]
    }
    
    @scala.inline
    implicit class EditResizeMutableBuilder[Self <: EditResize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditStart extends LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String = js.native
  }
  object EditStart {
    
    @scala.inline
    def apply(
      handler: String,
      layer: js.Any,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): EditStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStart]
    }
    
    @scala.inline
    implicit class EditStartMutableBuilder[Self <: EditStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditStop extends LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String = js.native
  }
  object EditStop {
    
    @scala.inline
    def apply(
      handler: String,
      layer: js.Any,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): EditStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStop]
    }
    
    @scala.inline
    implicit class EditStopMutableBuilder[Self <: EditStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditVertex extends LeafletEvent {
    
    /**
      * List of all layers just being edited from the map.
      */
    var layers: LayerGroup_[_] = js.native
    
    var poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_] = js.native
  }
  object EditVertex {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layers: LayerGroup_[_],
      poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_],
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): EditVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditVertex]
    }
    
    @scala.inline
    implicit class EditVertexMutableBuilder[Self <: EditVertex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: LayerGroup_[_]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoly(value: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_]): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Edited extends LeafletEvent {
    
    /**
      * List of all layers just edited on the map.
      */
    var layers: LayerGroup_[_] = js.native
  }
  object Edited {
    
    @scala.inline
    def apply(
      layer: js.Any,
      layers: LayerGroup_[_],
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): Edited = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edited]
    }
    
    @scala.inline
    implicit class EditedMutableBuilder[Self <: Edited] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: LayerGroup_[_]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerContext = LeafletEvent
  
  type ToolbarClosed = LeafletEvent
  
  type ToolbarOpened = LeafletEvent
}
