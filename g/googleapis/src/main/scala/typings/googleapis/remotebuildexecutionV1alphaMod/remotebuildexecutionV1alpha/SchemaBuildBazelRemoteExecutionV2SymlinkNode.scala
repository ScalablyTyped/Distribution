package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `SymlinkNode` represents a symbolic link.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2SymlinkNode extends js.Object {
  /**
    * The name of the symlink.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The target path of the symlink. The path separator is a forward slash
    * `/`. The target path can be relative to the parent directory of the
    * symlink or it can be an absolute path starting with `/`. Support for
    * absolute paths can be checked using the Capabilities API. The canonical
    * form forbids the substrings `/./` and `//` in the target path. `..`
    * components are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2SymlinkNode {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2SymlinkNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2SymlinkNode]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2SymlinkNodeOps[Self <: SchemaBuildBazelRemoteExecutionV2SymlinkNode] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

