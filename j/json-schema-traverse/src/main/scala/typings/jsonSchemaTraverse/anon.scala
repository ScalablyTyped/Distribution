package typings.jsonSchemaTraverse

import typings.jsonSchemaTraverse.mod.TraverseCallbackDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Post extends StObject {
    
    var post: js.UndefOr[TraverseCallbackDef] = js.native
    
    var pre: js.UndefOr[TraverseCallbackDef] = js.native
  }
  object Post {
    
    @scala.inline
    def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    @scala.inline
    implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPost(
        value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
      ): Self = StObject.set(x, "post", js.Any.fromFunction7(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPre(
        value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
      ): Self = StObject.set(x, "pre", js.Any.fromFunction7(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
}
