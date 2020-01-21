package typings.inkSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typings.inkSpinner.inkSpinnerStrings.BooleansPartial with js.Any
  type ChalkColorModels = typings.std.Pick[
    typings.chalk.mod.Chalk, 
    typings.inkSpinner.inkSpinnerStrings.rgb | typings.inkSpinner.inkSpinnerStrings.hsl | typings.inkSpinner.inkSpinnerStrings.hsv | typings.inkSpinner.inkSpinnerStrings.hwb | typings.inkSpinner.inkSpinnerStrings.bgRgb | typings.inkSpinner.inkSpinnerStrings.bgHsl | typings.inkSpinner.inkSpinnerStrings.bgHsv | typings.inkSpinner.inkSpinnerStrings.bgHwb
  ]
  type ChalkCommons = typings.inkSpinner.mod.Omit[
    typings.chalk.mod.Chalk, 
    java.lang.String | typings.inkSpinner.inkSpinnerStrings.constructor | typings.inkSpinner.inkSpinnerStrings.level | typings.inkSpinner.inkSpinnerStrings.enabled
  ]
  type ChalkKeywordsAndHexes = typings.std.Pick[
    typings.chalk.mod.Chalk, 
    typings.inkSpinner.inkSpinnerStrings.keyword | typings.inkSpinner.inkSpinnerStrings.hex | typings.inkSpinner.inkSpinnerStrings.bgKeyword | typings.inkSpinner.inkSpinnerStrings.bgHex
  ]
  type ChalkProps = typings.inkSpinner.mod.BooleansPartial[typings.inkSpinner.mod.ChalkCommons] with typings.inkSpinner.mod.StringifyPartial[typings.inkSpinner.mod.ChalkKeywordsAndHexes] with typings.inkSpinner.mod.TupleOfNumbersPartial[typings.inkSpinner.mod.ChalkColorModels]
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
