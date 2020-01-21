package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic tool step to be used for binaries we do not explicitly support. For
  * example: running cp to copy artifacts from one location to another.
  */
@js.native
trait SchemaToolExecutionStep extends js.Object {
  /**
    * A Tool execution.  - In response: present if set by create/update request
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}

object SchemaToolExecutionStep {
  @scala.inline
  def apply(toolExecution: SchemaToolExecution = null): SchemaToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (toolExecution != null) __obj.updateDynamic("toolExecution")(toolExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToolExecutionStep]
  }
}

