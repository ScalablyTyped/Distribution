package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Testing timing break down to know phases.
  */
@js.native
trait SchemaTestTiming extends js.Object {
  /**
    * How long it took to run the test process.  - In response: present if
    * previously set. - In create/update request: optional
    */
  var testProcessDuration: js.UndefOr[SchemaDuration] = js.native
}

object SchemaTestTiming {
  @scala.inline
  def apply(testProcessDuration: SchemaDuration = null): SchemaTestTiming = {
    val __obj = js.Dynamic.literal()
    if (testProcessDuration != null) __obj.updateDynamic("testProcessDuration")(testProcessDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestTiming]
  }
}

