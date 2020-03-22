package typings.inkSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typings.inkSpinner.inkSpinnerStrings.BooleansPartial with js.Any
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Spinner = typings.react.mod.Component[
    typings.inkSpinner.mod.SpinnerProps with typings.inkSpinner.mod.ChalkProps, 
    js.Object, 
    js.Any
  ]
  type StringifyPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.inkSpinner.inkSpinnerStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typings.inkSpinner.inkSpinnerStrings.TupleOfNumbersPartial with js.Any
}
