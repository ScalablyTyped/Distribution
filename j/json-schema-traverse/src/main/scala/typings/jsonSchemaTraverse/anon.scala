package typings.jsonSchemaTraverse

import typings.jsonSchemaTraverse.mod.Callback
import typings.jsonSchemaTraverse.mod.SchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Post extends StObject {
    
    var post: js.UndefOr[Callback] = js.undefined
    
    var pre: js.UndefOr[Callback] = js.undefined
  }
  object Post {
    
    inline def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    extension [Self <: Post](x: Self) {
      
      inline def setPost(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => Unit
      ): Self = StObject.set(x, "post", js.Any.fromFunction7(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => Unit
      ): Self = StObject.set(x, "pre", js.Any.fromFunction7(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
}
