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
  def apply(): SchemaTestTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestTiming]
  }
  @scala.inline
  implicit class SchemaTestTimingOps[Self <: SchemaTestTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTestProcessDuration(value: SchemaDuration): Self = this.set("testProcessDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestProcessDuration: Self = this.set("testProcessDuration", js.undefined)
  }
  
}

