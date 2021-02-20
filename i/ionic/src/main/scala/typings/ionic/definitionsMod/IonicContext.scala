package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicContext extends StObject {
  
  val binPath: String = js.native
  
  val execPath: String = js.native
  
  val libPath: String = js.native
  
  val version: String = js.native
}
object IonicContext {
  
  @scala.inline
  def apply(binPath: String, execPath: String, libPath: String, version: String): IonicContext = {
    val __obj = js.Dynamic.literal(binPath = binPath.asInstanceOf[js.Any], execPath = execPath.asInstanceOf[js.Any], libPath = libPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicContext]
  }
  
  @scala.inline
  implicit class IonicContextMutableBuilder[Self <: IonicContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinPath(value: String): Self = StObject.set(x, "binPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibPath(value: String): Self = StObject.set(x, "libPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
