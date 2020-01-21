package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `BasicLevel` is an `AccessLevel` using a set of recommended features.
  */
@js.native
trait SchemaBasicLevel extends js.Object {
  /**
    * How the `conditions` list should be combined to determine if a request is
    * granted this `AccessLevel`. If AND is used, each `Condition` in
    * `conditions` must be satisfied for the `AccessLevel` to be applied. If OR
    * is used, at least one `Condition` in `conditions` must be satisfied for
    * the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String] = js.native
  /**
    * Required. A list of requirements for the `AccessLevel` to be granted.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.native
}

object SchemaBasicLevel {
  @scala.inline
  def apply(combiningFunction: String = null, conditions: js.Array[SchemaCondition] = null): SchemaBasicLevel = {
    val __obj = js.Dynamic.literal()
    if (combiningFunction != null) __obj.updateDynamic("combiningFunction")(combiningFunction.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicLevel]
  }
}

