package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A key-value pair passed as an environment variable to the test.
  */
@js.native
trait SchemaEnvironmentVariable extends js.Object {
  /**
    * Key for the environment variable.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for the environment variable.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaEnvironmentVariable {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironmentVariable]
  }
}

