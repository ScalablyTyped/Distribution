package typings.kendoUi.global.kendo.dataviz

import typings.kendoUi.kendo.dataviz.diagram.CircleOptions
import typings.kendoUi.kendo.dataviz.diagram.ConnectionOptions
import typings.kendoUi.kendo.dataviz.diagram.ConnectorOptions
import typings.kendoUi.kendo.dataviz.diagram.GroupOptions
import typings.kendoUi.kendo.dataviz.diagram.ImageOptions
import typings.kendoUi.kendo.dataviz.diagram.LayoutOptions
import typings.kendoUi.kendo.dataviz.diagram.LineOptions
import typings.kendoUi.kendo.dataviz.diagram.PathOptions
import typings.kendoUi.kendo.dataviz.diagram.PolylineOptions
import typings.kendoUi.kendo.dataviz.diagram.RectOptions
import typings.kendoUi.kendo.dataviz.diagram.RectangleOptions
import typings.kendoUi.kendo.dataviz.diagram.ShapeOptions
import typings.kendoUi.kendo.dataviz.diagram.TextBlockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.dataviz.diagram")
@js.native
object diagram extends js.Object {
  
  @js.native
  class Circle ()
    extends typings.kendoUi.kendo.dataviz.diagram.Circle {
    def this(options: CircleOptions) = this()
  }
  
  @js.native
  class Connection ()
    extends typings.kendoUi.kendo.dataviz.diagram.Connection {
    def this(options: ConnectionOptions) = this()
  }
  
  @js.native
  class Connector ()
    extends typings.kendoUi.kendo.dataviz.diagram.Connector {
    def this(options: ConnectorOptions) = this()
  }
  
  @js.native
  class Group ()
    extends typings.kendoUi.kendo.dataviz.diagram.Group {
    def this(options: GroupOptions) = this()
  }
  
  @js.native
  class Image ()
    extends typings.kendoUi.kendo.dataviz.diagram.Image {
    def this(options: ImageOptions) = this()
  }
  
  @js.native
  class Layout protected ()
    extends typings.kendoUi.kendo.dataviz.diagram.Layout {
    def this(rect: typings.kendoUi.kendo.dataviz.diagram.Rect) = this()
    def this(rect: typings.kendoUi.kendo.dataviz.diagram.Rect, options: LayoutOptions) = this()
  }
  
  @js.native
  class Line ()
    extends typings.kendoUi.kendo.dataviz.diagram.Line {
    def this(options: LineOptions) = this()
  }
  
  @js.native
  class Path ()
    extends typings.kendoUi.kendo.dataviz.diagram.Path {
    def this(options: PathOptions) = this()
  }
  
  @js.native
  class Point protected ()
    extends typings.kendoUi.kendo.dataviz.diagram.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Polyline ()
    extends typings.kendoUi.kendo.dataviz.diagram.Polyline {
    def this(options: PolylineOptions) = this()
  }
  
  @js.native
  class Rect ()
    extends typings.kendoUi.kendo.dataviz.diagram.Rect {
    def this(options: RectOptions) = this()
  }
  
  @js.native
  class Rectangle ()
    extends typings.kendoUi.kendo.dataviz.diagram.Rectangle {
    def this(options: RectangleOptions) = this()
  }
  
  @js.native
  class Shape ()
    extends typings.kendoUi.kendo.dataviz.diagram.Shape {
    def this(options: ShapeOptions) = this()
  }
  
  @js.native
  class TextBlock ()
    extends typings.kendoUi.kendo.dataviz.diagram.TextBlock {
    def this(options: TextBlockOptions) = this()
  }
}
