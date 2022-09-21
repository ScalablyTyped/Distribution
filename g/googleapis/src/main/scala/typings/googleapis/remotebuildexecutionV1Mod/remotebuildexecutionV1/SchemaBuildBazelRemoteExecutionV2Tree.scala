package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2Tree extends StObject {
  
  /**
    * All the child directories: the directories referred to by the root and, recursively, all its children. In order to reconstruct the directory tree, the client must take the digests of each of the child directories and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.undefined
  
  /**
    * The root directory in the tree.
    */
  var root: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Directory] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2Tree {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Tree]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2Tree](x: Self) {
    
    inline def setChildren(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SchemaBuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setRoot(value: SchemaBuildBazelRemoteExecutionV2Directory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
