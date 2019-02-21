package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerLib {
  type BooleansPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.BooleansPartial with js.Any
  type ChalkColorModels = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    inkDashSpinnerLib.inkDashSpinnerLibStrings.rgb | inkDashSpinnerLib.inkDashSpinnerLibStrings.hsl | inkDashSpinnerLib.inkDashSpinnerLibStrings.hsv | inkDashSpinnerLib.inkDashSpinnerLibStrings.hwb | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgRgb | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHsl | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHsv | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHwb
  ]
  type ChalkCommons = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    java.lang.String
  ]
  type ChalkKeywordsAndHexes = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    inkDashSpinnerLib.inkDashSpinnerLibStrings.keyword | inkDashSpinnerLib.inkDashSpinnerLibStrings.hex | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgKeyword | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHex
  ]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[ChalkKeywordsAndHexes] with TupleOfNumbersPartial[ChalkColorModels]
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type StringifyPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ inkDashSpinnerLib.inkDashSpinnerLibStrings.TupleOfNumbersPartial with js.Any
}
