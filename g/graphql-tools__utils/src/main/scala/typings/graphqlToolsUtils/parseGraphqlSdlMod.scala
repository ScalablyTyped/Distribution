package typings.graphqlToolsUtils

import typings.graphql.parserMod.ParseOptions
import typings.graphqlToolsUtils.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/parse-graphql-sdl", JSImport.Namespace)
@js.native
object parseGraphqlSdlMod extends js.Object {
  def parseGraphQLSDL(location: String, rawSDL: String, options: ParseOptions): Document = js.native
}

