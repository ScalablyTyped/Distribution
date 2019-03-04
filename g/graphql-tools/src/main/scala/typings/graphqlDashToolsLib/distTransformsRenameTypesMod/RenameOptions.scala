package typings
package graphqlDashToolsLib.distTransformsRenameTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends js.Object {
  var renameBuiltins: scala.Boolean
  var renameScalars: scala.Boolean
}

object RenameOptions {
  @scala.inline
  def apply(renameBuiltins: scala.Boolean, renameScalars: scala.Boolean): RenameOptions = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins, renameScalars = renameScalars)
  
    __obj.asInstanceOf[RenameOptions]
  }
}

