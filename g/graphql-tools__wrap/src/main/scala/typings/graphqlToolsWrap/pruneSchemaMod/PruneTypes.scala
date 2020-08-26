package typings.graphqlToolsWrap.pruneSchemaMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PruneTypes
  extends Transform[Record[String, js.Any]] {
  val options: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MPruneTypes(schema: GraphQLSchema): GraphQLSchema = js.native
}

object PruneTypes {
  @scala.inline
  def apply(options: js.Any, transformSchema: GraphQLSchema => GraphQLSchema): PruneTypes = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[PruneTypes]
  }
  @scala.inline
  implicit class PruneTypesOps[Self <: PruneTypes] (val x: Self) extends AnyVal {
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
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
  }
  
}

