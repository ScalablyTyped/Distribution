package typings.graphqlToolsWrap.renameTypesMod

import typings.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/RenameTypes", JSImport.Default)
@js.native
class default protected () extends RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}

