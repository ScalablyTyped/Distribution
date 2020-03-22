package typings.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: typings.lolex.mod.Clock */] = TClock with typings.lolex.mod.InstalledMethods
  type TimerId = scala.Double | typings.lolex.mod.NodeTimer
}
