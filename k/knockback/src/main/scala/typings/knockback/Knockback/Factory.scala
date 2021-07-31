package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def addPathMapping(path: String, create_info: js.Any): js.Any
  
  def addPathMappings(factories: js.Any, owner_path: String): js.Any
  
  def creatorForPath(obj: js.Any, path: String): js.Any
  
  def hasPath(path: String): Boolean
  
  def hasPathMappings(factories: js.Any, owner_path: String): Boolean
}
object Factory {
  
  @scala.inline
  def apply(
    addPathMapping: (String, js.Any) => js.Any,
    addPathMappings: (js.Any, String) => js.Any,
    creatorForPath: (js.Any, String) => js.Any,
    hasPath: String => Boolean,
    hasPathMappings: (js.Any, String) => Boolean
  ): Factory = {
    val __obj = js.Dynamic.literal(addPathMapping = js.Any.fromFunction2(addPathMapping), addPathMappings = js.Any.fromFunction2(addPathMappings), creatorForPath = js.Any.fromFunction2(creatorForPath), hasPath = js.Any.fromFunction1(hasPath), hasPathMappings = js.Any.fromFunction2(hasPathMappings))
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit class FactoryMutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPathMapping(value: (String, js.Any) => js.Any): Self = StObject.set(x, "addPathMapping", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPathMappings(value: (js.Any, String) => js.Any): Self = StObject.set(x, "addPathMappings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreatorForPath(value: (js.Any, String) => js.Any): Self = StObject.set(x, "creatorForPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasPath(value: String => Boolean): Self = StObject.set(x, "hasPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPathMappings(value: (js.Any, String) => Boolean): Self = StObject.set(x, "hasPathMappings", js.Any.fromFunction2(value))
  }
}
