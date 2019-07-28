package typings.inkDashSpinner

import typings.chalk.chalkMod.Chalk
import typings.ink.inkMod.Component
import typings.inkDashSpinner.ChalkColorModels
import typings.inkDashSpinner.ChalkKeywordsAndHexes
import typings.inkDashSpinner.Omit
import typings.inkDashSpinner.inkDashSpinnerStrings.constructor
import typings.inkDashSpinner.inkDashSpinnerStrings.enabled
import typings.inkDashSpinner.inkDashSpinnerStrings.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerMod {
  type BooleansPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.BooleansPartial with js.Any
  type ChalkCommons = Omit[Chalk, String | constructor | level | enabled]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[ChalkKeywordsAndHexes] with TupleOfNumbersPartial[ChalkColorModels]
  type Spinner = Component[SpinnerProps with ChalkProps, js.Object, js.Object]
  type StringifyPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.TupleOfNumbersPartial with js.Any
}
