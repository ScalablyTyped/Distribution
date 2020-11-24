package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchLyrics extends js.Object {
  
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
  implicit class FetchLyricsOps[Self <: FetchLyrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFetchLyrics(value: Boolean): Self = this.set("fetchLyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchLyrics: Self = this.set("fetchLyrics", js.undefined)
    
    @scala.inline
    def setTextFormat(value: LyricistTextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
}
