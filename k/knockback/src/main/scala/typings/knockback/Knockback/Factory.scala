package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def addPathMapping(path: String, create_info: Any): Any
  
  def addPathMappings(factories: Any, owner_path: String): Any
  
  def creatorForPath(obj: Any, path: String): Any
  
  def hasPath(path: String): Boolean
  
  def hasPathMappings(factories: Any, owner_path: String): Boolean
}
object Factory {
  
  inline def apply(
    addPathMapping: (String, Any) => Any,
    addPathMappings: (Any, String) => Any,
    creatorForPath: (Any, String) => Any,
    hasPath: String => Boolean,
    hasPathMappings: (Any, String) => Boolean
  ): Factory = {
    val __obj = js.Dynamic.literal(addPathMapping = js.Any.fromFunction2(addPathMapping), addPathMappings = js.Any.fromFunction2(addPathMappings), creatorForPath = js.Any.fromFunction2(creatorForPath), hasPath = js.Any.fromFunction1(hasPath), hasPathMappings = js.Any.fromFunction2(hasPathMappings))
    __obj.asInstanceOf[Factory]
  }
  
  extension [Self <: Factory](x: Self) {
    
    inline def setAddPathMapping(value: (String, Any) => Any): Self = StObject.set(x, "addPathMapping", js.Any.fromFunction2(value))
    
    inline def setAddPathMappings(value: (Any, String) => Any): Self = StObject.set(x, "addPathMappings", js.Any.fromFunction2(value))
    
    inline def setCreatorForPath(value: (Any, String) => Any): Self = StObject.set(x, "creatorForPath", js.Any.fromFunction2(value))
    
    inline def setHasPath(value: String => Boolean): Self = StObject.set(x, "hasPath", js.Any.fromFunction1(value))
    
    inline def setHasPathMappings(value: (Any, String) => Boolean): Self = StObject.set(x, "hasPathMappings", js.Any.fromFunction2(value))
  }
}
