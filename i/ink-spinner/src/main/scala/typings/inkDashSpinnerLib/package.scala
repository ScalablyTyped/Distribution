package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerLib {
  type ChalkColorModels = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    inkDashSpinnerLib.inkDashSpinnerLibStrings.rgb | inkDashSpinnerLib.inkDashSpinnerLibStrings.hsl | inkDashSpinnerLib.inkDashSpinnerLibStrings.hsv | inkDashSpinnerLib.inkDashSpinnerLibStrings.hwb | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgRgb | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHsl | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHsv | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHwb
  ]
  type ChalkKeywordsAndHexes = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    inkDashSpinnerLib.inkDashSpinnerLibStrings.keyword | inkDashSpinnerLib.inkDashSpinnerLibStrings.hex | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgKeyword | inkDashSpinnerLib.inkDashSpinnerLibStrings.bgHex
  ]
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
