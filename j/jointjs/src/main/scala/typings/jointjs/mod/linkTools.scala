package typings.jointjs.mod

import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.attributes.NativeSVGAttributes
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.dia.Sides
import typings.jointjs.mod.dia.ToolView
import typings.jointjs.mod.linkTools.Anchor.Options
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkTools {
  
  @JSImport("jointjs", "linkTools.Anchor")
  @js.native
  abstract class Anchor () extends ToolView {
    def this(opt: Options) = this()
    
    var `type`: String = js.native
  }
  object Anchor {
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.undefined
      
      var areaPadding: js.UndefOr[Double] = js.undefined
      
      var customAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.undefined
      
      var defaultAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.undefined
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      
      var resetAnchor: js.UndefOr[Boolean | AnchorJSON] = js.undefined
      
      var restrictArea: js.UndefOr[Boolean] = js.undefined
      
      var snap: js.UndefOr[AnchorCallback[Point]] = js.undefined
      
      var snapRadius: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAnchor(
          value: (/* coords */ typings.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
        ): Self = StObject.set(x, "anchor", js.Any.fromFunction6(value))
        
        inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
        
        inline def setAreaPadding(value: Double): Self = StObject.set(x, "areaPadding", value.asInstanceOf[js.Any])
        
        inline def setAreaPaddingUndefined: Self = StObject.set(x, "areaPadding", js.undefined)
        
        inline def setCustomAnchorAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "customAnchorAttributes", value.asInstanceOf[js.Any])
        
        inline def setCustomAnchorAttributesUndefined: Self = StObject.set(x, "customAnchorAttributes", js.undefined)
        
        inline def setDefaultAnchorAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "defaultAnchorAttributes", value.asInstanceOf[js.Any])
        
        inline def setDefaultAnchorAttributesUndefined: Self = StObject.set(x, "defaultAnchorAttributes", js.undefined)
        
        inline def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        inline def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        inline def setResetAnchor(value: Boolean | AnchorJSON): Self = StObject.set(x, "resetAnchor", value.asInstanceOf[js.Any])
        
        inline def setResetAnchorUndefined: Self = StObject.set(x, "resetAnchor", js.undefined)
        
        inline def setRestrictArea(value: Boolean): Self = StObject.set(x, "restrictArea", value.asInstanceOf[js.Any])
        
        inline def setRestrictAreaUndefined: Self = StObject.set(x, "restrictArea", js.undefined)
        
        inline def setSnap(
          value: (/* coords */ typings.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => Point
        ): Self = StObject.set(x, "snap", js.Any.fromFunction6(value))
        
        inline def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        inline def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Arrowhead")
  @js.native
  abstract class Arrowhead () extends ToolView {
    def this(opt: typings.jointjs.mod.dia.ToolView.Options) = this()
    
    var arrowheadType: String = js.native
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
    
    /* protected */ def onPointerMove(evt: Event): Unit = js.native
    
    /* protected */ def onPointerUp(evt: Event): Unit = js.native
    
    var ratio: Double = js.native
  }
  
  @JSImport("jointjs", "linkTools.Boundary")
  @js.native
  class Boundary () extends ToolView {
    def this(opt: typings.jointjs.mod.linkTools.Boundary.Options) = this()
  }
  object Boundary {
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var padding: js.UndefOr[Double | Sides] = js.undefined
      
      var useModelGeometry: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.jointjs.mod.linkTools.Boundary.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jointjs.mod.linkTools.Boundary.Options]
      }
      
      extension [Self <: typings.jointjs.mod.linkTools.Boundary.Options](x: Self) {
        
        inline def setPadding(value: Double | Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        inline def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Button")
  @js.native
  class Button () extends ToolView {
    def this(opt: typings.jointjs.mod.linkTools.Button.Options) = this()
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
  }
  object Button {
    
    type ActionCallback = js.Function2[/* evt */ Event, /* view */ LinkView, Unit]
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var action: js.UndefOr[ActionCallback] = js.undefined
      
      var distance: js.UndefOr[Double | String] = js.undefined
      
      var markup: js.UndefOr[MarkupJSON] = js.undefined
      
      var offset: js.UndefOr[Double] = js.undefined
      
      var rotate: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.jointjs.mod.linkTools.Button.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jointjs.mod.linkTools.Button.Options]
      }
      
      extension [Self <: typings.jointjs.mod.linkTools.Button.Options](x: Self) {
        
        inline def setAction(value: (/* evt */ Event, /* view */ LinkView) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setDistance(value: Double | String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
        
        inline def setMarkup(value: MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
        
        inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Remove")
  @js.native
  class Remove () extends Button {
    def this(opt: typings.jointjs.mod.linkTools.Button.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.Segments")
  @js.native
  class Segments () extends ToolView {
    def this(opt: typings.jointjs.mod.linkTools.Segments.Options) = this()
  }
  object Segments {
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.undefined
      
      var handleClass: js.UndefOr[js.Any] = js.undefined
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      
      var segmentLengthThreshold: js.UndefOr[Double] = js.undefined
      
      var snapHandle: js.UndefOr[Boolean] = js.undefined
      
      var snapRadius: js.UndefOr[Double] = js.undefined
      
      var stopPropagation: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.jointjs.mod.linkTools.Segments.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jointjs.mod.linkTools.Segments.Options]
      }
      
      extension [Self <: typings.jointjs.mod.linkTools.Segments.Options](x: Self) {
        
        inline def setAnchor(
          value: (/* coords */ typings.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
        ): Self = StObject.set(x, "anchor", js.Any.fromFunction6(value))
        
        inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
        
        inline def setHandleClass(value: js.Any): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
        
        inline def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
        
        inline def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        inline def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        inline def setSegmentLengthThreshold(value: Double): Self = StObject.set(x, "segmentLengthThreshold", value.asInstanceOf[js.Any])
        
        inline def setSegmentLengthThresholdUndefined: Self = StObject.set(x, "segmentLengthThreshold", js.undefined)
        
        inline def setSnapHandle(value: Boolean): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
        
        inline def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
        
        inline def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        inline def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
        
        inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.SourceAnchor")
  @js.native
  class SourceAnchor () extends Anchor {
    def this(opt: Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.SourceArrowhead")
  @js.native
  class SourceArrowhead () extends Arrowhead {
    def this(opt: typings.jointjs.mod.dia.ToolView.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.TargetAnchor")
  @js.native
  class TargetAnchor () extends Anchor {
    def this(opt: Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.TargetArrowhead")
  @js.native
  class TargetArrowhead () extends Arrowhead {
    def this(opt: typings.jointjs.mod.dia.ToolView.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.Vertices")
  @js.native
  class Vertices () extends ToolView {
    def this(opt: typings.jointjs.mod.linkTools.Vertices.Options) = this()
  }
  object Vertices {
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var handleClass: js.UndefOr[js.Any] = js.undefined
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      
      var snapRadius: js.UndefOr[Double] = js.undefined
      
      var stopPropagation: js.UndefOr[Boolean] = js.undefined
      
      var vertexAdding: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.jointjs.mod.linkTools.Vertices.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jointjs.mod.linkTools.Vertices.Options]
      }
      
      extension [Self <: typings.jointjs.mod.linkTools.Vertices.Options](x: Self) {
        
        inline def setHandleClass(value: js.Any): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
        
        inline def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
        
        inline def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        inline def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        inline def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        inline def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
        
        inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
        
        inline def setVertexAdding(value: Boolean): Self = StObject.set(x, "vertexAdding", value.asInstanceOf[js.Any])
        
        inline def setVertexAddingUndefined: Self = StObject.set(x, "vertexAdding", js.undefined)
      }
    }
  }
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ typings.jointjs.mod.g.Point, 
    /* view */ CellView, 
    /* magnet */ SVGElement, 
    /* type */ String, 
    /* linkView */ LinkView, 
    /* toolView */ ToolView, 
    T
  ]
}
