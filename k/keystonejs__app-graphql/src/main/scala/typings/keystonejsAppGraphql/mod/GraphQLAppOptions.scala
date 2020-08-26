package typings.keystonejsAppGraphql.mod

import typings.keystonejsAppGraphql.anon.Introspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLAppOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.native
  var apollo: js.UndefOr[Introspection] = js.native
  var graphiqlPath: js.UndefOr[String] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object GraphQLAppOptions {
  @scala.inline
  def apply(): GraphQLAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLAppOptions]
  }
  @scala.inline
  implicit class GraphQLAppOptionsOps[Self <: GraphQLAppOptions] (val x: Self) extends AnyVal {
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
    def setApiPath(value: String): Self = this.set("apiPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiPath: Self = this.set("apiPath", js.undefined)
    @scala.inline
    def setApollo(value: Introspection): Self = this.set("apollo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApollo: Self = this.set("apollo", js.undefined)
    @scala.inline
    def setGraphiqlPath(value: String): Self = this.set("graphiqlPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphiqlPath: Self = this.set("graphiqlPath", js.undefined)
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
  }
  
}

