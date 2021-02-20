package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadButtonDescriptor extends StObject {
  
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
  implicit class DownloadButtonDescriptorMutableBuilder[Self <: DownloadButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadFilename(value: String): Self = StObject.set(x, "downloadFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadFilenameUndefined: Self = StObject.set(x, "downloadFilename", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenInNewTab(value: Boolean): Self = StObject.set(x, "openInNewTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInNewTabUndefined: Self = StObject.set(x, "openInNewTab", js.undefined)
  }
}
