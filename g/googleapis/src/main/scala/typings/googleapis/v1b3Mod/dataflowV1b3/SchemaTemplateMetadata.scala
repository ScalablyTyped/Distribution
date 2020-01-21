package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing a template.
  */
@js.native
trait SchemaTemplateMetadata extends js.Object {
  /**
    * Optional. A description of the template.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The name of the template.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The parameters for the template.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameterMetadata]] = js.native
}

object SchemaTemplateMetadata {
  @scala.inline
  def apply(
    description: String = null,
    name: String = null,
    parameters: js.Array[SchemaParameterMetadata] = null
  ): SchemaTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTemplateMetadata]
  }
}

