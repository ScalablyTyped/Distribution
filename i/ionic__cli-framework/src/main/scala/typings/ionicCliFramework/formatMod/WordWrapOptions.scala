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
  def apply(append: String = null, indentation: Int | Double = null, width: Int | Double = null): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

