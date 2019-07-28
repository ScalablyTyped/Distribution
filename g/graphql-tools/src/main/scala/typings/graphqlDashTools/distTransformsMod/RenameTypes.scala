package typings.graphqlDashTools.distTransformsMod

import typings.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import typings.graphqlDashTools.distTransformsRenameTypesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", "RenameTypes")
@js.native
class RenameTypes protected () extends default {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
}

