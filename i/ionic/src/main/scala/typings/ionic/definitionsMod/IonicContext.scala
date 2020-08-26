package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicContext extends js.Object {
  val binPath: String = js.native
  val execPath: String = js.native
  val libPath: String = js.native
  val version: String = js.native
}

object IonicContext {
  @scala.inline
  def apply(binPath: String, execPath: String, libPath: String, version: String): IonicContext = {
    val __obj = js.Dynamic.literal(binPath = binPath.asInstanceOf[js.Any], execPath = execPath.asInstanceOf[js.Any], libPath = libPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicContext]
  }
  @scala.inline
  implicit class IonicContextOps[Self <: IonicContext] (val x: Self) extends AnyVal {
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
    def setBinPath(value: String): Self = this.set("binPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibPath(value: String): Self = this.set("libPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

