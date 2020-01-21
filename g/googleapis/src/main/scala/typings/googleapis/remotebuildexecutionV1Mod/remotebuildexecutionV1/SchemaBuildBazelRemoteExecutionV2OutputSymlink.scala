package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputSymlink` is similar to a Symlink, but it is used as an output in
  * an `ActionResult`.  `OutputSymlink` is binary-compatible with
  * `SymlinkNode`.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2OutputSymlink extends js.Object {
  /**
    * The full path of the symlink relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
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

object SchemaBuildBazelRemoteExecutionV2OutputSymlink {
  @scala.inline
  def apply(path: String = null, target: String = null): SchemaBuildBazelRemoteExecutionV2OutputSymlink = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputSymlink]
  }
}

