package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHighlightsReelOptionsMod {
  
  trait CreateHighlightsReelOptions extends StObject {
    
    var coverId: js.UndefOr[String] = js.undefined
    
    var mediaIds: js.Array[String]
    
    var source: js.UndefOr[IgAppModule] = js.undefined
    
    var title: String
  }
  object CreateHighlightsReelOptions {
    
    inline def apply(mediaIds: js.Array[String], title: String): CreateHighlightsReelOptions = {
      val __obj = js.Dynamic.literal(mediaIds = mediaIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHighlightsReelOptions]
    }
    
    extension [Self <: CreateHighlightsReelOptions](x: Self) {
      
      inline def setCoverId(value: String): Self = StObject.set(x, "coverId", value.asInstanceOf[js.Any])
      
      inline def setCoverIdUndefined: Self = StObject.set(x, "coverId", js.undefined)
      
      inline def setMediaIds(value: js.Array[String]): Self = StObject.set(x, "mediaIds", value.asInstanceOf[js.Any])
      
      inline def setMediaIdsVarargs(value: String*): Self = StObject.set(x, "mediaIds", js.Array(value :_*))
      
      inline def setSource(value: IgAppModule): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
