package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpfsIsDaemon extends StObject {
  
  var ipfs: js.Any
  
  var isDaemon: js.Any
  
  var print: js.Any
}
object IpfsIsDaemon {
  
  @scala.inline
  def apply(ipfs: js.Any, isDaemon: js.Any, print: js.Any): IpfsIsDaemon = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpfsIsDaemon]
  }
  
  @scala.inline
  implicit class IpfsIsDaemonMutableBuilder[Self <: IpfsIsDaemon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDaemon(value: js.Any): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
