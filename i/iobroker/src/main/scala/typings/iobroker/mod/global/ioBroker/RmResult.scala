package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of rm */
@js.native
trait RmResult extends StObject {
  
  /** The name of the deleted file or directory */
  var file: String = js.native
  
  /** Whether the deleted object was a directory or a file */
  var isDir: Boolean = js.native
  
  /** The parent directory of the deleted file or directory */
  var path: String = js.native
}
object RmResult {
  
  @scala.inline
  def apply(file: String, isDir: Boolean, path: String): RmResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
  
  @scala.inline
  implicit class RmResultMutableBuilder[Self <: RmResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
