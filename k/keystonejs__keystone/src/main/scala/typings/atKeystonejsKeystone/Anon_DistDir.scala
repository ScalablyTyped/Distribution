package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistDir extends js.Object {
  var distDir: String
  var keystone: Keystone[String]
}

object Anon_DistDir {
  @scala.inline
  def apply(distDir: String, keystone: Keystone[String]): Anon_DistDir = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], keystone = keystone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DistDir]
  }
}

