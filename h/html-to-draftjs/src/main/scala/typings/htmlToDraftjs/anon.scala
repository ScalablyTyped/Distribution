package typings.htmlToDraftjs

import typings.draftJs.mod.ContentBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentBlocks extends StObject {
    
    var contentBlocks: js.Array[ContentBlock]
    
    var entityMap: js.UndefOr[Any] = js.undefined
  }
  object ContentBlocks {
    
    inline def apply(contentBlocks: js.Array[ContentBlock]): ContentBlocks = {
      val __obj = js.Dynamic.literal(contentBlocks = contentBlocks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentBlocks]
    }
    
    extension [Self <: ContentBlocks](x: Self) {
      
      inline def setContentBlocks(value: js.Array[ContentBlock]): Self = StObject.set(x, "contentBlocks", value.asInstanceOf[js.Any])
      
      inline def setContentBlocksVarargs(value: ContentBlock*): Self = StObject.set(x, "contentBlocks", js.Array(value*))
      
      inline def setEntityMap(value: Any): Self = StObject.set(x, "entityMap", value.asInstanceOf[js.Any])
      
      inline def setEntityMapUndefined: Self = StObject.set(x, "entityMap", js.undefined)
    }
  }
}
