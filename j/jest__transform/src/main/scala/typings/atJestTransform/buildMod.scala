package typings.atJestTransform

import typings.atJestTransform.atJestTransformStrings.`ObjectDOT<anonymous>`
import typings.atJestTransform.buildScriptTransformerMod.default
import typings.atJestTransform.buildTypesMod.ShouldInstrumentOptions
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build", JSImport.Namespace)
@js.native
object buildMod extends js.Object {
  @js.native
  class ScriptTransformer protected () extends default {
    def this(config: ProjectConfig) = this()
  }
  
  def shouldInstrument(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
  /* static members */
  @js.native
  object ScriptTransformer extends js.Object {
    var EVAL_RESULT_VARIABLE: `ObjectDOT<anonymous>` = js.native
  }
  
}

