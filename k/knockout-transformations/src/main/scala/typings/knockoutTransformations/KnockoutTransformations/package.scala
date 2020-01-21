package typings.knockoutTransformations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KnockoutTransformations {
  type Mapping[T, TResult] = js.Function1[/* value */ T, TResult]
}
