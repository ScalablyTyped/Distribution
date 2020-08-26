package typings.graphqlToolsWrap.filterRootFieldsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRootFields
  extends Transform[Record[String, js.Any]] {
  val transformer: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MFilterRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object FilterRootFields {
  @scala.inline
  def apply(transformSchema: GraphQLSchema => GraphQLSchema, transformer: js.Any): FilterRootFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRootFields]
  }
  @scala.inline
  implicit class FilterRootFieldsOps[Self <: FilterRootFields] (val x: Self) extends AnyVal {
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

