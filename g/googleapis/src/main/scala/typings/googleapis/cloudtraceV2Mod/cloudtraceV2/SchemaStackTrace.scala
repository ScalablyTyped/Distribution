package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A call stack appearing in a trace.
  */
trait SchemaStackTrace extends StObject {
  
  /**
    * Stack frames in this stack trace. A maximum of 128 frames are allowed.
    */
  var stackFrames: js.UndefOr[SchemaStackFrames] = js.undefined
  
  /**
    * The hash ID is used to conserve network bandwidth for duplicate stack
    * traces within a single trace.  Often multiple spans will have identical
    * stack traces. The first occurrence of a stack trace should contain both
    * the `stackFrame` content and a value in `stackTraceHashId`.  Subsequent
    * spans within the same request can refer to that stack trace by only
    * setting `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[String] = js.undefined
}
object SchemaStackTrace {
  
  @scala.inline
  def apply(): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTrace]
  }
  
  @scala.inline
  implicit class SchemaStackTraceMutableBuilder[Self <: SchemaStackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackFrames(value: SchemaStackFrames): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    @scala.inline
    def setStackTraceHashId(value: String): Self = StObject.set(x, "stackTraceHashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceHashIdUndefined: Self = StObject.set(x, "stackTraceHashId", js.undefined)
  }
}
