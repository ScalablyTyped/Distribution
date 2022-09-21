package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of rm */
trait RmResult extends StObject {
  
  /** The name of the deleted file or directory */
  var file: String
  
  /** The parent directory of the deleted file or directory */
  var path: String
}
object RmResult {
  
  inline def apply(file: String, path: String): RmResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
  
  extension [Self <: RmResult](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
