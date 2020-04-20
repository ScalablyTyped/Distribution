package typings.ionic.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUtils_ extends js.Object {
  var filenameReservedRegex: js.Any
  var filenameReservedRegexWindows: js.Any
  def isValidFileName(fileName: js.Any): Boolean
}

object FileUtils_ {
  @scala.inline
  def apply(
    filenameReservedRegex: js.Any,
    filenameReservedRegexWindows: js.Any,
    isValidFileName: js.Any => Boolean
  ): FileUtils_ = {
    val __obj = js.Dynamic.literal(filenameReservedRegex = filenameReservedRegex.asInstanceOf[js.Any], filenameReservedRegexWindows = filenameReservedRegexWindows.asInstanceOf[js.Any], isValidFileName = js.Any.fromFunction1(isValidFileName))
    __obj.asInstanceOf[FileUtils_]
  }
}

