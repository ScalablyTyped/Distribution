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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("declarationErrors")(declarationErrors)
    __obj.updateDynamic("emitErrors")(emitErrors)
    __obj.updateDynamic("emitSkipped")(emitSkipped)
    __obj.updateDynamic("globalErrors")(globalErrors)
    __obj.updateDynamic("noEmit")(noEmit)
    __obj.updateDynamic("optionsErrors")(optionsErrors)
    __obj.updateDynamic("semanticErrors")(semanticErrors)
    __obj.updateDynamic("syntaxErrors")(syntaxErrors)
    __obj.updateDynamic("transpileErrors")(transpileErrors)
    __obj.asInstanceOf[CompilationResult]
  }
}

