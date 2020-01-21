package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait SchemaListVariablesResponse extends js.Object {
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[SchemaVariable]] = js.native
}

object SchemaListVariablesResponse {
  @scala.inline
  def apply(variables: js.Array[SchemaVariable] = null): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
}

