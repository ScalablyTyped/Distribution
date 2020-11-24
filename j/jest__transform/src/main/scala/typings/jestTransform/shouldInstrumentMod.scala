package typings.jestTransform

import typings.jestTransform.typesMod.ShouldInstrumentOptions
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/transform/build/shouldInstrument", JSImport.Namespace)
@js.native
object shouldInstrumentMod extends js.Object {
  
  def default(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
}
