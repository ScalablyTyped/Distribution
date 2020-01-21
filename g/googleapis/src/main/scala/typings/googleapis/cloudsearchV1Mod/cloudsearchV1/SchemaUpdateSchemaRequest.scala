package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUpdateSchemaRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * The new schema for the source.
    */
  var schema: js.UndefOr[SchemaSchema] = js.native
  /**
    * If true, the request will be validated without side effects.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object SchemaUpdateSchemaRequest {
  @scala.inline
  def apply(
    debugOptions: SchemaDebugOptions = null,
    schema: SchemaSchema = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
  ): SchemaUpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateSchemaRequest]
  }
}

