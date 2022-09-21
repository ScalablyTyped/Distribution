package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformTypesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Platform type collection. */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}
object PlatformTypesListResponse {
  
  inline def apply(): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
  
  extension [Self <: PlatformTypesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlatformTypes(value: js.Array[PlatformType]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: PlatformType*): Self = StObject.set(x, "platformTypes", js.Array(value*))
  }
}
