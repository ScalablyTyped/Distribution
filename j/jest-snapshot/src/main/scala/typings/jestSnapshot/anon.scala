package typings.jestSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilesRemoved extends StObject {
    
    var filesRemoved: Double
    
    var filesRemovedList: js.Array[String]
  }
  object FilesRemoved {
    
    inline def apply(filesRemoved: Double, filesRemovedList: js.Array[String]): FilesRemoved = {
      val __obj = js.Dynamic.literal(filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilesRemoved]
    }
    
    extension [Self <: FilesRemoved](x: Self) {
      
      inline def setFilesRemoved(value: Double): Self = StObject.set(x, "filesRemoved", value.asInstanceOf[js.Any])
      
      inline def setFilesRemovedList(value: js.Array[String]): Self = StObject.set(x, "filesRemovedList", value.asInstanceOf[js.Any])
      
      inline def setFilesRemovedListVarargs(value: String*): Self = StObject.set(x, "filesRemovedList", js.Array(value*))
    }
  }
}
