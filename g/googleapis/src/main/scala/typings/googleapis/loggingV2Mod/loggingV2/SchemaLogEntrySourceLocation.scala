package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about the source code location that produced the log
  * entry.
  */
@js.native
trait SchemaLogEntrySourceLocation extends js.Object {
  /**
    * Optional. Source file name. Depending on the runtime environment, this
    * might be a simple name or a fully-qualified name.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Optional. Human-readable name of the function or method being invoked,
    * with optional context such as the class or package name. This information
    * may be used in contexts such as the logs viewer, where a file and line
    * number are less meaningful. The format can vary by language. For example:
    * qual.if.ied.Class.method (Java), dir/package.func (Go), function
    * (Python).
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Optional. Line within the source file. 1-based; 0 indicates no line
    * number available.
    */
  var line: js.UndefOr[String] = js.native
}

object SchemaLogEntrySourceLocation {
  @scala.inline
  def apply(file: String = null, function: String = null, line: String = null): SchemaLogEntrySourceLocation = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogEntrySourceLocation]
  }
}

