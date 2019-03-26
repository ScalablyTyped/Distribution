package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerNs {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - inquirerLib.inquirerMod.inquirerNs.objectsNs.ChoiceOption
    - inquirerLib.inquirerMod.inquirerNs.objectsNs.Separator
  */
  type ChoiceType = _ChoiceType | java.lang.String
  type Questions[T] = Question[T] | js.Array[Question[T]] | rxjsLib.rxjsMod.Observable[Question[T]]
}
