package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOnClick extends StObject {
  
  /** If specified, an action is triggered by this onClick. */
  var action: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  /**
    * An add-on triggers this action when the action needs to open a link. This differs from the open_link above in that this needs to talk to server to get the link. Thus some
    * preparation work is required for web client to do before the open link action response comes back.
    */
  var openDynamicLinkAction: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  /** If specified, this onClick triggers an open link action. */
  var openLink: js.UndefOr[AppsDynamiteSharedOpenLink] = js.undefined
}
object AppsDynamiteSharedOnClick {
  
  inline def apply(): AppsDynamiteSharedOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOnClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedOnClick] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOpenDynamicLinkAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "openDynamicLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenDynamicLinkActionUndefined: Self = StObject.set(x, "openDynamicLinkAction", js.undefined)
    
    inline def setOpenLink(value: AppsDynamiteSharedOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
