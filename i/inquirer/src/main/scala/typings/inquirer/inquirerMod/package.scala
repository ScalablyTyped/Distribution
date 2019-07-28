package typings.inquirer

import org.scalablytyped.runtime.StringDictionary
import typings.inquirer.inquirerMod.promptsNs.Base
import typings.rxjs.rxjsMod.Observable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerMod {
  type Answers = Record[String, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.inquirer.inquirerMod.objectsNs.ChoiceOption[A]
    - typings.inquirer.inquirerMod.objectsNs.Separator
  */
  type ChoiceType[A] = _ChoiceType[A] | String
  type Prompts = StringDictionary[Base]
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | Observable[Question[A]]
}
