package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `OutputSymlink` is similar to a Symlink, but it is used as an output in
  * an `ActionResult`.  `OutputSymlink` is binary-compatible with
  * `SymlinkNode`.
  */
trait SchemaBuildBazelRemoteExecutionV2OutputSymlink extends StObject {
  
  /**
    * The full path of the symlink relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The target path of the symlink. The path separator is a forward slash
    * `/`. The target path can be relative to the parent directory of the
    * symlink or it can be an absolute path starting with `/`. Support for
    * absolute paths can be checked using the Capabilities API. The canonical
    * form forbids the substrings `/./` and `//` in the target path. `..`
    * components are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2OutputSymlink {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputSymlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputSymlink]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputSymlinkMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2OutputSymlink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
