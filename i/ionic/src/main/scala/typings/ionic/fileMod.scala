package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("ionic/lib/utils/file", "fileUtils")
  @js.native
  val fileUtils: FileUtils_ = js.native
  
  @js.native
  trait FileUtils_ extends StObject {
    
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
    implicit class FileUtils_MutableBuilder[Self <: FileUtils_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilenameReservedRegex(value: js.Any): Self = StObject.set(x, "filenameReservedRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameReservedRegexWindows(value: js.Any): Self = StObject.set(x, "filenameReservedRegexWindows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidFileName(value: js.Any => Boolean): Self = StObject.set(x, "isValidFileName", js.Any.fromFunction1(value))
    }
  }
}
