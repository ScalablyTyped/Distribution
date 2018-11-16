package typings
package jointjsLib.jointjsMod

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
    /* endDefinition */ jointjsLib.jointjsMod.diaNs.Cell, 
    /* endView */ jointjsLib.jointjsMod.diaNs.CellView, 
    /* endMagnet */ stdLib.SVGElement, 
    /* coords */ jointjsLib.jointjsMod.diaNs.Point, 
    jointjsLib.jointjsMod.diaNs.Element
  ]
}

