package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends StObject {
  
  /** The target state id */
  var id: String = js.native
  
  /** An optional conversion function when reading, e.g. `"(val − 32) * 5/9"` */
  var read: js.UndefOr[String] = js.native
  
  /** An optional conversion function when reading, e.g. `"(val * 9/5) + 32"` */
  var write: js.UndefOr[String] = js.native
}
object Read {
  
  @scala.inline
  def apply(id: String): Read = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
  
  @scala.inline
  implicit class ReadMutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setWrite(value: String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
