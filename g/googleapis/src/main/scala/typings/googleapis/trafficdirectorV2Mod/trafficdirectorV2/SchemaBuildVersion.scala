package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildVersion extends StObject {
  
  /**
    * Free-form build information. Envoy defines several well known keys in the source/common/version/version.h file
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * SemVer version of extension.
    */
  var version: js.UndefOr[SchemaSemanticVersion] = js.undefined
}
object SchemaBuildVersion {
  
  inline def apply(): SchemaBuildVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildVersion]
  }
  
  extension [Self <: SchemaBuildVersion](x: Self) {
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setVersion(value: SchemaSemanticVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
