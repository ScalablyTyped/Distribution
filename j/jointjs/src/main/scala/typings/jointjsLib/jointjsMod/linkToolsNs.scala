package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "linkTools")
@js.native
object linkToolsNs extends js.Object {
  @js.native
  abstract class Anchor ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    def this(opt: jointjsLib.jointjsMod.linkToolsNs.AnchorNs.Options) = this()
    var `type`: java.lang.String = js.native
  }
  
  @js.native
  abstract class Arrowhead ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    var arrowheadType: java.lang.String = js.native
    var ratio: scala.Double = js.native
    /* protected */ def onPointerDown(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def onPointerMove(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def onPointerUp(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  }
  
  @js.native
  class Boundary ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    def this(opt: jointjsLib.jointjsMod.linkToolsNs.BoundaryNs.Options) = this()
  }
  
  @js.native
  class Button ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    def this(opt: jointjsLib.jointjsMod.linkToolsNs.ButtonNs.Options) = this()
    /* protected */ def onPointerDown(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  }
  
  @js.native
  class Remove ()
    extends jointjsLib.jointjsMod.diaNs.ToolView
  
  @js.native
  class Segments ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    def this(opt: jointjsLib.jointjsMod.linkToolsNs.SegmentsNs.Options) = this()
  }
  
  @js.native
  class SourceAnchor () extends Anchor
  
  @js.native
  class SourceArrowhead () extends Arrowhead
  
  @js.native
  class TargetAnchor () extends Anchor
  
  @js.native
  class TargetArrowhead () extends Arrowhead
  
  @js.native
  class Vertices ()
    extends jointjsLib.jointjsMod.diaNs.ToolView {
    def this(opt: jointjsLib.jointjsMod.linkToolsNs.VerticesNs.Options) = this()
  }
  
  @JSName("Anchor")
  @js.native
  object AnchorNs extends js.Object {
    trait Options
      extends jointjsLib.jointjsMod.diaNs.ToolViewNs.Options {
      var anchor: js.UndefOr[
            jointjsLib.jointjsMod.linkToolsNs.AnchorCallback[jointjsLib.jointjsMod.anchorsNs.AnchorJSON]
          ] = js.undefined
      var areaPadding: js.UndefOr[scala.Double] = js.undefined
      var customAnchorAttributes: js.UndefOr[jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes] = js.undefined
      var defaultAnchorAttributes: js.UndefOr[jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes] = js.undefined
      var redundancyRemoval: js.UndefOr[scala.Boolean] = js.undefined
      var restrictArea: js.UndefOr[scala.Boolean] = js.undefined
      var snap: js.UndefOr[
            jointjsLib.jointjsMod.linkToolsNs.AnchorCallback[jointjsLib.jointjsMod.diaNs.Point]
          ] = js.undefined
      var snapRadius: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
  @JSName("Boundary")
  @js.native
  object BoundaryNs extends js.Object {
    trait Options
      extends jointjsLib.jointjsMod.diaNs.ToolViewNs.Options {
      var padding: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
  @JSName("Button")
  @js.native
  object ButtonNs extends js.Object {
    trait Options
      extends jointjsLib.jointjsMod.diaNs.ToolViewNs.Options {
      var action: js.UndefOr[ActionCallback] = js.undefined
      var distance: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var markup: js.UndefOr[jointjsLib.jointjsMod.diaNs.MarkupJSON] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var rotate: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    type ActionCallback = js.Function2[
        /* evt */ jqueryLib.JQueryNs.Event, 
        /* view */ jointjsLib.jointjsMod.diaNs.LinkView, 
        scala.Unit
      ]
  }
  
  @JSName("Segments")
  @js.native
  object SegmentsNs extends js.Object {
    trait Options
      extends jointjsLib.jointjsMod.diaNs.ToolViewNs.Options {
      var anchor: js.UndefOr[
            jointjsLib.jointjsMod.linkToolsNs.AnchorCallback[jointjsLib.jointjsMod.anchorsNs.AnchorJSON]
          ] = js.undefined
      var redundancyRemoval: js.UndefOr[scala.Boolean] = js.undefined
      var segmentLengthThreshold: js.UndefOr[scala.Double] = js.undefined
      var snapHandle: js.UndefOr[scala.Boolean] = js.undefined
      var snapRadius: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
  @JSName("Vertices")
  @js.native
  object VerticesNs extends js.Object {
    trait Options
      extends jointjsLib.jointjsMod.diaNs.ToolViewNs.Options {
      var redundancyRemoval: js.UndefOr[scala.Boolean] = js.undefined
      var snapRadius: js.UndefOr[scala.Double] = js.undefined
      var vertexAdding: js.UndefOr[scala.Boolean] = js.undefined
    }
    
  }
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ jointjsLib.jointjsMod.gNs.Point, 
    /* view */ jointjsLib.jointjsMod.diaNs.CellView, 
    /* magnet */ stdLib.SVGElement, 
    /* type */ java.lang.String, 
    /* linkView */ jointjsLib.jointjsMod.diaNs.LinkView, 
    /* toolView */ jointjsLib.jointjsMod.diaNs.ToolView, 
    T
  ]
}

