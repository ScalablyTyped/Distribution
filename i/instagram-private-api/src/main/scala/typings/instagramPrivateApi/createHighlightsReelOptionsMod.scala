package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHighlightsReelOptionsMod {
  
  @js.native
  trait CreateHighlightsReelOptions extends StObject {
    
    var coverId: js.UndefOr[String] = js.native
    
    var mediaIds: js.Array[String] = js.native
    
    var source: js.UndefOr[IgAppModule] = js.native
    
    var title: String = js.native
  }
  object CreateHighlightsReelOptions {
    
    @scala.inline
    def apply(mediaIds: js.Array[String], title: String): CreateHighlightsReelOptions = {
      val __obj = js.Dynamic.literal(mediaIds = mediaIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHighlightsReelOptions]
    }
    
    @scala.inline
    implicit class CreateHighlightsReelOptionsMutableBuilder[Self <: CreateHighlightsReelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverId(value: String): Self = StObject.set(x, "coverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverIdUndefined: Self = StObject.set(x, "coverId", js.undefined)
      
      @scala.inline
      def setMediaIds(value: js.Array[String]): Self = StObject.set(x, "mediaIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaIdsVarargs(value: String*): Self = StObject.set(x, "mediaIds", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: IgAppModule): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
