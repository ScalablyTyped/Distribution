package typings.inkDashSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerMod {
  import typings.chalk.chalkMod.Chalk
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHex
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHsl
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHsv
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHwb
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgKeyword
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgRgb
  import typings.inkDashSpinner.inkDashSpinnerStrings.constructor
  import typings.inkDashSpinner.inkDashSpinnerStrings.enabled
  import typings.inkDashSpinner.inkDashSpinnerStrings.hex
  import typings.inkDashSpinner.inkDashSpinnerStrings.hsl
  import typings.inkDashSpinner.inkDashSpinnerStrings.hsv
  import typings.inkDashSpinner.inkDashSpinnerStrings.hwb
  import typings.inkDashSpinner.inkDashSpinnerStrings.keyword
  import typings.inkDashSpinner.inkDashSpinnerStrings.level
  import typings.inkDashSpinner.inkDashSpinnerStrings.rgb
  import typings.react.reactMod.Component
  import typings.std.Exclude
  import typings.std.Pick

  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.BooleansPartial with js.Any
  type ChalkColorModels = Pick[Chalk, rgb | hsl | hsv | hwb | bgRgb | bgHsl | bgHsv | bgHwb]
  type ChalkCommons = Omit[Chalk, String | constructor | level | enabled]
  type ChalkKeywordsAndHexes = Pick[Chalk, keyword | hex | bgKeyword | bgHex]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[ChalkKeywordsAndHexes] with TupleOfNumbersPartial[ChalkColorModels]
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Spinner = Component[SpinnerProps with ChalkProps, js.Object, js.Any]
  type StringifyPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typings.inkDashSpinner.inkDashSpinnerStrings.TupleOfNumbersPartial with js.Any
}
