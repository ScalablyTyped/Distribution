package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ellipsis extends js.Object {
  var ellipsis: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var hyphen: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var separator: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var svgDocument: js.UndefOr[stdLib.SVGElement] = js.undefined
}

object Anon_Ellipsis {
  @scala.inline
  def apply(
    ellipsis: scala.Boolean | java.lang.String = null,
    eol: java.lang.String = null,
    hyphen: java.lang.String | stdLib.RegExp = null,
    separator: java.lang.String | js.Any = null,
    svgDocument: stdLib.SVGElement = null
  ): Anon_Ellipsis = {
    val __obj = js.Dynamic.literal()
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (hyphen != null) __obj.updateDynamic("hyphen")(hyphen.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (svgDocument != null) __obj.updateDynamic("svgDocument")(svgDocument)
    __obj.asInstanceOf[Anon_Ellipsis]
  }
}

