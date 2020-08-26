package typings.graphqlToolsMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeTypedefsMod {
  type CompareFn[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
