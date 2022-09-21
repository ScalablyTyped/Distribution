package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportStats extends StObject {
  
  /**
    * The number of messages or files already processed for export.
    */
  var exportedArtifactCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of export in bytes.
    */
  var sizeInBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of messages or files to be exported.
    */
  var totalArtifactCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaExportStats {
  
  inline def apply(): SchemaExportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportStats]
  }
  
  extension [Self <: SchemaExportStats](x: Self) {
    
    inline def setExportedArtifactCount(value: String): Self = StObject.set(x, "exportedArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setExportedArtifactCountNull: Self = StObject.set(x, "exportedArtifactCount", null)
    
    inline def setExportedArtifactCountUndefined: Self = StObject.set(x, "exportedArtifactCount", js.undefined)
    
    inline def setSizeInBytes(value: String): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesNull: Self = StObject.set(x, "sizeInBytes", null)
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setTotalArtifactCount(value: String): Self = StObject.set(x, "totalArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setTotalArtifactCountNull: Self = StObject.set(x, "totalArtifactCount", null)
    
    inline def setTotalArtifactCountUndefined: Self = StObject.set(x, "totalArtifactCount", js.undefined)
  }
}
