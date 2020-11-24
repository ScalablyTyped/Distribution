package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchTracklist extends js.Object {
  
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
  implicit class FetchTracklistOps[Self <: FetchTracklist] (val x: Self) extends AnyVal {
    
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
    def setFetchTracklist(value: Boolean): Self = this.set("fetchTracklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchTracklist: Self = this.set("fetchTracklist", js.undefined)
    
    @scala.inline
    def setTextFormat(value: LyricistTextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
}
