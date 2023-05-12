package typings.ipfsCli

import typings.ipfsCoreTypes.mod.IPFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: js.UndefOr[String] = js.undefined
    
    var migrate: js.UndefOr[Boolean] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Api {
    
    inline def apply(): Api = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait Cleanup extends StObject {
    
    def cleanup(): js.Promise[Unit]
    
    var ipfs: IPFS[Any]
    
    var isDaemon: Boolean
  }
  object Cleanup {
    
    inline def apply(cleanup: () => js.Promise[Unit], ipfs: IPFS[Any], isDaemon: Boolean): Cleanup = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cleanup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cleanup] (val x: Self) extends AnyVal {
      
      inline def setCleanup(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setIpfs(value: IPFS[Any]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def setIsDaemon(value: Boolean): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nsecs extends StObject {
    
    var nsecs: js.UndefOr[Double] = js.undefined
    
    var secs: Double
  }
  object Nsecs {
    
    inline def apply(secs: Double): Nsecs = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nsecs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nsecs] (val x: Self) extends AnyVal {
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
      
      inline def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
}
