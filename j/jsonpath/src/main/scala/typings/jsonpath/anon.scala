package typings.jsonpath

import typings.jsonpath.mod.PathComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path extends StObject {
    
    var path: js.Array[PathComponent]
    
    var value: js.Any
  }
  object Path {
    
    @scala.inline
    def apply(path: js.Array[PathComponent], value: js.Any): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[PathComponent]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: PathComponent*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
