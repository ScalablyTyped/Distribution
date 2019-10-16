package typings.ignoreDashWalk

import typings.ignoreDashWalk.ignoreDashWalkMod.Walker
import typings.ignoreDashWalk.ignoreDashWalkMod.WalkerSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Follow extends js.Object {
  var follow: Boolean
  var ignoreFiles: js.Array[String]
  var includeEmpty: Boolean
  var parent: Walker | WalkerSync
  var path: String
}

object Anon_Follow {
  @scala.inline
  def apply(
    follow: Boolean,
    ignoreFiles: js.Array[String],
    includeEmpty: Boolean,
    parent: Walker | WalkerSync,
    path: String
  ): Anon_Follow = {
    val __obj = js.Dynamic.literal(follow = follow, ignoreFiles = ignoreFiles, includeEmpty = includeEmpty, parent = parent.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Anon_Follow]
  }
}

