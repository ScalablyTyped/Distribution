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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.drawing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.drawing.Arc")
  @js.native
  class Arc protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Arc {
    def this(geometry: typings.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Circle")
  @js.native
  class Circle protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Circle {
    def this(geometry: typings.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Element")
  @js.native
  class Element ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Gradient")
  @js.native
  class Gradient ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Gradient {
    def this(options: GradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typings.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typings.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: js.Any = js.native
  }
  
  @JSGlobal("kendo.drawing.GradientStop")
  @js.native
  class GradientStop ()
    extends StObject
       with typings.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
    
    /* CompleteClass */
    var options: GradientStopOptions = js.native
  }
  
  @JSGlobal("kendo.drawing.Group")
  @js.native
  class Group ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Image")
  @js.native
  class Image protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typings.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.drawing.Layout")
  @js.native
  class Layout protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Layout {
    def this(rect: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typings.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.LinearGradient")
  @js.native
  class LinearGradient ()
    extends StObject
       with typings.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typings.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typings.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: js.Any = js.native
  }
  
  @JSGlobal("kendo.drawing.MultiPath")
  @js.native
  class MultiPath ()
    extends StObject
       with typings.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.OptionsStore")
  @js.native
  class OptionsStore ()
    extends StObject
       with typings.kendoUi.kendo.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
    
    /* CompleteClass */
    override def get(field: String): js.Any = js.native
    
    /* CompleteClass */
    var observer: js.Any = js.native
    
    /* CompleteClass */
    var options: OptionsStoreOptions = js.native
    
    /* CompleteClass */
    override def set(field: String, value: js.Any): Unit = js.native
  }
  
  @JSGlobal("kendo.drawing.Path")
  @js.native
  class Path ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    @JSGlobal("kendo.drawing.Path")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromArc(arc: typings.kendoUi.kendo.geometry.Arc): typings.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArc")(arc.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    inline def fromArc(arc: typings.kendoUi.kendo.geometry.Arc, options: js.Any): typings.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArc")(arc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def fromPoints(points: js.Any): typings.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    inline def fromPoints(points: js.Any, options: js.Any): typings.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def fromRect(rect: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    inline def fromRect(rect: typings.kendoUi.kendo.geometry.Rect, options: js.Any): typings.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def parse(svgPath: String): typings.kendoUi.kendo.drawing.MultiPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgPath.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.MultiPath]
    inline def parse(svgPath: String, options: js.Any): typings.kendoUi.kendo.drawing.MultiPath = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.MultiPath]
  }
  
  @JSGlobal("kendo.drawing.RadialGradient")
  @js.native
  class RadialGradient ()
    extends StObject
       with typings.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typings.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typings.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: js.Any = js.native
  }
  
  @JSGlobal("kendo.drawing.Rect")
  @js.native
  class Rect protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Rect {
    def this(geometry: typings.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typings.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Segment")
  @js.native
  class Segment protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.drawing.Surface")
  @js.native
  class Surface ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    @JSGlobal("kendo.drawing.Surface")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(element: JQuery): typings.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.Surface]
    inline def create(element: JQuery, options: js.Any): typings.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.Surface]
    /* static member */
    inline def create(element: typings.kendoUi.kendo.drawing.Element): typings.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.drawing.Surface]
    inline def create(element: typings.kendoUi.kendo.drawing.Element, options: js.Any): typings.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.drawing.Surface]
  }
  
  @JSGlobal("kendo.drawing.Text")
  @js.native
  class Text protected ()
    extends StObject
       with typings.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  inline def align(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawDOM(element: JQuery, options: js.Any): JQueryPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawDOM")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[js.Any]]
  
  inline def exportImage(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportImage")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[js.Any]]
  inline def exportImage(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportImage")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[js.Any]]
  
  inline def exportPDF(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPDF")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[js.Any]]
  inline def exportPDF(group: typings.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPDF")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[js.Any]]
  
  inline def exportSVG(group: typings.kendoUi.kendo.drawing.Group): JQueryPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSVG")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[js.Any]]
  inline def exportSVG(group: typings.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSVG")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[js.Any]]
  
  inline def fit(element: typings.kendoUi.kendo.drawing.Element, rect: typings.kendoUi.kendo.geometry.Rect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fit")(element.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object pdf {
    
    @JSGlobal("kendo.drawing.pdf")
    @js.native
    val ^ : js.Any = js.native
    
    inline def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(group: typings.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(
      group: typings.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: Unit,
      callback: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def stack(elements: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def vAlign(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect, alignment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vAlign")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vStack(elements: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vStack")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def vWrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vWrap")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def wrap(elements: js.Any, rect: typings.kendoUi.kendo.geometry.Rect): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
