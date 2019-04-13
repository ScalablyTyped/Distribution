package typings
package highlightDotJsLib.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var classPrefix: js.UndefOr[java.lang.String] = js.undefined
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tabReplace: js.UndefOr[java.lang.String] = js.undefined
  var useBR: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    classPrefix: java.lang.String = null,
    languages: js.Array[java.lang.String] = null,
    tabReplace: java.lang.String = null,
    useBR: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (tabReplace != null) __obj.updateDynamic("tabReplace")(tabReplace)
    if (!js.isUndefined(useBR)) __obj.updateDynamic("useBR")(useBR)
    __obj.asInstanceOf[IOptions]
  }
}

