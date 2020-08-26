package typings.graphqlToolsMock.typesMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockOptions extends js.Object {
  /**
    * The mocks to add to the schema.
    */
  var mocks: js.UndefOr[IMocks] = js.native
  /**
    * Set to `true` to prevent existing resolvers from being overwritten to provide
    * mock data. This can be used to mock some parts of the server and not others.
    */
  var preserveResolvers: js.UndefOr[Boolean] = js.native
  /**
    * The schema to which to add mocks. This can also be a set of type definitions instead.
    */
  var schema: js.UndefOr[GraphQLSchema] = js.native
}

object IMockOptions {
  @scala.inline
  def apply(): IMockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMockOptions]
  }
  @scala.inline
  implicit class IMockOptionsOps[Self <: IMockOptions] (val x: Self) extends AnyVal {
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
    def setMocks(value: IMocks): Self = this.set("mocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocks: Self = this.set("mocks", js.undefined)
    @scala.inline
    def setPreserveResolvers(value: Boolean): Self = this.set("preserveResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveResolvers: Self = this.set("preserveResolvers", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

