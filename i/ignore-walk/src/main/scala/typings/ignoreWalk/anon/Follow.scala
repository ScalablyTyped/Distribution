package typings.ignoreWalk.anon

import typings.ignoreWalk.mod.Walker
import typings.ignoreWalk.mod.WalkerSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Follow extends js.Object {
  var follow: Boolean
  var ignoreFiles: js.Array[String]
  var includeEmpty: Boolean
  var parent: Walker | WalkerSync
  var path: String
}

object Follow {
  @scala.inline
  def apply(
    follow: Boolean,
    ignoreFiles: js.Array[String],
    includeEmpty: Boolean,
    parent: Walker | WalkerSync,
    path: String
  ): Follow = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follow]
  }
}

