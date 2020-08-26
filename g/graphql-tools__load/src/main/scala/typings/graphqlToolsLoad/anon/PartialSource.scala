package typings.graphqlToolsLoad.anon

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@graphql-tools/utils.@graphql-tools/utils.Source> */
@js.native
trait PartialSource extends js.Object {
  var document: js.UndefOr[DocumentNode] = js.native
  var location: js.UndefOr[String] = js.native
  var rawSDL: js.UndefOr[String] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
}

object PartialSource {
  @scala.inline
  def apply(): PartialSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSource]
  }
  @scala.inline
  implicit class PartialSourceOps[Self <: PartialSource] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRawSDL(value: String): Self = this.set("rawSDL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawSDL: Self = this.set("rawSDL", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

