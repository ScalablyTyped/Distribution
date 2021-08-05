package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiOutputInfo extends StObject {
  
  /** The id of the tag the user code will emit to this output by; this should correspond to the tag of some SideInputInfo. */
  var tag: js.UndefOr[String] = js.undefined
}
object MultiOutputInfo {
  
  inline def apply(): MultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiOutputInfo]
  }
  
  extension [Self <: MultiOutputInfo](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
