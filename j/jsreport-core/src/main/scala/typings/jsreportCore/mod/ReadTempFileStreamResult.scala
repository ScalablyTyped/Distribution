package typings.jsreportCore.mod

import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadTempFileStreamResult extends StObject {
  
  var filename: String
  
  var pathToFile: String
  
  var stream: ReadStream
}
object ReadTempFileStreamResult {
  
  inline def apply(filename: String, pathToFile: String, stream: ReadStream): ReadTempFileStreamResult = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], pathToFile = pathToFile.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadTempFileStreamResult]
  }
  
  extension [Self <: ReadTempFileStreamResult](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPathToFile(value: String): Self = StObject.set(x, "pathToFile", value.asInstanceOf[js.Any])
    
    inline def setStream(value: ReadStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
