package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipfs extends StObject {
  
  var getStdin: js.Any
  
  var ipfs: js.Any
  
  var print: js.Any
}
object Ipfs {
  
  inline def apply(getStdin: js.Any, ipfs: js.Any, print: js.Any): Ipfs = {
    val __obj = js.Dynamic.literal(getStdin = getStdin.asInstanceOf[js.Any], ipfs = ipfs.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipfs]
  }
  
  extension [Self <: Ipfs](x: Self) {
    
    inline def setGetStdin(value: js.Any): Self = StObject.set(x, "getStdin", value.asInstanceOf[js.Any])
    
    inline def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
