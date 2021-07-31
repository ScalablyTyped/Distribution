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
  
  @scala.inline
  def apply(getStdin: js.Any, ipfs: js.Any, print: js.Any): Ipfs = {
    val __obj = js.Dynamic.literal(getStdin = getStdin.asInstanceOf[js.Any], ipfs = ipfs.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipfs]
  }
  
  @scala.inline
  implicit class IpfsMutableBuilder[Self <: Ipfs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStdin(value: js.Any): Self = StObject.set(x, "getStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
