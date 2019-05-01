package typings
package inkDashSpinnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerMod {
  type BooleansPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.BooleansPartial with js.Any
  type ChalkCommons = inkDashSpinnerLib.Omit[chalkLib.chalkMod.Chalk, java.lang.String]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[inkDashSpinnerLib.ChalkKeywordsAndHexes] with TupleOfNumbersPartial[inkDashSpinnerLib.ChalkColorModels]
  type Spinner = inkLib.inkMod.Component[SpinnerProps with ChalkProps, js.Object, js.Object]
  type StringifyPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.TupleOfNumbersPartial with js.Any
}
