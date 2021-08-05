package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDaemon extends StObject {
  
  var ipfs: js.Any
  
  var isDaemon: js.Any
}
object IsDaemon {
  
  inline def apply(ipfs: js.Any, isDaemon: js.Any): IsDaemon = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDaemon]
  }
  
  extension [Self <: IsDaemon](x: Self) {
    
    inline def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setIsDaemon(value: js.Any): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
  }
}
