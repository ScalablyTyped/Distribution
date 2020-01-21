package typings.jestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Options = typings.jestTransform.typesMod.ShouldInstrumentOptions with (typings.std.Pick[
    typings.jestTypes.configMod.GlobalConfig, 
    typings.jestTransform.jestTransformStrings.extraGlobals
  ]) with typings.jestTransform.AnonIsCoreModule
  type ShouldInstrumentOptions = (typings.std.Pick[
    typings.jestTypes.configMod.GlobalConfig, 
    typings.jestTransform.jestTransformStrings.collectCoverage | typings.jestTransform.jestTransformStrings.collectCoverageFrom | typings.jestTransform.jestTransformStrings.collectCoverageOnlyFrom
  ]) with typings.jestTransform.AnonChangedFiles
}
