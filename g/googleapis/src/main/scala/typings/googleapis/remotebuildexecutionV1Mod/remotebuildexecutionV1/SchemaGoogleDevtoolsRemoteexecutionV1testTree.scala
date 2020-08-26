package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testTree extends js.Object {
  /**
    * All the child directories: the directories referred to by the root and,
    * recursively, all its children. In order to reconstruct the directory
    * tree, the client must take the digests of each of the child directories
    * and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]] = js.native
  /**
    * The root directory in the tree.
    */
  var root: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testTree {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testTree]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testTreeOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testTree] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setRoot(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

