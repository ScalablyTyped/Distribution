package typings.graphql.mod

import typings.graphql.anon.CommentDescriptions
import typings.graphql.anon.Description
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getDescription")
@js.native
object getDescription extends js.Object {
  def apply(node: Description): js.UndefOr[String] = js.native
  def apply(node: Description, options: Maybe[CommentDescriptions]): js.UndefOr[String] = js.native
}

