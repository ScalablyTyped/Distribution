package typings.lockfile

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lockfile", "check")
  @js.native
  def check(path: String, callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]): Unit = js.native
  @JSImport("lockfile", "check")
  @js.native
  def check(
    path: String,
    opts: Options,
    callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("lockfile", "checkSync")
  @js.native
  def checkSync(path: String): Boolean = js.native
  @JSImport("lockfile", "checkSync")
  @js.native
  def checkSync(path: String, opts: Options): Boolean = js.native
  
  @JSImport("lockfile", "lock")
  @js.native
  def lock(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSImport("lockfile", "lock")
  @js.native
  def lock(path: String, opts: Options, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  @JSImport("lockfile", "lockSync")
  @js.native
  def lockSync(path: String): Unit = js.native
  @JSImport("lockfile", "lockSync")
  @js.native
  def lockSync(path: String, opts: Options): Unit = js.native
  
  @JSImport("lockfile", "unlock")
  @js.native
  def unlock(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  @JSImport("lockfile", "unlockSync")
  @js.native
  def unlockSync(path: String): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var pollPeriod: js.UndefOr[Double] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var retryWait: js.UndefOr[Double] = js.native
    
    var stale: js.UndefOr[Double] = js.native
    
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPollPeriod(value: Double): Self = StObject.set(x, "pollPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollPeriodUndefined: Self = StObject.set(x, "pollPeriod", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetryWait(value: Double): Self = StObject.set(x, "retryWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryWaitUndefined: Self = StObject.set(x, "retryWait", js.undefined)
      
      @scala.inline
      def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
