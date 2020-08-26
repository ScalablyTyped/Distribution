package typings.graphqlToolsWrap.renameInterfaceFieldsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameInterfaceFields
  extends Transform[Record[String, js.Any]] {
  val transformer: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MRenameInterfaceFields(originalRequest: Request): Request = js.native
  @JSName("transformSchema")
  def transformSchema_MRenameInterfaceFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object RenameInterfaceFields {
  @scala.inline
  def apply(
    transformRequest: Request => Request,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformer: js.Any
  ): RenameInterfaceFields = {
    val __obj = js.Dynamic.literal(transformRequest = js.Any.fromFunction1(transformRequest), transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInterfaceFields]
  }
  @scala.inline
  implicit class RenameInterfaceFieldsOps[Self <: RenameInterfaceFields] (val x: Self) extends AnyVal {
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
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformer(value: js.Any): Self = this.set("transformer", value.asInstanceOf[js.Any])
  }
  
}

