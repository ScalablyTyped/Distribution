package typings.graphqlCompose.mod.graphql

import typings.graphql.astMod.TypeNode
import typings.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.parseType")
@js.native
object parseType extends js.Object {
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: typings.graphql.sourceMod.Source): TypeNode = js.native
  def apply(source: typings.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
}

