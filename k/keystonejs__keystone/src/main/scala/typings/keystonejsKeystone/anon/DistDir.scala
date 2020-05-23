package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistDir extends js.Object {
  var distDir: String
  var keystone: Keystone[String]
}

object DistDir {
  @scala.inline
  def apply(distDir: String, keystone: Keystone[String]): DistDir = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], keystone = keystone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDir]
  }
}

