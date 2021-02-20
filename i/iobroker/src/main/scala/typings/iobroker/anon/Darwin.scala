package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Darwin extends StObject {
  
  /** For OSX */
  var darwin: js.Array[String] = js.native
  
  /** For Linux */
  var linux: js.Array[String] = js.native
  
  /** For Windows */
  var win32: js.Array[String] = js.native
}
object Darwin {
  
  @scala.inline
  def apply(darwin: js.Array[String], linux: js.Array[String], win32: js.Array[String]): Darwin = {
    val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any])
    __obj.asInstanceOf[Darwin]
  }
  
  @scala.inline
  implicit class DarwinMutableBuilder[Self <: Darwin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDarwin(value: js.Array[String]): Self = StObject.set(x, "darwin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarwinVarargs(value: String*): Self = StObject.set(x, "darwin", js.Array(value :_*))
    
    @scala.inline
    def setLinux(value: js.Array[String]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxVarargs(value: String*): Self = StObject.set(x, "linux", js.Array(value :_*))
    
    @scala.inline
    def setWin32(value: js.Array[String]): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin32Varargs(value: String*): Self = StObject.set(x, "win32", js.Array(value :_*))
  }
}
