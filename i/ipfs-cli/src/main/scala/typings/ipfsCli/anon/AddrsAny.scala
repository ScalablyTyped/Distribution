package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddrsAny extends StObject {
  
  var addrs: js.Any
  
  var id: String
}
object AddrsAny {
  
  @scala.inline
  def apply(addrs: js.Any, id: String): AddrsAny = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrsAny]
  }
  
  @scala.inline
  implicit class AddrsAnyMutableBuilder[Self <: AddrsAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddrs(value: js.Any): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
