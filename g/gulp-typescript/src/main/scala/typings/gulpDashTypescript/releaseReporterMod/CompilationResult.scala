package typings.gulpDashTypescript.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationResult extends js.Object {
  var declarationErrors: Double
  var emitErrors: Double
  var emitSkipped: Boolean
  var globalErrors: Double
  var noEmit: Boolean
  var optionsErrors: Double
  var semanticErrors: Double
  var syntaxErrors: Double
  /**
    * Only used when using isolatedModules.
    */
  var transpileErrors: Double
}

object CompilationResult {
  @scala.inline
  def apply(
    declarationErrors: Double,
    emitErrors: Double,
    emitSkipped: Boolean,
    globalErrors: Double,
    noEmit: Boolean,
    optionsErrors: Double,
    semanticErrors: Double,
    syntaxErrors: Double,
    transpileErrors: Double
  ): CompilationResult = {
    val __obj = js.Dynamic.literal(declarationErrors = declarationErrors.asInstanceOf[js.Any], emitErrors = emitErrors.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any], globalErrors = globalErrors.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], optionsErrors = optionsErrors.asInstanceOf[js.Any], semanticErrors = semanticErrors.asInstanceOf[js.Any], syntaxErrors = syntaxErrors.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompilationResult]
  }
}

