package typings.ionicCliFramework.formatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var append: js.UndefOr[String] = js.undefined
  var indentation: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    append: String = null,
    indentation: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(indentation)) __obj.updateDynamic("indentation")(indentation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

