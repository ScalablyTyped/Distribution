package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteTombstoneMetadata extends StObject {
  
  /** Indicates the type of Tombstone. */
  var tombstoneType: js.UndefOr[String] = js.undefined
}
object AppsDynamiteTombstoneMetadata {
  
  inline def apply(): AppsDynamiteTombstoneMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteTombstoneMetadata]
  }
  
  extension [Self <: AppsDynamiteTombstoneMetadata](x: Self) {
    
    inline def setTombstoneType(value: String): Self = StObject.set(x, "tombstoneType", value.asInstanceOf[js.Any])
    
    inline def setTombstoneTypeUndefined: Self = StObject.set(x, "tombstoneType", js.undefined)
  }
}
