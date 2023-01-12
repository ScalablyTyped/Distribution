package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Darwin extends StObject {
  
  /** For OSX */
  var darwin: js.Array[String]
  
  /** For Linux */
  var linux: js.Array[String]
  
  /** For Windows */
  var win32: js.Array[String]
}
object Darwin {
  
  inline def apply(darwin: js.Array[String], linux: js.Array[String], win32: js.Array[String]): Darwin = {
    val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any])
    __obj.asInstanceOf[Darwin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Darwin] (val x: Self) extends AnyVal {
    
    inline def setDarwin(value: js.Array[String]): Self = StObject.set(x, "darwin", value.asInstanceOf[js.Any])
    
    inline def setDarwinVarargs(value: String*): Self = StObject.set(x, "darwin", js.Array(value*))
    
    inline def setLinux(value: js.Array[String]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxVarargs(value: String*): Self = StObject.set(x, "linux", js.Array(value*))
    
    inline def setWin32(value: js.Array[String]): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
    
    inline def setWin32Varargs(value: String*): Self = StObject.set(x, "win32", js.Array(value*))
  }
}
