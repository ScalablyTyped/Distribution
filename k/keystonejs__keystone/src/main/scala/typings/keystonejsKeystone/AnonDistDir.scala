package typings.keystonejsKeystone

import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistDir extends js.Object {
  var distDir: String
  var keystone: Keystone[String]
}

object AnonDistDir {
  @scala.inline
  def apply(distDir: String, keystone: Keystone[String]): AnonDistDir = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], keystone = keystone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDistDir]
  }
}

