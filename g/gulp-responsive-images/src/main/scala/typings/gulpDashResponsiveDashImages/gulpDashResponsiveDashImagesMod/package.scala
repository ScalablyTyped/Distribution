package typings.gulpDashResponsiveDashImages

import org.scalablytyped.runtime.StringDictionary
import typings.gulpDashRename.gulpDashRenameMod.Options
import typings.gulpDashRename.gulpDashRenameMod.ParsedPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashResponsiveDashImagesMod {
  type Matchers = StringDictionary[js.Array[Settings]]
  type Rename = String | (js.Function1[/* path */ ParsedPath, js.Any]) | Options
  type SamplingFactor = js.Tuple2[Double, Double]
}
