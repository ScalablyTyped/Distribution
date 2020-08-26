package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistDir extends js.Object {
  var distDir: String = js.native
  var keystone: Keystone[String] = js.native
}

object DistDir {
  @scala.inline
  def apply(distDir: String, keystone: Keystone[String]): DistDir = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], keystone = keystone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDir]
  }
  @scala.inline
  implicit class DistDirOps[Self <: DistDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistDir(value: String): Self = this.set("distDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeystone(value: Keystone[String]): Self = this.set("keystone", value.asInstanceOf[js.Any])
  }
  
}

