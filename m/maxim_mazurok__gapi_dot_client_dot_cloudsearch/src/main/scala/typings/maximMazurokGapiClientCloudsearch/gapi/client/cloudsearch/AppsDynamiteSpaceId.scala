package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSpaceId extends StObject {
  
  /** Unique, immutable ID of the Space */
  var spaceId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSpaceId {
  
  inline def apply(): AppsDynamiteSpaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSpaceId]
  }
  
  extension [Self <: AppsDynamiteSpaceId](x: Self) {
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setSpaceIdUndefined: Self = StObject.set(x, "spaceId", js.undefined)
  }
}
