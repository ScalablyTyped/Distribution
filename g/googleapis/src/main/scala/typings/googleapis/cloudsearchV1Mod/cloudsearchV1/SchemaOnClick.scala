package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnClick extends StObject {
  
  var action: js.UndefOr[SchemaFormAction] = js.undefined
  
  /**
    * This can be used as a short form for OpenLink with the default OpenAs and OnClose. It may be undeprecated if this proves to be handy for developers.
    */
  var link: js.UndefOr[String | Null] = js.undefined
  
  var openLink: js.UndefOr[SchemaOpenLink] = js.undefined
  
  /**
    * An add-on triggers this action when the form action needs to open a link. This differs from the open_link above in that this needs to talk to server to get the link. Thus some preparation work is required for web client to do before the open link action response comes back.
    */
  var openLinkAction: js.UndefOr[SchemaFormAction] = js.undefined
}
object SchemaOnClick {
  
  inline def apply(): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnClick]
  }
  
  extension [Self <: SchemaOnClick](x: Self) {
    
    inline def setAction(value: SchemaFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOpenLink(value: SchemaOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkAction(value: SchemaFormAction): Self = StObject.set(x, "openLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkActionUndefined: Self = StObject.set(x, "openLinkAction", js.undefined)
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
