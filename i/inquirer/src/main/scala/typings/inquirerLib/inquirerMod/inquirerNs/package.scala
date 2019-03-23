package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerNs {
  type ChoiceType = _ChoiceType | java.lang.String
  type Questions[T] = Question[T] | js.Array[Question[T]] | rxjsLib.rxjsMod.Observable[Question[T]]
}
