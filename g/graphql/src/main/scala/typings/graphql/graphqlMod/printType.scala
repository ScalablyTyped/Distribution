package typings.graphql.graphqlMod

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.utilitiesSchemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printType")
@js.native
object printType extends js.Object {
  def apply(`type`: GraphQLNamedType): String = js.native
  def apply(`type`: GraphQLNamedType, options: Options): String = js.native
}

