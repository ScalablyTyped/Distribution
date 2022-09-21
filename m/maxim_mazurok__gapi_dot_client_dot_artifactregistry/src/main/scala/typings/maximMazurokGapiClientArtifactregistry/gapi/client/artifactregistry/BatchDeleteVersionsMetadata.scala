package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteVersionsMetadata extends StObject {
  
  /** The versions the operation failed to delete. */
  var failedVersions: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchDeleteVersionsMetadata {
  
  inline def apply(): BatchDeleteVersionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteVersionsMetadata]
  }
  
  extension [Self <: BatchDeleteVersionsMetadata](x: Self) {
    
    inline def setFailedVersions(value: js.Array[String]): Self = StObject.set(x, "failedVersions", value.asInstanceOf[js.Any])
    
    inline def setFailedVersionsUndefined: Self = StObject.set(x, "failedVersions", js.undefined)
    
    inline def setFailedVersionsVarargs(value: String*): Self = StObject.set(x, "failedVersions", js.Array(value*))
  }
}
