package typings.matterJs.anon

import typings.matterJs.mod._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends _Dependency {
  var name: String
  var version: String
}

object Version {
  @scala.inline
  def apply(name: String, version: String): Version = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

