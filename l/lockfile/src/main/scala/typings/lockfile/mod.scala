package typings.lockfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lockfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(path: String, callback: js.Function2[/* err */ js.Error | Null, /* isLocked */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    path: String,
    opts: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* isLocked */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def checkSync(path: String, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lock(path: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lock(path: String, opts: Options, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lockSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def lockSync(path: String, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lockSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlock(path: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlockSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlockSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var pollPeriod: js.UndefOr[Double] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryWait: js.UndefOr[Double] = js.undefined
    
    var stale: js.UndefOr[Double] = js.undefined
    
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPollPeriod(value: Double): Self = StObject.set(x, "pollPeriod", value.asInstanceOf[js.Any])
      
      inline def setPollPeriodUndefined: Self = StObject.set(x, "pollPeriod", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryWait(value: Double): Self = StObject.set(x, "retryWait", value.asInstanceOf[js.Any])
      
      inline def setRetryWaitUndefined: Self = StObject.set(x, "retryWait", js.undefined)
      
      inline def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
