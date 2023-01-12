package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackTrace extends StObject {
  
  /** Stack frames in this stack trace. A maximum of 128 frames are allowed. */
  var stackFrames: js.UndefOr[StackFrames] = js.undefined
  
  /**
    * The hash ID is used to conserve network bandwidth for duplicate stack traces within a single trace. Often multiple spans will have identical stack traces. The first occurrence of a
    * stack trace should contain both the `stackFrame` content and a value in `stackTraceHashId`. Subsequent spans within the same request can refer to that stack trace by only setting
    * `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[String] = js.undefined
}
object StackTrace {
  
  inline def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTrace] (val x: Self) extends AnyVal {
    
    inline def setStackFrames(value: StackFrames): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    inline def setStackTraceHashId(value: String): Self = StObject.set(x, "stackTraceHashId", value.asInstanceOf[js.Any])
    
    inline def setStackTraceHashIdUndefined: Self = StObject.set(x, "stackTraceHashId", js.undefined)
  }
}
