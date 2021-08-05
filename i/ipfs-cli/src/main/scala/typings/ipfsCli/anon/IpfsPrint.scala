package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpfsPrint extends StObject {
  
  var ipfs: js.Any
  
  var print: js.Any
}
object IpfsPrint {
  
  inline def apply(ipfs: js.Any, print: js.Any): IpfsPrint = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpfsPrint]
  }
  
  extension [Self <: IpfsPrint](x: Self) {
    
    inline def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
