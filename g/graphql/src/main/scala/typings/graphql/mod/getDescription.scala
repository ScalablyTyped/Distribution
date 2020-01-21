package typings.graphql.mod

import typings.graphql.AnonDescription
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getDescription")
@js.native
object getDescription extends js.Object {
  def apply(node: AnonDescription, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
}

