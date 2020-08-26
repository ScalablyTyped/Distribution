package typings.graphqlTools.mod

import typings.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typings.graphqlToolsWrap.mod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}

