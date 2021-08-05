package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("ionic/lib/utils/file", "fileUtils")
  @js.native
  val fileUtils: FileUtils_ = js.native
  
  trait FileUtils_ extends StObject {
    
    /* private */ var filenameReservedRegex: js.Any
    
    /* private */ var filenameReservedRegexWindows: js.Any
    
    def isValidFileName(fileName: js.Any): Boolean
  }
  object FileUtils_ {
    
    inline def apply(
      filenameReservedRegex: js.Any,
      filenameReservedRegexWindows: js.Any,
      isValidFileName: js.Any => Boolean
    ): FileUtils_ = {
      val __obj = js.Dynamic.literal(filenameReservedRegex = filenameReservedRegex.asInstanceOf[js.Any], filenameReservedRegexWindows = filenameReservedRegexWindows.asInstanceOf[js.Any], isValidFileName = js.Any.fromFunction1(isValidFileName))
      __obj.asInstanceOf[FileUtils_]
    }
    
    extension [Self <: FileUtils_](x: Self) {
      
      inline def setFilenameReservedRegex(value: js.Any): Self = StObject.set(x, "filenameReservedRegex", value.asInstanceOf[js.Any])
      
      inline def setFilenameReservedRegexWindows(value: js.Any): Self = StObject.set(x, "filenameReservedRegexWindows", value.asInstanceOf[js.Any])
      
      inline def setIsValidFileName(value: js.Any => Boolean): Self = StObject.set(x, "isValidFileName", js.Any.fromFunction1(value))
    }
  }
}
