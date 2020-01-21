package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Tree extends js.Object {
  /**
    * All the child directories: the directories referred to by the root and,
    * recursively, all its children. In order to reconstruct the directory
    * tree, the client must take the digests of each of the child directories
    * and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.native
  /**
    * The root directory in the tree.
    */
  var root: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Directory] = js.native
}

object SchemaBuildBazelRemoteExecutionV2Tree {
  @scala.inline
  def apply(
    children: js.Array[SchemaBuildBazelRemoteExecutionV2Directory] = null,
    root: SchemaBuildBazelRemoteExecutionV2Directory = null
  ): SchemaBuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Tree]
  }
}

