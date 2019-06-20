package typings
package immutableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutableMod {
  type RecordOf[TProps /* <: js.Object */] = Record[TProps] with TProps
}
