package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collaboration extends StObject {
  
  /** The attachment being collaborated on. */
  var attachmentId: js.UndefOr[String] = js.undefined
  
  /** Display info of the user who initiated the collaboration session. */
  var initiator: js.UndefOr[UserDisplayInfo] = js.undefined
  
  /** The uri of the artifact being collaborated on. */
  var uri: js.UndefOr[String] = js.undefined
}
object Collaboration {
  
  inline def apply(): Collaboration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collaboration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collaboration] (val x: Self) extends AnyVal {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setInitiator(value: UserDisplayInfo): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
