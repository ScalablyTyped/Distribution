package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadButtonDescriptor extends js.Object {
  
  var downloadFilename: js.UndefOr[String] = js.native
  
  var downloadUrl: String = js.native
  
  def onClick(event: js.Any): Unit = js.native
  
  var openInNewTab: js.UndefOr[Boolean] = js.native
}
object DownloadButtonDescriptor {
  
  @scala.inline
  def apply(downloadUrl: String, onClick: js.Any => Unit): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
  
  @scala.inline
  implicit class DownloadButtonDescriptorOps[Self <: DownloadButtonDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadFilename(value: String): Self = this.set("downloadFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadFilename: Self = this.set("downloadFilename", js.undefined)
    
    @scala.inline
    def setOpenInNewTab(value: Boolean): Self = this.set("openInNewTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenInNewTab: Self = this.set("openInNewTab", js.undefined)
  }
}
