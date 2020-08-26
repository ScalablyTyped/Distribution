package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing the current state of the specified test matrix.
  */
@js.native
trait SchemaCancelTestMatrixResponse extends js.Object {
  /**
    * The current rolled-up state of the test matrix. If this state is already
    * final, then the cancelation request will have no effect.
    */
  var testState: js.UndefOr[String] = js.native
}

object SchemaCancelTestMatrixResponse {
  @scala.inline
  def apply(): SchemaCancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelTestMatrixResponse]
  }
  @scala.inline
  implicit class SchemaCancelTestMatrixResponseOps[Self <: SchemaCancelTestMatrixResponse] (val x: Self) extends AnyVal {
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
    def setTestState(value: String): Self = this.set("testState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestState: Self = this.set("testState", js.undefined)
  }
  
}

