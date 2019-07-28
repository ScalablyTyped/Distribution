package typings.jsDotSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDotSpecMod {
  type PredFn = js.Function1[/* value */ js.Any, Boolean]
  type SpecInput = PredFn | Spec
}
