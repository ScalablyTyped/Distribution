package typings
package inquirerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerMod {
  /**
    * A key/value hash containing the client answers in each prompt.
    */
  type Answers = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - inquirerLib.inquirerMod.objectsNs.ChoiceOption
    - inquirerLib.inquirerMod.objectsNs.Separator
  */
  type ChoiceType = _ChoiceType | java.lang.String
  type Prompts = org.scalablytyped.runtime.StringDictionary[inquirerLib.inquirerMod.promptsNs.Base]
  type Questions[T] = Question[T] | js.Array[Question[T]] | rxjsLib.rxjsMod.Observable[Question[T]]
}
