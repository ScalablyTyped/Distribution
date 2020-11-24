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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.drawing")
@js.native
object drawing extends js.Object {
  
  def align(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  def drawDOM(element: JQuery, options: js.Any): JQueryPromise[_] = js.native
  
  def exportImage(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportImage(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  def exportPDF(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportPDF(group: typings.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[_] = js.native
  
  def exportSVG(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportSVG(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  def fit(element: typings.kendoUi.kendo.drawing.Element, rect: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  def stack(elements: js.Any): Unit = js.native
  
  def vAlign(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  def vStack(elements: js.Any): Unit = js.native
  
  def vWrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = js.native
  
  def wrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = js.native
  
  @js.native
  class Arc protected ()
    extends typings.kendoUi.kendo.drawing.Arc {
    def this(geometry: typings.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typings.kendoUi.kendo.drawing.Circle {
    def this(geometry: typings.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @js.native
  class Element ()
    extends typings.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @js.native
  class Gradient ()
    extends typings.kendoUi.kendo.drawing.Gradient {
    def this(options: GradientOptions) = this()
  }
  
  @js.native
  class GradientStop ()
    extends typings.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
  }
  
  @js.native
  class Group ()
    extends typings.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @js.native
  class Image protected ()
    extends typings.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typings.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @js.native
  class Layout protected ()
    extends typings.kendoUi.kendo.drawing.Layout {
    def this(rect: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typings.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @js.native
  class LinearGradient ()
    extends typings.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
  }
  
  @js.native
  class MultiPath ()
    extends typings.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @js.native
  class OptionsStore ()
    extends typings.kendoUi.kendo.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
  }
  
  @js.native
  class Path ()
    extends typings.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  /* static members */
  @js.native
  object Path extends js.Object {
    
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc): typings.kendoUi.kendo.drawing.Path = js.native
    def fromArc(arc: typings.kendoUi.kendo.geometry.Arc, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    def fromPoints(points: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    def fromPoints(points: js.Any, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.drawing.Path = js.native
    def fromRect(rect: typings.kendoUi.kendo.geometry.Rect, options: js.Any): typings.kendoUi.kendo.drawing.Path = js.native
    
    def parse(svgPath: String): typings.kendoUi.kendo.drawing.MultiPath = js.native
    def parse(svgPath: String, options: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  }
  
  @js.native
  class RadialGradient ()
    extends typings.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typings.kendoUi.kendo.drawing.Rect {
    def this(geometry: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @js.native
  class Segment protected ()
    extends typings.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @js.native
  class Surface ()
    extends typings.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  /* static members */
  @js.native
  object Surface extends js.Object {
    
    def create(element: JQuery): typings.kendoUi.kendo.drawing.Surface = js.native
    def create(element: JQuery, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
    def create(element: typings.kendoUi.kendo.drawing.Element): typings.kendoUi.kendo.drawing.Surface = js.native
    def create(element: typings.kendoUi.kendo.drawing.Element, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
  }
  
  @js.native
  class Text protected ()
    extends typings.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  @js.native
  object pdf extends js.Object {
    
    def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String): Unit = js.native
    def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = js.native
    def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = js.native
  }
}
