package typings.leafletDraw.leafletMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawEvents {
  
  trait Created
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
      */
    var layerType: String
    
    /**
      * Layer that was just created.
      */
    @JSName("layer")
    var layer_Created: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any]
  }
  object Created {
    
    inline def apply(
      layer: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any],
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Created = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      inline def setLayer(
        value: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any]
      ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String
  }
  object DeleteStart {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DeleteStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteStart] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String
  }
  object DeleteStop {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DeleteStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteStop] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Triggered when layers have been removed (and saved) from the FeatureGroup.
    */
  trait Deleted
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just removed from the map.
      */
    var layers: LayerGroup_[Any]
  }
  object Deleted {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Deleted = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deleted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String
  }
  object DrawStart {
    
    inline def apply(
      layer: Any,
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawStart = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawStart] (val x: Self) extends AnyVal {
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String
  }
  object DrawStop {
    
    inline def apply(
      layer: Any,
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawStop = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawStop] (val x: Self) extends AnyVal {
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawVertex
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just being added from the map.
      */
    var layers: LayerGroup_[Any]
  }
  object DrawVertex {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawVertex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawVertex] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditMove
    extends StObject
       with LeafletEvent {
    
    /**
      * Layer that was just moved.
      */
    @JSName("layer")
    var layer_EditMove: Layer
  }
  object EditMove {
    
    inline def apply(layer: Layer, popup: Any, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): EditMove = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditMove]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditMove] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditResize
    extends StObject
       with LeafletEvent {
    
    /**
      * Layer that was just resized.
      */
    @JSName("layer")
    var layer_EditResize: Layer
  }
  object EditResize {
    
    inline def apply(layer: Layer, popup: Any, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): EditResize = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditResize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditResize] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String
  }
  object EditStart {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditStart] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String
  }
  object EditStop {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditStop] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditVertex
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just being edited from the map.
      */
    var layers: LayerGroup_[Any]
    
    var poly: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any]
  }
  object EditVertex {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      poly: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditVertex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditVertex] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any]): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
    }
  }
  
  trait Edited
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just edited on the map.
      */
    var layers: LayerGroup_[Any]
  }
  object Edited {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Edited = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edited]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Edited] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerContext = LeafletEvent
  
  type ToolbarClosed = LeafletEvent
  
  type ToolbarOpened = LeafletEvent
}
