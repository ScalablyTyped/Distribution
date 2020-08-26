package typings.graphqlToolsDelegate.typesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Operation
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateProxyingResolverOptions extends js.Object {
  var fieldName: js.UndefOr[String] = js.native
  var operation: js.UndefOr[Operation] = js.native
  var schema: GraphQLSchema | SubschemaConfig = js.native
  var transformedSchema: js.UndefOr[GraphQLSchema] = js.native
  var transforms: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}

object ICreateProxyingResolverOptions {
  @scala.inline
  def apply(schema: GraphQLSchema | SubschemaConfig): ICreateProxyingResolverOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateProxyingResolverOptions]
  }
  @scala.inline
  implicit class ICreateProxyingResolverOptionsOps[Self <: ICreateProxyingResolverOptions] (val x: Self) extends AnyVal {
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
    def setSchema(value: GraphQLSchema | SubschemaConfig): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setTransformedSchema(value: GraphQLSchema): Self = this.set("transformedSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedSchema: Self = this.set("transformedSchema", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[Record[String, _]]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

