package typings.graphqlToolsWrap.filterObjectFieldsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterObjectFields
  extends Transform[Record[String, js.Any]] {
  val transformer: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MFilterObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object FilterObjectFields {
  @scala.inline
  def apply(transformSchema: GraphQLSchema => GraphQLSchema, transformer: js.Any): FilterObjectFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterObjectFields]
  }
  @scala.inline
  implicit class FilterObjectFieldsOps[Self <: FilterObjectFields] (val x: Self) extends AnyVal {
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
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformer(value: js.Any): Self = this.set("transformer", value.asInstanceOf[js.Any])
  }
  
}

