package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a ToolExecution output file.
  */
@js.native
trait SchemaToolOutputReference extends js.Object {
  /**
    * The creation time of the file.  - In response: present if set by
    * create/update request - In create/update request: optional
    */
  var creationTime: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * A FileReference to an output file.  - In response: always set - In
    * create/update request: always set
    */
  var output: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The test case to which this output file belongs.  - In response: present
    * if set by create/update request - In create/update request: optional
    */
  var testCase: js.UndefOr[SchemaTestCaseReference] = js.native
}

object SchemaToolOutputReference {
  @scala.inline
  def apply(
    creationTime: SchemaTimestamp = null,
    output: SchemaFileReference = null,
    testCase: SchemaTestCaseReference = null
  ): SchemaToolOutputReference = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (testCase != null) __obj.updateDynamic("testCase")(testCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToolOutputReference]
  }
}

