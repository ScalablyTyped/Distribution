package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiFileAppender extends Appender {
  // the base part of the generated log filename
  var base: java.lang.String
  // the suffix for the generated log filename.
  var extension: java.lang.String
  // the value to use to split files (see below).
  var property: java.lang.String
  var `type`: log4jsLib.log4jsLibStrings.multiFile
}

object MultiFileAppender {
  @scala.inline
  def apply(
    base: java.lang.String,
    extension: java.lang.String,
    property: java.lang.String,
    `type`: log4jsLib.log4jsLibStrings.multiFile
  ): MultiFileAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[MultiFileAppender]
  }
}

