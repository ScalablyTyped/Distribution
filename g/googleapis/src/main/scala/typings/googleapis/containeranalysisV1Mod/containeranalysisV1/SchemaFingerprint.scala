package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFingerprint extends StObject {
  
  /**
    * Required. The layer ID of the final layer in the Docker image's v1 representation.
    */
  var v1Name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept.
    */
  var v2Name: js.UndefOr[String | Null] = js.undefined
}
object SchemaFingerprint {
  
  inline def apply(): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFingerprint]
  }
  
  extension [Self <: SchemaFingerprint](x: Self) {
    
    inline def setV1Name(value: String): Self = StObject.set(x, "v1Name", value.asInstanceOf[js.Any])
    
    inline def setV1NameNull: Self = StObject.set(x, "v1Name", null)
    
    inline def setV1NameUndefined: Self = StObject.set(x, "v1Name", js.undefined)
    
    inline def setV2Blob(value: js.Array[String]): Self = StObject.set(x, "v2Blob", value.asInstanceOf[js.Any])
    
    inline def setV2BlobNull: Self = StObject.set(x, "v2Blob", null)
    
    inline def setV2BlobUndefined: Self = StObject.set(x, "v2Blob", js.undefined)
    
    inline def setV2BlobVarargs(value: String*): Self = StObject.set(x, "v2Blob", js.Array(value*))
    
    inline def setV2Name(value: String): Self = StObject.set(x, "v2Name", value.asInstanceOf[js.Any])
    
    inline def setV2NameNull: Self = StObject.set(x, "v2Name", null)
    
    inline def setV2NameUndefined: Self = StObject.set(x, "v2Name", js.undefined)
  }
}
