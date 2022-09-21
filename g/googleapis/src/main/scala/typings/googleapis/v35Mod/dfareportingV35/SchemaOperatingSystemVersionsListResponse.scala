package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperatingSystemVersionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersionsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operating system version collection.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[SchemaOperatingSystemVersion]] = js.undefined
}
object SchemaOperatingSystemVersionsListResponse {
  
  inline def apply(): SchemaOperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemVersionsListResponse]
  }
  
  extension [Self <: SchemaOperatingSystemVersionsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOperatingSystemVersions(value: js.Array[SchemaOperatingSystemVersion]): Self = StObject.set(x, "operatingSystemVersions", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionsUndefined: Self = StObject.set(x, "operatingSystemVersions", js.undefined)
    
    inline def setOperatingSystemVersionsVarargs(value: SchemaOperatingSystemVersion*): Self = StObject.set(x, "operatingSystemVersions", js.Array(value*))
  }
}
