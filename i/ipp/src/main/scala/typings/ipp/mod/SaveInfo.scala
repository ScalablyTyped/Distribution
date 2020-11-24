package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveInfo extends js.Object {
  
  var `save-document-format`: js.UndefOr[MimeMediaType] = js.native
  
  var `save-location`: js.UndefOr[String] = js.native
  
  var `save-name`: js.UndefOr[String] = js.native
}
object SaveInfo {
  
  @scala.inline
  def apply(): SaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveInfo]
  }
  
  @scala.inline
  implicit class SaveInfoOps[Self <: SaveInfo] (val x: Self) extends AnyVal {
    
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
    def `setSave-document-format`(value: MimeMediaType): Self = this.set("save-document-format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSave-document-format`: Self = this.set("save-document-format", js.undefined)
    
    @scala.inline
    def `setSave-location`(value: String): Self = this.set("save-location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSave-location`: Self = this.set("save-location", js.undefined)
    
    @scala.inline
    def `setSave-name`(value: String): Self = this.set("save-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSave-name`: Self = this.set("save-name", js.undefined)
  }
}
