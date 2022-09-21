package typings.itPushable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fifoMod {
  
  @JSImport("it-pushable/dist/src/fifo", "FIFO")
  @js.native
  open class FIFO[T] () extends StObject {
    def this(options: FIFOOptions) = this()
    
    def calculateSize(obj: Any): Double = js.native
    
    /* private */ var head: Any = js.native
    
    /* private */ val hwm: Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def push(`val`: Next[T]): Unit = js.native
    
    def shift(): js.UndefOr[Next[T]] = js.native
    
    var size: Double = js.native
    
    /* private */ var tail: Any = js.native
  }
  
  trait FIFOOptions extends StObject {
    
    /**
      * When the queue reaches this size, it will be split into head/tail parts
      */
    var splitLimit: js.UndefOr[Double] = js.undefined
  }
  object FIFOOptions {
    
    inline def apply(): FIFOOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FIFOOptions]
    }
    
    extension [Self <: FIFOOptions](x: Self) {
      
      inline def setSplitLimit(value: Double): Self = StObject.set(x, "splitLimit", value.asInstanceOf[js.Any])
      
      inline def setSplitLimitUndefined: Self = StObject.set(x, "splitLimit", js.undefined)
    }
  }
  
  trait Next[T] extends StObject {
    
    var done: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Next {
    
    inline def apply[T](): Next[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next[T]]
    }
    
    extension [Self <: Next[?], T](x: Self & Next[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
