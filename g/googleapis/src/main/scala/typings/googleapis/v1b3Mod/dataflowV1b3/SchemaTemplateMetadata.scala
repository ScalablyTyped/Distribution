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
  def apply(): SchemaTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateMetadata]
  }
  @scala.inline
  implicit class SchemaTemplateMetadataOps[Self <: SchemaTemplateMetadata] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParametersVarargs(value: SchemaParameterMetadata*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[SchemaParameterMetadata]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

