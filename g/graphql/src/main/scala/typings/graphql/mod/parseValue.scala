package typings.graphql.mod

import typings.graphql.astMod.ValueNode
import typings.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseValue")
@js.native
object parseValue extends js.Object {
  def apply(source: String): ValueNode = js.native
  def apply(source: String, options: ParseOptions): ValueNode = js.native
  def apply(source: typings.graphql.sourceMod.Source): ValueNode = js.native
  def apply(source: typings.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
}

