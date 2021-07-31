package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editHighlightsReelOptionsMod {
  
  trait EditHighlightsReelOptions extends StObject {
    
    var added: js.UndefOr[js.Array[String]] = js.undefined
    
    var coverId: String
    
    var highlightId: String
    
    var removed: js.UndefOr[js.Array[String]] = js.undefined
    
    var source: js.UndefOr[IgAppModule] = js.undefined
    
    var title: String
  }
  object EditHighlightsReelOptions {
    
    @scala.inline
    def apply(coverId: String, highlightId: String, title: String): EditHighlightsReelOptions = {
      val __obj = js.Dynamic.literal(coverId = coverId.asInstanceOf[js.Any], highlightId = highlightId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditHighlightsReelOptions]
    }
    
    @scala.inline
    implicit class EditHighlightsReelOptionsMutableBuilder[Self <: EditHighlightsReelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setAddedVarargs(value: String*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setCoverId(value: String): Self = StObject.set(x, "coverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightId(value: String): Self = StObject.set(x, "highlightId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      @scala.inline
      def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: IgAppModule): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
