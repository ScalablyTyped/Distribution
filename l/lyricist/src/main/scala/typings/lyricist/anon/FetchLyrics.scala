package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchLyrics extends StObject {
  
  var fetchLyrics: js.UndefOr[Boolean] = js.native
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.native
}
object FetchLyrics {
  
  @scala.inline
  def apply(): FetchLyrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchLyrics]
  }
  
  @scala.inline
  implicit class FetchLyricsMutableBuilder[Self <: FetchLyrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchLyrics(value: Boolean): Self = StObject.set(x, "fetchLyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchLyricsUndefined: Self = StObject.set(x, "fetchLyrics", js.undefined)
    
    @scala.inline
    def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
