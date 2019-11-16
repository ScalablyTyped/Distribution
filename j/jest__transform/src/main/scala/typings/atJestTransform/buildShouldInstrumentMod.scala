package typings.atJestTransform

import typings.atJestTransform.buildTypesMod.ShouldInstrumentOptions
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build/shouldInstrument", JSImport.Namespace)
@js.native
object buildShouldInstrumentMod extends js.Object {
  def default(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
}

