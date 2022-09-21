package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var action: js.UndefOr[FormAction] = js.undefined
  
  /** This can be used as a short form for OpenLink with the default OpenAs and OnClose. It may be undeprecated if this proves to be handy for developers. */
  var link: js.UndefOr[String] = js.undefined
  
  var openLink: js.UndefOr[OpenLink] = js.undefined
  
  /**
    * An add-on triggers this action when the form action needs to open a link. This differs from the open_link above in that this needs to talk to server to get the link. Thus some
    * preparation work is required for web client to do before the open link action response comes back.
    */
  var openLinkAction: js.UndefOr[FormAction] = js.undefined
}
object OnClick {
  
  inline def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setAction(value: FormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOpenLink(value: OpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkAction(value: FormAction): Self = StObject.set(x, "openLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkActionUndefined: Self = StObject.set(x, "openLinkAction", js.undefined)
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
