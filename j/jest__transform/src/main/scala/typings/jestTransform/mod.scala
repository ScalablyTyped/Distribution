package typings.jestTransform

import typings.jestTransform.enhanceUnexpectedTokenMessageMod.ErrorWithCodeFrame
import typings.jestTransform.scriptTransformerMod.default
import typings.jestTransform.typesMod.ShouldInstrumentOptions
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/transform", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createTranspilingRequire(config: ProjectConfig): js.Function2[/* resolverPath */ String, /* applyInteropRequireDefault */ js.UndefOr[Boolean], _] = js.native
  
  def handlePotentialSyntaxError(e: ErrorWithCodeFrame): ErrorWithCodeFrame = js.native
  
  def shouldInstrument(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
  
  @js.native
  class ScriptTransformer protected () extends default {
    def this(config: ProjectConfig) = this()
  }
}
