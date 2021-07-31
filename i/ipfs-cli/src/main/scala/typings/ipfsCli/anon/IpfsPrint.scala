package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpfsPrint extends StObject {
  
  var ipfs: js.Any
  
  var print: js.Any
}
object IpfsPrint {
  
  @scala.inline
  def apply(ipfs: js.Any, print: js.Any): IpfsPrint = {
    val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpfsPrint]
  }
  
  @scala.inline
  implicit class IpfsPrintMutableBuilder[Self <: IpfsPrint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: js.Any): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
  }
}
