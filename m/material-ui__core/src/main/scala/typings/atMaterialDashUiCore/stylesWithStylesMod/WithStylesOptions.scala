package typings.atMaterialDashUiCore.stylesWithStylesMod

import typings.jss.jssMod.Rule
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent jss.jss.CreateStyleSheetOptions<ClassKey> */
trait WithStylesOptions[ClassKey /* <: String */] extends js.Object {
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[HTMLStyleElement] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var generateClassName: js.UndefOr[js.Function1[/* rule */ Rule, String]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var link: js.UndefOr[Boolean] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var withTheme: js.UndefOr[Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply[ClassKey /* <: String */](
    classNamePrefix: String = null,
    element: HTMLStyleElement = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    generateClassName: /* rule */ Rule => String = null,
    index: Int | Double = null,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null,
    name: String = null,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): WithStylesOptions[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction1(generateClassName))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (media != null) __obj.updateDynamic("media")(media)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme)
    __obj.asInstanceOf[WithStylesOptions[ClassKey]]
  }
}

