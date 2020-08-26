package typings.graphqlApiKoa.mod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteOptions extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.native
  var fieldResolver: js.UndefOr[js.Any] = js.native
  var rootValue: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
}

object ExecuteOptions {
  @scala.inline
  def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  @scala.inline
  implicit class ExecuteOptionsOps[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
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
    def setContextValue(value: js.Any): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    @scala.inline
    def setFieldResolver(value: js.Any): Self = this.set("fieldResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

