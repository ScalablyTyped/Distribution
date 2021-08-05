package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchTracklist extends StObject {
  
  var fetchTracklist: js.UndefOr[Boolean] = js.undefined
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}
object FetchTracklist {
  
  inline def apply(): FetchTracklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchTracklist]
  }
  
  extension [Self <: FetchTracklist](x: Self) {
    
    inline def setFetchTracklist(value: Boolean): Self = StObject.set(x, "fetchTracklist", value.asInstanceOf[js.Any])
    
    inline def setFetchTracklistUndefined: Self = StObject.set(x, "fetchTracklist", js.undefined)
    
    inline def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
