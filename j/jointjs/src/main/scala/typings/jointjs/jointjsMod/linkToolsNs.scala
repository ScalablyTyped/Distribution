package typings.jointjs.jointjsMod

import typings.jointjs.jointjsMod.anchorsNs.AnchorJSON
import typings.jointjs.jointjsMod.attributesNs.NativeSVGAttributes
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.diaNs.LinkView
import typings.jointjs.jointjsMod.diaNs.MarkupJSON
import typings.jointjs.jointjsMod.diaNs.Point
import typings.jointjs.jointjsMod.diaNs.ToolView
import typings.jointjs.jointjsMod.linkToolsNs.Anchor
import typings.jointjs.jointjsMod.linkToolsNs.AnchorCallback
import typings.jointjs.jointjsMod.linkToolsNs.AnchorNs.Options
import typings.jointjs.jointjsMod.linkToolsNs.Arrowhead
import typings.jointjs.jointjsMod.linkToolsNs.Button
import typings.jointjs.jointjsMod.linkToolsNs.ButtonNs.ActionCallback
import typings.jquery.JQueryNs.Event
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "linkTools")
@js.native
object linkToolsNs extends js.Object {
  @js.native
  abstract class Anchor () extends ToolView {
    def this(opt: Options) = this()
    var `type`: String = js.native
  }
  
  @js.native
  abstract class Arrowhead () extends ToolView {
    var arrowheadType: String = js.native
    var ratio: Double = js.native
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
    /* protected */ def onPointerMove(evt: Event): Unit = js.native
    /* protected */ def onPointerUp(evt: Event): Unit = js.native
  }
  
  @js.native
  class Boundary () extends ToolView {
    def this(opt: typings.jointjs.jointjsMod.linkToolsNs.BoundaryNs.Options) = this()
  }
  
  @js.native
  class Button () extends ToolView {
    def this(opt: typings.jointjs.jointjsMod.linkToolsNs.ButtonNs.Options) = this()
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
  }
  
  @js.native
  class Remove () extends Button
  
  @js.native
  class Segments () extends ToolView {
    def this(opt: typings.jointjs.jointjsMod.linkToolsNs.SegmentsNs.Options) = this()
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
  class Vertices () extends ToolView {
    def this(opt: typings.jointjs.jointjsMod.linkToolsNs.VerticesNs.Options) = this()
  }
  
  @JSName("Anchor")
  @js.native
  object AnchorNs extends js.Object {
    trait Options
      extends typings.jointjs.jointjsMod.diaNs.ToolViewNs.Options {
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.undefined
      var areaPadding: js.UndefOr[Double] = js.undefined
      var customAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.undefined
      var defaultAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.undefined
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      var restrictArea: js.UndefOr[Boolean] = js.undefined
      var snap: js.UndefOr[AnchorCallback[Point]] = js.undefined
      var snapRadius: js.UndefOr[Double] = js.undefined
    }
    
  }
  
  @JSName("Boundary")
  @js.native
  object BoundaryNs extends js.Object {
    trait Options
      extends typings.jointjs.jointjsMod.diaNs.ToolViewNs.Options {
      var padding: js.UndefOr[Double] = js.undefined
    }
    
  }
  
  @JSName("Button")
  @js.native
  object ButtonNs extends js.Object {
    trait Options
      extends typings.jointjs.jointjsMod.diaNs.ToolViewNs.Options {
      var action: js.UndefOr[ActionCallback] = js.undefined
      var distance: js.UndefOr[Double | String] = js.undefined
      var markup: js.UndefOr[MarkupJSON] = js.undefined
      var offset: js.UndefOr[Double] = js.undefined
      var rotate: js.UndefOr[Boolean] = js.undefined
    }
    
    type ActionCallback = js.Function2[/* evt */ Event, /* view */ LinkView, Unit]
  }
  
  @JSName("Segments")
  @js.native
  object SegmentsNs extends js.Object {
    trait Options
      extends typings.jointjs.jointjsMod.diaNs.ToolViewNs.Options {
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.undefined
      var handleClass: js.UndefOr[js.Any] = js.undefined
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      var segmentLengthThreshold: js.UndefOr[Double] = js.undefined
      var snapHandle: js.UndefOr[Boolean] = js.undefined
      var snapRadius: js.UndefOr[Double] = js.undefined
    }
    
  }
  
  @JSName("Vertices")
  @js.native
  object VerticesNs extends js.Object {
    trait Options
      extends typings.jointjs.jointjsMod.diaNs.ToolViewNs.Options {
      var handleClass: js.UndefOr[js.Any] = js.undefined
      var redundancyRemoval: js.UndefOr[Boolean] = js.undefined
      var snapRadius: js.UndefOr[Double] = js.undefined
      var stopPropagation: js.UndefOr[Boolean] = js.undefined
      var vertexAdding: js.UndefOr[Boolean] = js.undefined
    }
    
  }
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ typings.jointjs.jointjsMod.gNs.Point, 
    /* view */ CellView, 
    /* magnet */ SVGElement, 
    /* type */ String, 
    /* linkView */ LinkView, 
    /* toolView */ ToolView, 
    T
  ]
}

