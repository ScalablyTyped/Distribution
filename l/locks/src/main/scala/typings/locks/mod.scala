package typings.locks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("locks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("locks", "CondVariable")
  @js.native
  open class CondVariable protected () extends StObject {
    /** Construct a new conditional variable with the specified initial value. */
    def this(initialValue: Any) = this()
    
    /** Get the current conditional variable value. */
    def get(): Any = js.native
    
    /** Set the conditional variable value. */
    def set(value: Any): Unit = js.native
    
    /** Add a callback when the specified conditional variable value matches the specified value. */
    def wait(value: Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("locks", "Mutex")
  @js.native
  /** Construct a new mutex lock. */
  open class Mutex () extends StObject {
    
    /** Flag indicating whether the lock is currently taken. */
    var isLocked: Boolean = js.native
    
    /** Take the lock. */
    def lock(callback: js.Function0[Unit]): Unit = js.native
    
    /** Clear any waiting lock callbacks. */
    def resetQueue(): Unit = js.native
    
    /** Wait the specified number of milliseconds to take the lock. If error is set, the lock wasn't taken. */
    def timedLock(ttl: Double, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Try taking the lock. If false, the lock wasn't taken. */
    def tryLock(): Boolean = js.native
    
    /** Release the current lock. */
    def unlock(): Unit = js.native
  }
  
  @JSImport("locks", "ReadWriteLock")
  @js.native
  /** Construct a new reader writer lock */
  open class ReadWriteLock () extends StObject {
    
    /** Flag indicating whether the reader writer lock is holding the read lock */
    var isReadLocked: Boolean = js.native
    
    /** Flag indicating whether the reader writer lock is holding the write lock */
    var isWriteLocked: Boolean = js.native
    
    /** Get the read lock */
    def readLock(callback: js.Function0[Unit]): Unit = js.native
    
    /** Wait the specified number of milliseconds to take the read lock. If error is set, the lock wasn't taken. */
    def timedReadLock(ttl: Double, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Wait the specified number of milliseconds to take the write lock. If error is set, the lock wasn't taken. */
    def timedWriteLock(ttl: Double, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /** Try taking the read lock. If false, the lock wasn't taken. */
    def tryReadLock(): Boolean = js.native
    
    /** Try taking the write lock. If false, the lock wasn't taken. */
    def tryWriteLock(): Boolean = js.native
    
    /** Release the write lock if taken, or one of the taken read locks. */
    def unlock(): Unit = js.native
    
    /** Get the write lock */
    def writeLock(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("locks", "Semaphore")
  @js.native
  open class Semaphore protected () extends StObject {
    /** Construct a new semaphore. */
    def this(initialCount: Double) = this()
    
    /** Signal a callback. */
    def signal(): Unit = js.native
    
    /** Queue a callback. Callbacks are called in sequence on signals. */
    def wait(callback: js.Function0[Unit]): Unit = js.native
  }
  
  inline def createCondVariable(initialValue: Any): CondVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createCondVariable")(initialValue.asInstanceOf[js.Any]).asInstanceOf[CondVariable]
  
  inline def createMutex(): Mutex = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[Mutex]
  
  inline def createReadWriteLock(): ReadWriteLock = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadWriteLock")().asInstanceOf[ReadWriteLock]
  
  inline def createSemaphore(initialValue: Double): Semaphore = ^.asInstanceOf[js.Dynamic].applyDynamic("createSemaphore")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Semaphore]
}
