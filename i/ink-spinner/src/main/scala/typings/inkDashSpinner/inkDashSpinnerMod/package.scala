package typings.inkDashSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerMod {
  import typings.chalk.chalkMod.Chalk
  import typings.inkDashSpinner.ChalkColorModels
  import typings.inkDashSpinner.ChalkKeywordsAndHexes
  import typings.inkDashSpinner.Omit
  import typings.inkDashSpinner.inkDashSpinnerStrings.constructor
  import typings.inkDashSpinner.inkDashSpinnerStrings.enabled
  import typings.inkDashSpinner.inkDashSpinnerStrings.level

  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.BooleansPartial with js.Any
  type ChalkCommons = Omit[Chalk, String | constructor | level | enabled]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[ChalkKeywordsAndHexes] with TupleOfNumbersPartial[ChalkColorModels]
  type Spinner = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component<SpinnerProps & ChalkProps> */ js.Any
  type StringifyPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.TupleOfNumbersPartial with js.Any
}
