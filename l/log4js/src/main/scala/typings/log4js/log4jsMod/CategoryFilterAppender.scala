package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.categoryFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryFilterAppender extends Appender {
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[String] = js.undefined
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var `type`: categoryFilter
}

object CategoryFilterAppender {
  @scala.inline
  def apply(`type`: categoryFilter, appender: String = null, exclude: String | js.Array[String] = null): CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appender != null) __obj.updateDynamic("appender")(appender.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFilterAppender]
  }
}

