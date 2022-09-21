package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzePackagesMetadataV1 extends StObject {
  
  /**
    * When the scan was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource URI of the container image being scanned.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzePackagesMetadataV1 {
  
  inline def apply(): SchemaAnalyzePackagesMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzePackagesMetadataV1]
  }
  
  extension [Self <: SchemaAnalyzePackagesMetadataV1](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
