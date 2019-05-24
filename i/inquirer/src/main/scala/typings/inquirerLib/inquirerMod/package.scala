package typings
package inquirerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerMod {
  type Answers = stdLib.Record[java.lang.String, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - inquirerLib.inquirerMod.objectsNs.ChoiceOption[A]
    - inquirerLib.inquirerMod.objectsNs.Separator
  */
  type ChoiceType[A] = _ChoiceType[A] | java.lang.String
  type Prompts = org.scalablytyped.runtime.StringDictionary[inquirerLib.inquirerMod.promptsNs.Base]
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | rxjsLib.rxjsMod.Observable[Question[A]]
}
