package typings.graphqlTools.mod

import typings.graphql.parserMod.ParseOptions
import typings.graphqlToolsUtils.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "parseGraphQLSDL")
@js.native
object parseGraphQLSDL extends js.Object {
  def apply(location: String, rawSDL: String, options: ParseOptions): Document = js.native
}

