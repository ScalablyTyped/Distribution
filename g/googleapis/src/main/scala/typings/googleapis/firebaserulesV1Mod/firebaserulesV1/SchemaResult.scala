package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible result values from the function mock invocation.
  */
@js.native
trait SchemaResult extends js.Object {
  /**
    * The result is undefined, meaning the result could not be computed.
    */
  var undefined: js.UndefOr[SchemaEmpty] = js.native
  /**
    * The result is an actual value. The type of the value must match that of
    * the type declared by the service.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object SchemaResult {
  @scala.inline
  def apply(undefined: SchemaEmpty = null, value: js.Any = null): SchemaResult = {
    val __obj = js.Dynamic.literal()
    if (undefined != null) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResult]
  }
}

