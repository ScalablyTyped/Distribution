package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A call stack appearing in a trace.
  */
@js.native
trait SchemaStackTrace extends js.Object {
  /**
    * Stack frames in this stack trace. A maximum of 128 frames are allowed.
    */
  var stackFrames: js.UndefOr[SchemaStackFrames] = js.native
  /**
    * The hash ID is used to conserve network bandwidth for duplicate stack
    * traces within a single trace.  Often multiple spans will have identical
    * stack traces. The first occurrence of a stack trace should contain both
    * the `stackFrame` content and a value in `stackTraceHashId`.  Subsequent
    * spans within the same request can refer to that stack trace by only
    * setting `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[String] = js.native
}

object SchemaStackTrace {
  @scala.inline
  def apply(stackFrames: SchemaStackFrames = null, stackTraceHashId: String = null): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    if (stackFrames != null) __obj.updateDynamic("stackFrames")(stackFrames.asInstanceOf[js.Any])
    if (stackTraceHashId != null) __obj.updateDynamic("stackTraceHashId")(stackTraceHashId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStackTrace]
  }
}

