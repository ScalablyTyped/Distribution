package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentDataRef extends StObject {
  
  /** The resource name of the attachment data. This is used with the media API to download the attachment data. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object AttachmentDataRef {
  
  @scala.inline
  def apply(): AttachmentDataRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentDataRef]
  }
  
  @scala.inline
  implicit class AttachmentDataRefMutableBuilder[Self <: AttachmentDataRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
