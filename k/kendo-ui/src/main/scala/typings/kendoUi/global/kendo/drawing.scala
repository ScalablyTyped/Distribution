package typings.kendoUi.global.kendo

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.ArcOptions
import typings.kendoUi.kendo.drawing.CircleOptions
import typings.kendoUi.kendo.drawing.ElementOptions
import typings.kendoUi.kendo.drawing.GradientOptions
import typings.kendoUi.kendo.drawing.GradientStopOptions
import typings.kendoUi.kendo.drawing.GroupOptions
import typings.kendoUi.kendo.drawing.LayoutOptions
import typings.kendoUi.kendo.drawing.LinearGradientOptions
import typings.kendoUi.kendo.drawing.MultiPathOptions
import typings.kendoUi.kendo.drawing.OptionsStoreOptions
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.drawing.PathOptions
import typings.kendoUi.kendo.drawing.RadialGradientOptions
import typings.kendoUi.kendo.drawing.RectOptions
import typings.kendoUi.kendo.drawing.SurfaceOptions
import typings.kendoUi.kendo.drawing.TextOptions
import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.drawing.Arc")
  @js.native
  class Arc protected ()
    extends typings.kendoUi.kendo.drawing.Arc {
    def this(geometry: typings.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Circle")
  @js.native
  class Circle protected ()
    extends typings.kendoUi.kendo.drawing.Circle {
    def this(geometry: typings.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Element")
  @js.native
  class Element ()
    extends typings.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Gradient")
  @js.native
  class Gradient ()
    extends typings.kendoUi.kendo.drawing.Gradient {
    def this(options: GradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.GradientStop")
  @js.native
  class GradientStop ()
    extends typings.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Group")
  @js.native
  class Group ()
    extends typings.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Image")
  @js.native
  class Image protected ()
    extends typings.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typings.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.drawing.Layout")
  @js.native
  class Layout protected ()
    extends typings.kendoUi.kendo.drawing.Layout {
    def this(rect: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typings.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.LinearGradient")
  @js.native
  class LinearGradient ()
    extends typings.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.MultiPath")
  @js.native
  class MultiPath ()
    extends typings.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.OptionsStore")
  @js.native
  class OptionsStore ()
    extends typings.kendoUi.kendo.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Path")
  @js.native
  class Path ()
    extends typings.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.parse")
    @js.native
    def parse(svgPath: String): typings.kendoUi.kendo.drawing.MultiPath = js.native
    @JSGlobal("kendo.drawing.Path.parse")
    @js.native
    def parse(svgPath: String, options: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  }
  
  @JSGlobal("kendo.drawing.RadialGradient")
  @js.native
  class RadialGradient ()
    extends typings.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Rect")
  @js.native
  class Rect protected ()
    extends typings.kendoUi.kendo.drawing.Rect {
    def this(geometry: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Segment")
  @js.native
  class Segment protected ()
    extends typings.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.drawing.Surface")
  @js.native
  class Surface ()
    extends typings.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    /* static member */
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: JQuery): typings.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: JQuery, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
    /* static member */
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: typings.kendoUi.kendo.drawing.Element): typings.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: typings.kendoUi.kendo.drawing.Element, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
  }
  
  @JSGlobal("kendo.drawing.Text")
  @js.native
  class Text protected ()
    extends typings.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.align")
  @js.native
  def align(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  @JSGlobal("kendo.drawing.drawDOM")
  @js.native
  def drawDOM(element: JQuery, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportImage")
  @js.native
  def exportImage(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportImage")
  @js.native
  def exportImage(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportPDF")
  @js.native
  def exportPDF(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportPDF")
  @js.native
  def exportPDF(group: typings.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportSVG")
  @js.native
  def exportSVG(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportSVG")
  @js.native
  def exportSVG(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.fit")
  @js.native
  def fit(element: typings.kendoUi.kendo.drawing.Element, rect: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  object pdf {
    
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = js.native
  }
  
  @JSGlobal("kendo.drawing.stack")
  @js.native
  def stack(elements: js.Any): Unit = js.native
  
  @JSGlobal("kendo.drawing.vAlign")
  @js.native
  def vAlign(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  @JSGlobal("kendo.drawing.vStack")
  @js.native
  def vStack(elements: js.Any): Unit = js.native
  
  @JSGlobal("kendo.drawing.vWrap")
  @js.native
  def vWrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = js.native
  
  @JSGlobal("kendo.drawing.wrap")
  @js.native
  def wrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = js.native
}
