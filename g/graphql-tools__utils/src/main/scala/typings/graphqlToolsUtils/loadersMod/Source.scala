package typings.graphqlToolsUtils.loadersMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var document: js.UndefOr[DocumentNode] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var rawSDL: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    document: DocumentNode = null,
    location: String = null,
    rawSDL: String = null,
    schema: GraphQLSchema = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rawSDL != null) __obj.updateDynamic("rawSDL")(rawSDL.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

