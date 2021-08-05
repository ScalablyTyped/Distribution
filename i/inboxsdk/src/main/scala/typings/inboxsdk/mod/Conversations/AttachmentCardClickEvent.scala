package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCardClickEvent extends StObject {
  
  def getDownloadURL(): js.Promise[String]
}
object AttachmentCardClickEvent {
  
  inline def apply(getDownloadURL: () => js.Promise[String]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal(getDownloadURL = js.Any.fromFunction0(getDownloadURL))
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
  
  extension [Self <: AttachmentCardClickEvent](x: Self) {
    
    inline def setGetDownloadURL(value: () => js.Promise[String]): Self = StObject.set(x, "getDownloadURL", js.Any.fromFunction0(value))
  }
}
