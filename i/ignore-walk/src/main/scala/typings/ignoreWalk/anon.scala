package typings.ignoreWalk

import typings.ignoreWalk.mod.Walker
import typings.ignoreWalk.mod.WalkerSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Follow extends StObject {
    
    var follow: Boolean
    
    var ignoreFiles: js.Array[String]
    
    var includeEmpty: Boolean
    
    var parent: Walker | WalkerSync
    
    var path: String
  }
  object Follow {
    
    inline def apply(
      follow: Boolean,
      ignoreFiles: js.Array[String],
      includeEmpty: Boolean,
      parent: Walker | WalkerSync,
      path: String
    ): Follow = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Follow]
    }
    
    extension [Self <: Follow](x: Self) {
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      inline def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Walker | WalkerSync): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
