package typings.hexoUtil.mod

import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hexoSpawnDisableEncodingAndOverrideStdioOptions extends hexoSpawnDisableEncodingOptions {
  @JSName("stdio")
  var stdio_hexoSpawnDisableEncodingAndOverrideStdioOptions: StdioOptions = js.native
}

object hexoSpawnDisableEncodingAndOverrideStdioOptions {
  @scala.inline
  def apply(stdio: StdioOptions): hexoSpawnDisableEncodingAndOverrideStdioOptions = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[hexoSpawnDisableEncodingAndOverrideStdioOptions]
  }
  @scala.inline
  implicit class hexoSpawnDisableEncodingAndOverrideStdioOptionsOps[Self <: hexoSpawnDisableEncodingAndOverrideStdioOptions] (val x: Self) extends AnyVal {
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
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: StdioOptions): Self = this.set("stdio", value.asInstanceOf[js.Any])
  }
  
}

