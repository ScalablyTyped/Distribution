package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testTree extends StObject {
  
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
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testTreeMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
