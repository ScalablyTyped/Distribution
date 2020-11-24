package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeparatorSheets extends js.Object {
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  
  var `separator-sheets-type`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.native
}
object SeparatorSheets {
  
  @scala.inline
  def apply(): SeparatorSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorSheets]
  }
  
  @scala.inline
  implicit class SeparatorSheetsOps[Self <: SeparatorSheets] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = this.set("media-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-col`: Self = this.set("media-col", js.undefined)
    
    @scala.inline
    def `setSeparator-sheets-typeVarargs`(value: SeparatorSheetsType*): Self = this.set("separator-sheets-type", js.Array(value :_*))
    
    @scala.inline
    def `setSeparator-sheets-type`(value: js.Array[SeparatorSheetsType]): Self = this.set("separator-sheets-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSeparator-sheets-type`: Self = this.set("separator-sheets-type", js.undefined)
  }
}
