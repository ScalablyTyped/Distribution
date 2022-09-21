package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBackendLabelsPersonalLabelTag extends StObject {
  
  /** A string ID representing the label. Possible ID values are documented at go/chat-labels-howto:ids. Examples: "^t" for "Starred", "^nu" for "Nudged". */
  var labelId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteBackendLabelsPersonalLabelTag {
  
  inline def apply(): AppsDynamiteBackendLabelsPersonalLabelTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBackendLabelsPersonalLabelTag]
  }
  
  extension [Self <: AppsDynamiteBackendLabelsPersonalLabelTag](x: Self) {
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
