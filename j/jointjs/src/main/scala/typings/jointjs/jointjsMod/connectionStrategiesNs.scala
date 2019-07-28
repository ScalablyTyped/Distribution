package typings.jointjs.jointjsMod

import typings.jointjs.jointjsMod.connectionStrategiesNs.ConnectionStrategy
import typings.jointjs.jointjsMod.diaNs.Cell
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.diaNs.Element
import typings.jointjs.jointjsMod.diaNs.Point
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectionStrategies")
@js.native
object connectionStrategiesNs extends js.Object {
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

