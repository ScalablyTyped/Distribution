package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenSchemaOptions extends js.Object {
  /**
    * the alternative schema type if the condition is false. Required if then is missing
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}

object WhenSchemaOptions {
  @scala.inline
  def apply(
    otherwise: js.UndefOr[Null | SchemaLike] = js.undefined,
    `then`: js.UndefOr[Null | SchemaLike] = js.undefined
  ): WhenSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(otherwise)) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    if (!js.isUndefined(`then`)) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhenSchemaOptions]
  }
}

