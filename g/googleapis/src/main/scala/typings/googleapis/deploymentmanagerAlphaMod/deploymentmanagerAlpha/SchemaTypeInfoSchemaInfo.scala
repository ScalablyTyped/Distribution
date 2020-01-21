package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeInfoSchemaInfo extends js.Object {
  /**
    * The properties that this composite type or base type collection accept as
    * input, represented as a json blob, format is: JSON Schema Draft V4
    */
  var input: js.UndefOr[String] = js.native
  /**
    * The properties that this composite type or base type collection exposes
    * as output, these properties can be used for references, represented as
    * json blob, format is: JSON Schema Draft V4
    */
  var output: js.UndefOr[String] = js.native
}

object SchemaTypeInfoSchemaInfo {
  @scala.inline
  def apply(input: String = null, output: String = null): SchemaTypeInfoSchemaInfo = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeInfoSchemaInfo]
  }
}

