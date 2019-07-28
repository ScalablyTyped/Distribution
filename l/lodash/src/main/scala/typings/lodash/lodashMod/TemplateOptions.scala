package typings.lodash.lodashMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// template
trait TemplateOptions extends TemplateSettings {
  /**
    * The sourceURL of the template's compiled source.
    */
  var sourceURL: js.UndefOr[String] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(
    escape: RegExp = null,
    evaluate: RegExp = null,
    imports: Dictionary[_] = null,
    interpolate: RegExp = null,
    sourceURL: String = null,
    variable: String = null
  ): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[TemplateOptions]
  }
}

