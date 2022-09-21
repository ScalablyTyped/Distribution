package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteDmId extends StObject {
  
  /** Unique server assigned Id, per Direct Message Space. */
  var dmId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteDmId {
  
  inline def apply(): AppsDynamiteDmId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteDmId]
  }
  
  extension [Self <: AppsDynamiteDmId](x: Self) {
    
    inline def setDmId(value: String): Self = StObject.set(x, "dmId", value.asInstanceOf[js.Any])
    
    inline def setDmIdUndefined: Self = StObject.set(x, "dmId", js.undefined)
  }
}
