package typings.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerOptions extends js.Object {
  var diagnostics: js.UndefOr[Boolean] = js.undefined
  var emitLinks: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[EmitFormat] = js.undefined
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  var noChecks: js.UndefOr[Boolean] = js.undefined
  var noEmit: js.UndefOr[Boolean] = js.undefined
  var noEmitOnError: js.UndefOr[Boolean] = js.undefined
  var noStrictParametricProductions: js.UndefOr[Boolean] = js.undefined
  var out: js.UndefOr[String] = js.undefined
}

object CompilerOptions {
  @scala.inline
  def apply(
    diagnostics: js.UndefOr[Boolean] = js.undefined,
    emitLinks: js.UndefOr[Boolean] = js.undefined,
    format: EmitFormat = null,
    newLine: NewLineKind = null,
    noChecks: js.UndefOr[Boolean] = js.undefined,
    noEmit: js.UndefOr[Boolean] = js.undefined,
    noEmitOnError: js.UndefOr[Boolean] = js.undefined,
    noStrictParametricProductions: js.UndefOr[Boolean] = js.undefined,
    out: String = null
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diagnostics)) __obj.updateDynamic("diagnostics")(diagnostics)
    if (!js.isUndefined(emitLinks)) __obj.updateDynamic("emitLinks")(emitLinks)
    if (format != null) __obj.updateDynamic("format")(format)
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (!js.isUndefined(noChecks)) __obj.updateDynamic("noChecks")(noChecks)
    if (!js.isUndefined(noEmit)) __obj.updateDynamic("noEmit")(noEmit)
    if (!js.isUndefined(noEmitOnError)) __obj.updateDynamic("noEmitOnError")(noEmitOnError)
    if (!js.isUndefined(noStrictParametricProductions)) __obj.updateDynamic("noStrictParametricProductions")(noStrictParametricProductions)
    if (out != null) __obj.updateDynamic("out")(out)
    __obj.asInstanceOf[CompilerOptions]
  }
}

