package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
  * (ERB). Change the following template settings to use alternative delimiters.
  **/
trait TemplateSettings extends js.Object {
  /**
    * The "escape" delimiter.
    **/
  var escape: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * The "evaluate" delimiter.
    **/
  var evaluate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * An object to import into the template as local variables.
    **/
  var imports: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * The "interpolate" delimiter.
    **/
  var interpolate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Used to reference the data object in the template text.
    **/
  var variable: js.UndefOr[java.lang.String] = js.undefined
}

object TemplateSettings {
  @scala.inline
  def apply(
    escape: stdLib.RegExp = null,
    evaluate: stdLib.RegExp = null,
    imports: Dictionary[_] = null,
    interpolate: stdLib.RegExp = null,
    variable: java.lang.String = null
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[TemplateSettings]
  }
}

