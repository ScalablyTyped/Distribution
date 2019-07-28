package typings.highlightDotJs.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var classPrefix: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  var tabReplace: js.UndefOr[String] = js.undefined
  var useBR: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    classPrefix: String = null,
    languages: js.Array[String] = null,
    tabReplace: String = null,
    useBR: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (tabReplace != null) __obj.updateDynamic("tabReplace")(tabReplace)
    if (!js.isUndefined(useBR)) __obj.updateDynamic("useBR")(useBR)
    __obj.asInstanceOf[IOptions]
  }
}

