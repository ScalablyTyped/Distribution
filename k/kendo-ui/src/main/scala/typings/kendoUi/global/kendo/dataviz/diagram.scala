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
import typings.kendoUi.kendo.dataviz.diagram.RectangleOptions
import typings.kendoUi.kendo.dataviz.diagram.ShapeOptions
import typings.kendoUi.kendo.dataviz.diagram.TextBlockOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagram {
  
  @JSGlobal("kendo.dataviz.diagram.Circle")
  @js.native
  open class Circle ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Circle {
    def this(options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Connection")
  @js.native
  open class Connection ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Connection {
    def this(from: typings.kendoUi.kendo.dataviz.diagram.Shape) = this()
    def this(from: Unit, to: typings.kendoUi.kendo.dataviz.diagram.Shape) = this()
    def this(from: typings.kendoUi.kendo.dataviz.diagram.Shape, to: typings.kendoUi.kendo.dataviz.diagram.Shape) = this()
    def this(from: Unit, to: Unit, options: ConnectionOptions) = this()
    def this(from: Unit, to: typings.kendoUi.kendo.dataviz.diagram.Shape, options: ConnectionOptions) = this()
    def this(from: typings.kendoUi.kendo.dataviz.diagram.Shape, to: Unit, options: ConnectionOptions) = this()
    def this(
      from: typings.kendoUi.kendo.dataviz.diagram.Shape,
      to: typings.kendoUi.kendo.dataviz.diagram.Shape,
      options: ConnectionOptions
    ) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Connector")
  @js.native
  open class Connector ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Connector {
    def this(options: ConnectorOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Group")
  @js.native
  open class Group ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Image")
  @js.native
  open class Image ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Image {
    def this(options: ImageOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Layout")
  @js.native
  open class Layout protected ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Layout {
    def this(rect: typings.kendoUi.kendo.dataviz.diagram.Rect) = this()
    def this(rect: typings.kendoUi.kendo.dataviz.diagram.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Line")
  @js.native
  open class Line ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Line {
    def this(options: LineOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Path")
  @js.native
  open class Path ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Path {
    def this(options: PathOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Polyline")
  @js.native
  open class Polyline ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Polyline {
    def this(options: PolylineOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Rect")
  @js.native
  open class Rect ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Rect {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Rectangle")
  @js.native
  open class Rectangle ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Rectangle {
    def this(options: RectangleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.Shape {
    def this(options: ShapeOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.TextBlock")
  @js.native
  open class TextBlock ()
    extends StObject
       with typings.kendoUi.kendo.dataviz.diagram.TextBlock {
    def this(options: TextBlockOptions) = this()
  }
}
