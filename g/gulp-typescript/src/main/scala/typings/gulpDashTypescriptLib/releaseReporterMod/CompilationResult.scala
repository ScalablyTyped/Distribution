package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationResult extends js.Object {
  var declarationErrors: scala.Double
  var emitErrors: scala.Double
  var emitSkipped: scala.Boolean
  var globalErrors: scala.Double
  var noEmit: scala.Boolean
  var optionsErrors: scala.Double
  var semanticErrors: scala.Double
  var syntaxErrors: scala.Double
  /**
    * Only used when using isolatedModules.
    */
  var transpileErrors: scala.Double
}

object CompilationResult {
  @scala.inline
  def apply(
    declarationErrors: scala.Double,
    emitErrors: scala.Double,
    emitSkipped: scala.Boolean,
    globalErrors: scala.Double,
    noEmit: scala.Boolean,
    optionsErrors: scala.Double,
    semanticErrors: scala.Double,
    syntaxErrors: scala.Double,
    transpileErrors: scala.Double
  ): CompilationResult = {
    val __obj = js.Dynamic.literal(declarationErrors = declarationErrors, emitErrors = emitErrors, emitSkipped = emitSkipped, globalErrors = globalErrors, noEmit = noEmit, optionsErrors = optionsErrors, semanticErrors = semanticErrors, syntaxErrors = syntaxErrors, transpileErrors = transpileErrors)
  
    __obj.asInstanceOf[CompilationResult]
  }
}

