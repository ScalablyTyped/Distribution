package typings.kendoUi.global.kendo.dataviz

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.dataviz.drawing.ArcOptions
import typings.kendoUi.kendo.dataviz.drawing.CircleOptions
import typings.kendoUi.kendo.dataviz.drawing.ElementOptions
import typings.kendoUi.kendo.dataviz.drawing.GradientOptions
import typings.kendoUi.kendo.dataviz.drawing.GradientStopOptions
import typings.kendoUi.kendo.dataviz.drawing.GroupOptions
import typings.kendoUi.kendo.dataviz.drawing.LayoutOptions
import typings.kendoUi.kendo.dataviz.drawing.LinearGradientOptions
import typings.kendoUi.kendo.dataviz.drawing.MultiPathOptions
import typings.kendoUi.kendo.dataviz.drawing.OptionsStoreOptions
import typings.kendoUi.kendo.dataviz.drawing.PathOptions
import typings.kendoUi.kendo.dataviz.drawing.RadialGradientOptions
import typings.kendoUi.kendo.dataviz.drawing.RectOptions
import typings.kendoUi.kendo.dataviz.drawing.SurfaceOptions
import typings.kendoUi.kendo.dataviz.drawing.TextOptions
import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.dataviz.drawing.Arc")
  @js.native
  class Arc protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Arc {
    def this(geometry: typings.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Circle")
  @js.native
  class Circle protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Circle {
    def this(geometry: typings.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Element")
  @js.native
  class Element ()
    extends typings.kendoUi.kendo.dataviz.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Gradient")
  @js.native
  class Gradient ()
    extends typings.kendoUi.kendo.dataviz.drawing.Gradient {
    def this(options: GradientOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.GradientStop")
  @js.native
  class GradientStop ()
    extends typings.kendoUi.kendo.dataviz.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Group")
  @js.native
  class Group ()
    extends typings.kendoUi.kendo.dataviz.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Image")
  @js.native
  class Image protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Image {
    def this(src: String, rect: typings.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Layout")
  @js.native
  class Layout protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Layout {
    def this(rect: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typings.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.LinearGradient")
  @js.native
  class LinearGradient ()
    extends typings.kendoUi.kendo.dataviz.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.MultiPath")
  @js.native
  class MultiPath ()
    extends typings.kendoUi.kendo.dataviz.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.OptionsStore")
  @js.native
  class OptionsStore ()
    extends typings.kendoUi.kendo.dataviz.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Path")
  @js.native
  class Path ()
    extends typings.kendoUi.kendo.dataviz.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.dataviz.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.dataviz.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.dataviz.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Path.parse")
    @js.native
    def parse(svgPath: String): typings.kendoUi.kendo.drawing.MultiPath = js.native
    @JSGlobal("kendo.dataviz.drawing.Path.parse")
    @js.native
    def parse(svgPath: String, options: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.RadialGradient")
  @js.native
  class RadialGradient ()
    extends typings.kendoUi.kendo.dataviz.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Rect")
  @js.native
  class Rect protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Rect {
    def this(geometry: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Segment")
  @js.native
  class Segment protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Surface")
  @js.native
  class Surface ()
    extends typings.kendoUi.kendo.dataviz.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Surface.create")
    @js.native
    def create(element: JQuery): typings.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.dataviz.drawing.Surface.create")
    @js.native
    def create(element: JQuery, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.drawing.Surface.create")
    @js.native
    def create(element: typings.kendoUi.kendo.dataviz.drawing.Element): typings.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.dataviz.drawing.Surface.create")
    @js.native
    def create(element: typings.kendoUi.kendo.dataviz.drawing.Element, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.Text")
  @js.native
  class Text protected ()
    extends typings.kendoUi.kendo.dataviz.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
}
