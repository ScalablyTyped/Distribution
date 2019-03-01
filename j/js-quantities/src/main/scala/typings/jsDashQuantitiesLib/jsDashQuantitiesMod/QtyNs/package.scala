package typings
package jsDashQuantitiesLib.jsDashQuantitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QtyNs {
  type Formatter = js.Function2[/* scalar */ scala.Double, /* unit */ java.lang.String, java.lang.String]
  type Source = UnitSource | scala.Double
  type UnitSource = jsDashQuantitiesLib.jsDashQuantitiesMod.Qty | java.lang.String
}
