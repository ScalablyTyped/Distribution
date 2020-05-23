package typings.gulpMinify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Min extends js.Object {
  /**
    * The suffix string of the filenames that output minified files ends with or the regex expressions to be replaced with input filenames.
    */
  var min: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The suffix string of the filenames that output source files ends with.
    */
  var src: js.UndefOr[String] = js.undefined
}

object Min {
  @scala.inline
  def apply(min: String | js.Array[String] = null, src: String = null): Min = {
    val __obj = js.Dynamic.literal()
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
}

