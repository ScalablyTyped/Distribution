package typings.ipfsCli.anon

import typings.multiaddr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addrs extends StObject {
  
  var addrs: js.Array[^]
  
  var id: String
}
object Addrs {
  
  @scala.inline
  def apply(addrs: js.Array[^], id: String): Addrs = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addrs]
  }
  
  @scala.inline
  implicit class AddrsMutableBuilder[Self <: Addrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddrs(value: js.Array[^]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddrsVarargs(value: ^ *): Self = StObject.set(x, "addrs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
