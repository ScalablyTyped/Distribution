package typings.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserPlatformDetails extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var command: js.UndefOr[String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var defaultLocation: js.UndefOr[String] = js.native
  var getCommand: js.UndefOr[
    js.Function3[/* browser */ this.type, /* url */ String, /* args */ js.Array[String], String]
  ] = js.native
  var imageName: js.UndefOr[String] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var opensTab: js.UndefOr[Boolean] = js.native
  var pathQuery: js.UndefOr[String] = js.native
  var plistPath: js.UndefOr[String] = js.native
  var process: js.UndefOr[String] = js.native
  var versionKey: js.UndefOr[String] = js.native
}

object BrowserPlatformDetails {
  @scala.inline
  def apply(): BrowserPlatformDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserPlatformDetails]
  }
  @scala.inline
  implicit class BrowserPlatformDetailsOps[Self <: BrowserPlatformDetails] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDefaultLocation(value: String): Self = this.set("defaultLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLocation: Self = this.set("defaultLocation", js.undefined)
    @scala.inline
    def setGetCommand(value: (BrowserPlatformDetails, /* url */ String, /* args */ js.Array[String]) => String): Self = this.set("getCommand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetCommand: Self = this.set("getCommand", js.undefined)
    @scala.inline
    def setImageName(value: String): Self = this.set("imageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageName: Self = this.set("imageName", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setOpensTab(value: Boolean): Self = this.set("opensTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpensTab: Self = this.set("opensTab", js.undefined)
    @scala.inline
    def setPathQuery(value: String): Self = this.set("pathQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathQuery: Self = this.set("pathQuery", js.undefined)
    @scala.inline
    def setPlistPath(value: String): Self = this.set("plistPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlistPath: Self = this.set("plistPath", js.undefined)
    @scala.inline
    def setProcess(value: String): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setVersionKey(value: String): Self = this.set("versionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionKey: Self = this.set("versionKey", js.undefined)
  }
  
}

