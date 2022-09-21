package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadTempFileResult extends StObject {
  
  var context: String
  
  var filename: String
  
  var pathToFile: String
}
object ReadTempFileResult {
  
  inline def apply(context: String, filename: String, pathToFile: String): ReadTempFileResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], pathToFile = pathToFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadTempFileResult]
  }
  
  extension [Self <: ReadTempFileResult](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPathToFile(value: String): Self = StObject.set(x, "pathToFile", value.asInstanceOf[js.Any])
  }
}
