package typings.jsDashQuantities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashQuantitiesMod {
  type Formatter = js.Function2[/* scalar */ Double, /* unit */ String, String]
  type Source = UnitSource | Double
  type UnitSource = Qty | String
}
