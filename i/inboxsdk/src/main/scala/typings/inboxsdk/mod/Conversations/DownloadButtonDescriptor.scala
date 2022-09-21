package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadButtonDescriptor extends StObject {
  
  var downloadFilename: js.UndefOr[String] = js.undefined
  
  var downloadUrl: String
  
  def onClick(event: Any): Unit
  
  var openInNewTab: js.UndefOr[Boolean] = js.undefined
}
object DownloadButtonDescriptor {
  
  inline def apply(downloadUrl: String, onClick: Any => Unit): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
  
  extension [Self <: DownloadButtonDescriptor](x: Self) {
    
    inline def setDownloadFilename(value: String): Self = StObject.set(x, "downloadFilename", value.asInstanceOf[js.Any])
    
    inline def setDownloadFilenameUndefined: Self = StObject.set(x, "downloadFilename", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOpenInNewTab(value: Boolean): Self = StObject.set(x, "openInNewTab", value.asInstanceOf[js.Any])
    
    inline def setOpenInNewTabUndefined: Self = StObject.set(x, "openInNewTab", js.undefined)
  }
}
