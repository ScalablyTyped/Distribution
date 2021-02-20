package typings.htmlToDraftjs

import typings.draftJs.mod.ContentBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContentBlocks extends StObject {
    
    var contentBlocks: js.Array[ContentBlock] = js.native
    
    var entityMap: js.UndefOr[js.Any] = js.native
  }
  object ContentBlocks {
    
    @scala.inline
    def apply(contentBlocks: js.Array[ContentBlock]): ContentBlocks = {
      val __obj = js.Dynamic.literal(contentBlocks = contentBlocks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentBlocks]
    }
    
    @scala.inline
    implicit class ContentBlocksMutableBuilder[Self <: ContentBlocks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentBlocks(value: js.Array[ContentBlock]): Self = StObject.set(x, "contentBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBlocksVarargs(value: ContentBlock*): Self = StObject.set(x, "contentBlocks", js.Array(value :_*))
      
      @scala.inline
      def setEntityMap(value: js.Any): Self = StObject.set(x, "entityMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityMapUndefined: Self = StObject.set(x, "entityMap", js.undefined)
    }
  }
}
