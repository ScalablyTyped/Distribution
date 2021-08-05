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
  
  inline def apply(addrs: js.Array[^], id: String): Addrs = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addrs]
  }
  
  extension [Self <: Addrs](x: Self) {
    
    inline def setAddrs(value: js.Array[^]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsVarargs(value: ^ *): Self = StObject.set(x, "addrs", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
