package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Read extends StObject {
  
  var read: String
  
  var write: String
}
object Read {
  
  inline def apply(read: String, write: String): Read = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
    
    inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
