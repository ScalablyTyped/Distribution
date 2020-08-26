package typings.graphqlBinding.anon

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSchemaPath extends js.Object {
  var inputSchemaPath: String = js.native
  var isDefaultExport: scala.Boolean = js.native
  var outputBindingPath: String = js.native
  var schema: GraphQLSchema = js.native
}

object InputSchemaPath {
  @scala.inline
  def apply(
    inputSchemaPath: String,
    isDefaultExport: scala.Boolean,
    outputBindingPath: String,
    schema: GraphQLSchema
  ): InputSchemaPath = {
    val __obj = js.Dynamic.literal(inputSchemaPath = inputSchemaPath.asInstanceOf[js.Any], isDefaultExport = isDefaultExport.asInstanceOf[js.Any], outputBindingPath = outputBindingPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSchemaPath]
  }
  @scala.inline
  implicit class InputSchemaPathOps[Self <: InputSchemaPath] (val x: Self) extends AnyVal {
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
    def setInputSchemaPath(value: String): Self = this.set("inputSchemaPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefaultExport(value: scala.Boolean): Self = this.set("isDefaultExport", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputBindingPath(value: String): Self = this.set("outputBindingPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

