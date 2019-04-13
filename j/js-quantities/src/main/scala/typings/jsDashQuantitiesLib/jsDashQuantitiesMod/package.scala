package typings
package jsDashQuantitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashQuantitiesMod {
  type Formatter = js.Function2[/* scalar */ scala.Double, /* unit */ java.lang.String, java.lang.String]
  type Source = UnitSource | scala.Double
  type UnitSource = Qty | java.lang.String
}
