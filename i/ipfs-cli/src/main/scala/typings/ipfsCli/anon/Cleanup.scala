package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cleanup extends StObject {
  
  def cleanup(): js.Promise[Unit]
  
  var ipfs: Bootstrap
  
  var isDaemon: Boolean
}
object Cleanup {
  
  @scala.inline
  def apply(cleanup: () => js.Promise[Unit], ipfs: Bootstrap, isDaemon: Boolean): Cleanup = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cleanup]
  }
  
  @scala.inline
  implicit class CleanupMutableBuilder[Self <: Cleanup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanup(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIpfs(value: Bootstrap): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDaemon(value: Boolean): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
  }
}
