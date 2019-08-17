package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObjectsChoicesMod {
  import typings.inquirer.Anon_Separator
  import typings.inquirer.inquirerMod.KeyUnion
  import typings.inquirer.inquirerMod.UnionToIntersection
  import typings.std.Exclude

  /**
    * Represents a property-name of any choice-type.
    *
    * @template T
    * The type of the answers.
    */
  type ChoiceProperty[T] = KeyUnion[UnionToIntersection[RealChoice[T]]]
  /**
    * Represents a valid choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type DistinctChoice[T] = /* import warning: ImportType.apply Failed type conversion: inquirer.inquirer.BaseChoiceMap<T>[keyof inquirer.inquirer.BaseChoiceMap<T>] */ js.Any
  /**
    * Represents a valid real choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type RealChoice[T] = Exclude[DistinctChoice[T], Anon_Separator]
}
