package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stack trace through the script that shows where the execution failed.
  */
@js.native
trait SchemaScriptStackTraceElement extends js.Object {
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}

object SchemaScriptStackTraceElement {
  @scala.inline
  def apply(function: String = null, lineNumber: Int | Double = null): SchemaScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScriptStackTraceElement]
  }
}

