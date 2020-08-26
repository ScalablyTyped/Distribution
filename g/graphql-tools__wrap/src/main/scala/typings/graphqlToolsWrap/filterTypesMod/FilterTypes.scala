package typings.graphqlToolsWrap.filterTypesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterTypes
  extends Transform[Record[String, js.Any]] {
  val filter: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MFilterTypes(schema: GraphQLSchema): GraphQLSchema = js.native
}

object FilterTypes {
  @scala.inline
  def apply(filter: js.Any, transformSchema: GraphQLSchema => GraphQLSchema): FilterTypes = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[FilterTypes]
  }
  @scala.inline
  implicit class FilterTypesOps[Self <: FilterTypes] (val x: Self) extends AnyVal {
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
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
  }
  
}

