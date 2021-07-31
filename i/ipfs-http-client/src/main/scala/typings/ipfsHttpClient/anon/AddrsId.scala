package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddrsId extends StObject {
  
  var addrs: js.Any
  
  var id: String
}
object AddrsId {
  
  @scala.inline
  def apply(addrs: js.Any, id: String): AddrsId = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrsId]
  }
  
  @scala.inline
  implicit class AddrsIdMutableBuilder[Self <: AddrsId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddrs(value: js.Any): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
