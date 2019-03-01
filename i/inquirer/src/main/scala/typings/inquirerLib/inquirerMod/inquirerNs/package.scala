package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerNs {
  type ChoiceType = _ChoiceType | java.lang.String
  type Questions[T] = Question[T] | js.Array[Question[T]] | rxDashLiteDashAggregatesLib.RxNs.Observable[Question[T]]
  type StreamOptions = _StreamOptions | (InputStreamOption with OutputStreamOption)
}
