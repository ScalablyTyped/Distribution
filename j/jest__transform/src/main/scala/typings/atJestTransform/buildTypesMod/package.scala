package typings.atJestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestTransform.Anon_ChangedFiles
  import typings.atJestTransform.Anon_IsCoreModule
  import typings.atJestTransform.atJestTransformStrings.collectCoverage
  import typings.atJestTransform.atJestTransformStrings.collectCoverageFrom
  import typings.atJestTransform.atJestTransformStrings.collectCoverageOnlyFrom
  import typings.atJestTransform.atJestTransformStrings.extraGlobals
  import typings.atJestTypes.buildConfigMod.GlobalConfig
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Options = ShouldInstrumentOptions with (Pick[GlobalConfig, extraGlobals]) with Anon_IsCoreModule
  type ShouldInstrumentOptions = (Pick[GlobalConfig, collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom]) with Anon_ChangedFiles
}
