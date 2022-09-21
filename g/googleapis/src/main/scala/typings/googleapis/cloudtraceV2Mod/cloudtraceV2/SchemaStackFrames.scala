package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackFrames extends StObject {
  
  /**
    * The number of stack frames that were dropped because there were too many stack frames. If this value is 0, then no stack frames were dropped.
    */
  var droppedFramesCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Stack frames in this call stack.
    */
  var frame: js.UndefOr[js.Array[SchemaStackFrame]] = js.undefined
}
object SchemaStackFrames {
  
  inline def apply(): SchemaStackFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrames]
  }
  
  extension [Self <: SchemaStackFrames](x: Self) {
    
    inline def setDroppedFramesCount(value: Double): Self = StObject.set(x, "droppedFramesCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedFramesCountNull: Self = StObject.set(x, "droppedFramesCount", null)
    
    inline def setDroppedFramesCountUndefined: Self = StObject.set(x, "droppedFramesCount", js.undefined)
    
    inline def setFrame(value: js.Array[SchemaStackFrame]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFrameVarargs(value: SchemaStackFrame*): Self = StObject.set(x, "frame", js.Array(value*))
  }
}
