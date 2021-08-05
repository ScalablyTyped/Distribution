package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystemsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Operating system collection. */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.undefined
}
object OperatingSystemsListResponse {
  
  inline def apply(): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
  
  extension [Self <: OperatingSystemsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOperatingSystems(value: js.Array[OperatingSystem]): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value :_*))
  }
}
