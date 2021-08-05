package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanupIpfs extends StObject {
  
  def cleanup(): js.Promise[Unit]
  
  var ipfs: Cat
  
  var isDaemon: Boolean
}
object CleanupIpfs {
  
  inline def apply(cleanup: () => js.Promise[Unit], ipfs: Cat, isDaemon: Boolean): CleanupIpfs = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupIpfs]
  }
  
  extension [Self <: CleanupIpfs](x: Self) {
    
    inline def setCleanup(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
    
    inline def setIpfs(value: Cat): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setIsDaemon(value: Boolean): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
  }
}
