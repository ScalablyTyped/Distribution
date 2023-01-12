package typings.lodashDecorators

import org.scalablytyped.runtime.Instantiable1
import typings.lodashDecorators.sharedMod.MemoizeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable[T, U]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, MemoizeMap[T, U]]
  
  trait Post extends StObject {
    
    var post: js.UndefOr[Boolean] = js.undefined
  }
  object Post {
    
    inline def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
      
      inline def setPost(value: Boolean): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    }
  }
}
