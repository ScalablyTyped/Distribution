package typings.ipfsHttpClient.anon

import typings.multiaddr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var addrs: js.Array[^]
  
  var id: typings.cids.mod.^
}
object Id {
  
  inline def apply(addrs: js.Array[^], id: typings.cids.mod.^): Id = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setAddrs(value: js.Array[^]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsVarargs(value: ^ *): Self = StObject.set(x, "addrs", js.Array(value :_*))
    
    inline def setId(value: typings.cids.mod.^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
