package typings.graphql

import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/syntaxError", JSImport.Namespace)
@js.native
object syntaxErrorMod extends js.Object {
  def syntaxError(source: Source, position: Double, description: String): GraphQLError = js.native
}

