package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedGroupDetails extends StObject {
  
  /** A simple text that describes the purpose of a single Group, the general theme of the topics to be posted and/or the denominator of the Group participants. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A simple text describing the rules and expectations from members when participating in conversation. */
  var guidelines: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedGroupDetails {
  
  inline def apply(): AppsDynamiteSharedGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedGroupDetails]
  }
  
  extension [Self <: AppsDynamiteSharedGroupDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
    
    inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
  }
}
