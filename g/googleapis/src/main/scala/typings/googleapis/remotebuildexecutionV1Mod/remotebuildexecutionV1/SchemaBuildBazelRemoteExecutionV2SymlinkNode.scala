package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `SymlinkNode` represents a symbolic link.
  */
trait SchemaBuildBazelRemoteExecutionV2SymlinkNode extends StObject {
  
  /**
    * The name of the symlink.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
object SchemaBuildBazelRemoteExecutionV2SymlinkNode {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2SymlinkNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2SymlinkNode]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2SymlinkNodeMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2SymlinkNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
