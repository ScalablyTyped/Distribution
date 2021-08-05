package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Player to be used for a video playback.
  */
trait SchemaVideoPlayer extends StObject {
  
  var embedHeight: js.UndefOr[String] = js.undefined
  
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the video.
    */
  var embedHtml: js.UndefOr[String] = js.undefined
  
  /**
    * The embed width
    */
  var embedWidth: js.UndefOr[String] = js.undefined
}
object SchemaVideoPlayer {
  
  inline def apply(): SchemaVideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoPlayer]
  }
  
  extension [Self <: SchemaVideoPlayer](x: Self) {
    
    inline def setEmbedHeight(value: String): Self = StObject.set(x, "embedHeight", value.asInstanceOf[js.Any])
    
    inline def setEmbedHeightUndefined: Self = StObject.set(x, "embedHeight", js.undefined)
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    inline def setEmbedWidth(value: String): Self = StObject.set(x, "embedWidth", value.asInstanceOf[js.Any])
    
    inline def setEmbedWidthUndefined: Self = StObject.set(x, "embedWidth", js.undefined)
  }
}
