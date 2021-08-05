package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchLyrics extends StObject {
  
  var fetchLyrics: js.UndefOr[Boolean] = js.undefined
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}
object FetchLyrics {
  
  inline def apply(): FetchLyrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchLyrics]
  }
  
  extension [Self <: FetchLyrics](x: Self) {
    
    inline def setFetchLyrics(value: Boolean): Self = StObject.set(x, "fetchLyrics", value.asInstanceOf[js.Any])
    
    inline def setFetchLyricsUndefined: Self = StObject.set(x, "fetchLyrics", js.undefined)
    
    inline def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
