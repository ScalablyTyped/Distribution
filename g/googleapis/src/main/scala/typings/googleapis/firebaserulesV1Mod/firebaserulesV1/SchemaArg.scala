package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arg matchers for the mock function.
  */
@js.native
trait SchemaArg extends js.Object {
  /**
    * Argument matches any value provided.
    */
  var anyValue: js.UndefOr[SchemaEmpty] = js.native
  /**
    * Argument exactly matches value provided.
    */
  var exactValue: js.UndefOr[js.Any] = js.native
}

object SchemaArg {
  @scala.inline
  def apply(anyValue: SchemaEmpty = null, exactValue: js.Any = null): SchemaArg = {
    val __obj = js.Dynamic.literal()
    if (anyValue != null) __obj.updateDynamic("anyValue")(anyValue.asInstanceOf[js.Any])
    if (exactValue != null) __obj.updateDynamic("exactValue")(exactValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaArg]
  }
}

