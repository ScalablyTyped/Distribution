package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Player to be used for a video playback.
  */
@js.native
trait SchemaVideoPlayer extends StObject {
  
  var embedHeight: js.UndefOr[String] = js.native
  
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the video.
    */
  var embedHtml: js.UndefOr[String] = js.native
  
  /**
    * The embed width
    */
  var embedWidth: js.UndefOr[String] = js.native
}
object SchemaVideoPlayer {
  
  @scala.inline
  def apply(): SchemaVideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoPlayer]
  }
  
  @scala.inline
  implicit class SchemaVideoPlayerMutableBuilder[Self <: SchemaVideoPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedHeight(value: String): Self = StObject.set(x, "embedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHeightUndefined: Self = StObject.set(x, "embedHeight", js.undefined)
    
    @scala.inline
    def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    @scala.inline
    def setEmbedWidth(value: String): Self = StObject.set(x, "embedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedWidthUndefined: Self = StObject.set(x, "embedWidth", js.undefined)
  }
}
