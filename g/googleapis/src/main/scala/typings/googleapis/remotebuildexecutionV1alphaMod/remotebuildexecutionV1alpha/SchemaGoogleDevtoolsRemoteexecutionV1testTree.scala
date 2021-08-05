package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testTree extends StObject {
  
  /**
    * All the child directories: the directories referred to by the root and,
    * recursively, all its children. In order to reconstruct the directory
    * tree, the client must take the digests of each of the child directories
    * and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]] = js.undefined
  
  /**
    * The root directory in the tree.
    */
  var root: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testTree {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testTree]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteexecutionV1testTree](x: Self) {
    
    inline def setChildren(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setRoot(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
