package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoadResult extends StObject {
  
  /** The contents of the file, as a string. */
  var contents: String
  
  /** Full resolved path to file. */
  var filename: String
}
object FileLoadResult {
  
  inline def apply(contents: String, filename: String): FileLoadResult = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLoadResult]
  }
  
  extension [Self <: FileLoadResult](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
  }
}
