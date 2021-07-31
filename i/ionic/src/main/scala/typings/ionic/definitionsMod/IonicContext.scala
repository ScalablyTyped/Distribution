package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonicContext extends StObject {
  
  val binPath: String
  
  val execPath: String
  
  val libPath: String
  
  val version: String
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
