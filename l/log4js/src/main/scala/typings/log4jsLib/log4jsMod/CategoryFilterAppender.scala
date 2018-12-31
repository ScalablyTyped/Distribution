package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryFilterAppender extends js.Object {
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[java.lang.String] = js.undefined
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.categoryFilter
}

