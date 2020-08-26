package typings.googleapis.v2betaMod.deploymentmanagerV2beta

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
  def apply(): SchemaTypeInfoSchemaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfoSchemaInfo]
  }
  @scala.inline
  implicit class SchemaTypeInfoSchemaInfoOps[Self <: SchemaTypeInfoSchemaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

