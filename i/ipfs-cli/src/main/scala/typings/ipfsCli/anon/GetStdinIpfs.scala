package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStdinIpfs extends StObject {
  
  var getStdin: js.Any
  
  var ipfs: js.Any
}
object GetStdinIpfs {
  
  @scala.inline
  def apply(getStdin: js.Any, ipfs: js.Any): GetStdinIpfs = {
    val __obj = js.Dynamic.literal(getStdin = getStdin.asInstanceOf[js.Any], ipfs = ipfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStdinIpfs]
  }
  
  @scala.inline
  implicit class GetStdinIpfsMutableBuilder[Self <: GetStdinIpfs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStdin(value: js.Any): Self = StObject.set(x, "getStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
  }
}
