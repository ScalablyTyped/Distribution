package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBackendLabelsCommunalLabelTag extends StObject {
  
  /** Gaia ID of the user who added the tag, if any. Not present for any tags automatically created by server-side processing. */
  var creatorUserId: js.UndefOr[String] = js.undefined
  
  /** A string ID representing the label. Possible ID values are documented at go/chat-labels-howto:ids. Example: "^*t_p" for "Pinned". */
  var labelId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteBackendLabelsCommunalLabelTag {
  
  inline def apply(): AppsDynamiteBackendLabelsCommunalLabelTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBackendLabelsCommunalLabelTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteBackendLabelsCommunalLabelTag] (val x: Self) extends AnyVal {
    
    inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
