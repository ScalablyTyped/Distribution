package typings.graphqlToolsUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameTypesOptions extends js.Object {
  var renameBuiltins: Boolean
  var renameScalars: Boolean
}

object RenameTypesOptions {
  @scala.inline
  def apply(renameBuiltins: Boolean, renameScalars: Boolean): RenameTypesOptions = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameTypesOptions]
  }
}

