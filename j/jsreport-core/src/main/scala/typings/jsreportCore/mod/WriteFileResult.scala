package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteFileResult extends StObject {
  
  var filename: String
  
  var pathToFile: String
}
object WriteFileResult {
  
  inline def apply(filename: String, pathToFile: String): WriteFileResult = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], pathToFile = pathToFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteFileResult] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPathToFile(value: String): Self = StObject.set(x, "pathToFile", value.asInstanceOf[js.Any])
  }
}
