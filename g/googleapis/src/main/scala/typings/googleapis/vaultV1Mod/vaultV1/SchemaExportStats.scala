package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stats of an export.
  */
trait SchemaExportStats extends StObject {
  
  /**
    * The number of documents already processed by the export.
    */
  var exportedArtifactCount: js.UndefOr[String] = js.undefined
  
  /**
    * The size of export in bytes.
    */
  var sizeInBytes: js.UndefOr[String] = js.undefined
  
  /**
    * The number of documents to be exported.
    */
  var totalArtifactCount: js.UndefOr[String] = js.undefined
}
object SchemaExportStats {
  
  inline def apply(): SchemaExportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportStats]
  }
  
  extension [Self <: SchemaExportStats](x: Self) {
    
    inline def setExportedArtifactCount(value: String): Self = StObject.set(x, "exportedArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setExportedArtifactCountUndefined: Self = StObject.set(x, "exportedArtifactCount", js.undefined)
    
    inline def setSizeInBytes(value: String): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setTotalArtifactCount(value: String): Self = StObject.set(x, "totalArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setTotalArtifactCountUndefined: Self = StObject.set(x, "totalArtifactCount", js.undefined)
  }
}
