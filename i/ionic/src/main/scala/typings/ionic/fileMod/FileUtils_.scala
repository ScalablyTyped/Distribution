package typings.ionic.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUtils_ extends js.Object {
  var filenameReservedRegex: js.Any = js.native
  var filenameReservedRegexWindows: js.Any = js.native
  def isValidFileName(fileName: js.Any): Boolean = js.native
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
  @scala.inline
  implicit class FileUtils_Ops[Self <: FileUtils_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilenameReservedRegex(value: js.Any): Self = this.set("filenameReservedRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilenameReservedRegexWindows(value: js.Any): Self = this.set("filenameReservedRegexWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValidFileName(value: js.Any => Boolean): Self = this.set("isValidFileName", js.Any.fromFunction1(value))
  }
  
}

