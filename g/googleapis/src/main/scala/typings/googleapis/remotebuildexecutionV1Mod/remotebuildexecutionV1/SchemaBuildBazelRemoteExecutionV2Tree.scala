package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Tree extends StObject {
  
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
  def apply(): SchemaBuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Tree]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2TreeMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2Tree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: SchemaBuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: SchemaBuildBazelRemoteExecutionV2Directory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
