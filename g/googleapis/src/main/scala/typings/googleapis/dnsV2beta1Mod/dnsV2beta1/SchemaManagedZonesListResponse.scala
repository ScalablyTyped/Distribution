package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonesListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var managedZones: js.UndefOr[js.Array[SchemaManagedZone]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaManagedZonesListResponse {
  
  inline def apply(): SchemaManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonesListResponse]
  }
  
  extension [Self <: SchemaManagedZonesListResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedZones(value: js.Array[SchemaManagedZone]): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    inline def setManagedZonesVarargs(value: SchemaManagedZone*): Self = StObject.set(x, "managedZones", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
