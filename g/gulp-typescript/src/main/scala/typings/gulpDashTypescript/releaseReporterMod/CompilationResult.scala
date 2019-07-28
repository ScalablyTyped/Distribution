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
    val __obj = js.Dynamic.literal(declarationErrors = declarationErrors, emitErrors = emitErrors, emitSkipped = emitSkipped, globalErrors = globalErrors, noEmit = noEmit, optionsErrors = optionsErrors, semanticErrors = semanticErrors, syntaxErrors = syntaxErrors, transpileErrors = transpileErrors)
  
    __obj.asInstanceOf[CompilationResult]
  }
}

