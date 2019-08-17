package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinner {
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHex
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHsl
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHsv
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgHwb
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgKeyword
  import typings.inkDashSpinner.inkDashSpinnerStrings.bgRgb
  import typings.inkDashSpinner.inkDashSpinnerStrings.hex
  import typings.inkDashSpinner.inkDashSpinnerStrings.hsl
  import typings.inkDashSpinner.inkDashSpinnerStrings.hsv
  import typings.inkDashSpinner.inkDashSpinnerStrings.hwb
  import typings.inkDashSpinner.inkDashSpinnerStrings.keyword
  import typings.inkDashSpinner.inkDashSpinnerStrings.rgb
  import typings.std.Exclude
  import typings.std.Pick

  type ChalkColorModels = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    rgb | hsl | hsv | hwb | bgRgb | bgHsl | bgHsv | bgHwb
  ]
  type ChalkKeywordsAndHexes = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Chalk */ js.Any, 
    keyword | hex | bgKeyword | bgHex
  ]
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
