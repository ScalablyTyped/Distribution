package typings.ionic.libUtilsFileMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUtils extends js.Object {
  var filenameReservedRegex: js.Any
  var filenameReservedRegexWindows: js.Any
  def isValidFileName(fileName: js.Any): Boolean
}

object FileUtils {
  @scala.inline
  def apply(
    filenameReservedRegex: js.Any,
    filenameReservedRegexWindows: js.Any,
    isValidFileName: js.Any => Boolean
  ): FileUtils = {
    val __obj = js.Dynamic.literal(filenameReservedRegex = filenameReservedRegex.asInstanceOf[js.Any], filenameReservedRegexWindows = filenameReservedRegexWindows.asInstanceOf[js.Any], isValidFileName = js.Any.fromFunction1(isValidFileName))
  
    __obj.asInstanceOf[FileUtils]
  }
}

@JSImport("ionic/lib/utils/file", "fileUtils")
@js.native
object fileUtils extends TopLevel[FileUtils]

