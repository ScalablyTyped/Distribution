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
  def apply(testState: String = null): SchemaCancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    if (testState != null) __obj.updateDynamic("testState")(testState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCancelTestMatrixResponse]
  }
}

