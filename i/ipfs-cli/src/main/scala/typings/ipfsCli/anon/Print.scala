package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Print extends StObject {
  
  var ipfs: js.Any
  
  var print: js.Any
}
object Print {
  
  inline def apply(ipfs: js.Any, print: js.Any): Print = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
  
  extension [Self <: Print](x: Self) {
    
    inline def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
