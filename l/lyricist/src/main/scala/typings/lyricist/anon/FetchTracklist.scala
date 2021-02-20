package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchTracklist extends StObject {
  
  var fetchTracklist: js.UndefOr[Boolean] = js.native
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.native
}
object FetchTracklist {
  
  @scala.inline
  def apply(): FetchTracklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchTracklist]
  }
  
  @scala.inline
  implicit class FetchTracklistMutableBuilder[Self <: FetchTracklist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchTracklist(value: Boolean): Self = StObject.set(x, "fetchTracklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTracklistUndefined: Self = StObject.set(x, "fetchTracklist", js.undefined)
    
    @scala.inline
    def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
