package typings.immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Immutable {
  type RecordOf[TProps /* <: js.Object */] = Record[TProps] with TProps
}
