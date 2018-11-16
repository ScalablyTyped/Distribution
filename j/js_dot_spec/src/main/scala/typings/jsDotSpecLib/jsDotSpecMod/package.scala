package typings
package jsDotSpecLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDotSpecMod {
  type PredFn = js.Function1[/* value */ js.Any, scala.Boolean]
  type SpecInput = PredFn | Spec
}
