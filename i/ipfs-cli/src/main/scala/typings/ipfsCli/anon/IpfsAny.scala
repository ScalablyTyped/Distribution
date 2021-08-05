package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpfsAny extends StObject {
  
  var ipfs: js.Any
}
object IpfsAny {
  
  inline def apply(ipfs: js.Any): IpfsAny = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpfsAny]
  }
  
  extension [Self <: IpfsAny](x: Self) {
    
    inline def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
  }
}
