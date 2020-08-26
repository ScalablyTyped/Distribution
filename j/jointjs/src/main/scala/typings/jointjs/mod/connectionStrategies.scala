package typings.jointjs.mod

import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Point
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectionStrategies")
@js.native
object connectionStrategies extends js.Object {
  var pinAbsolute: ConnectionStrategy = js.native
  var pinRelative: ConnectionStrategy = js.native
  var useDefaults: ConnectionStrategy = js.native
  type ConnectionStrategy = js.Function4[
    /* endDefinition */ Cell, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* coords */ Point, 
    Element
  ]
}

