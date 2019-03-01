package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryFilterAppender extends Appender {
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[java.lang.String] = js.undefined
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.categoryFilter
}

object CategoryFilterAppender {
  @scala.inline
  def apply(
    `type`: log4jsLib.log4jsLibStrings.categoryFilter,
    appender: java.lang.String = null,
    exclude: java.lang.String | js.Array[java.lang.String] = null
  ): CategoryFilterAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (appender != null) __obj.updateDynamic("appender")(appender)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFilterAppender]
  }
}

