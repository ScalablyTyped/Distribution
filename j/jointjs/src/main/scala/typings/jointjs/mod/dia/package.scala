package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dia {
  type BBox = typings.jointjs.mod.g.PlainRect
  type Cell = typings.jointjs.mod.dia.Cell_
  type CellView = typings.jointjs.mod.dia.CellView_
  type Element = typings.jointjs.mod.dia.Element_
  type ElementView = typings.jointjs.mod.dia.ElementView_
  type Event = typings.jquery.JQuery.TriggeredEvent[js.Any, js.Any, js.Any, js.Any]
  type Graph = typings.jointjs.mod.dia.Graph_
  type Link = typings.jointjs.mod.dia.Link_
  type LinkView = typings.jointjs.mod.dia.LinkView_
  type MarkupJSON = js.Array[typings.jointjs.mod.dia.MarkupNodeJSON]
  type Padding = scala.Double | typings.jointjs.mod.dia.PaddingJSON
  type Paper = typings.jointjs.mod.dia.Paper_
  type Path = java.lang.String | (js.Array[java.lang.String | scala.Double])
  type Point = typings.jointjs.mod.g.PlainPoint
  type Sides = scala.Double | typings.jointjs.mod.dia.SidesJSON
  type ToolView = typings.jointjs.mod.dia.ToolView_
  type ToolsView = typings.jointjs.mod.dia.ToolsView_
}
