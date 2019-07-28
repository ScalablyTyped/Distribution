package typings.jointjs

import typings.std.RegExp
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ellipsis extends js.Object {
  var ellipsis: js.UndefOr[Boolean | String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var hyphen: js.UndefOr[String | RegExp] = js.undefined
  var separator: js.UndefOr[String | js.Any] = js.undefined
  var svgDocument: js.UndefOr[SVGElement] = js.undefined
}

object Anon_Ellipsis {
  @scala.inline
  def apply(
    ellipsis: Boolean | String = null,
    eol: String = null,
    hyphen: String | RegExp = null,
    separator: String | js.Any = null,
    svgDocument: SVGElement = null
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

