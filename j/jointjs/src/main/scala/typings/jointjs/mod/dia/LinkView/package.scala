package typings.jointjs.mod.dia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LinkView {
  type GetConnectionPoint = js.Function5[
    /* linkView */ typings.jointjs.mod.dia.LinkView, 
    /* view */ typings.jointjs.mod.dia.ElementView, 
    /* magnet */ typings.std.SVGElement, 
    /* reference */ typings.jointjs.mod.dia.Point, 
    /* end */ typings.jointjs.mod.dia.LinkEnd, 
    typings.jointjs.mod.dia.Point
  ]
  type VertexOptions = typings.jointjs.mod.dia.Cell.Options
}
