package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of properties that uniquely identify a given Docker image.
  */
trait SchemaFingerprint extends StObject {
  
  /**
    * Required. The layer ID of the final layer in the Docker image&#39;s v1
    * representation.
    */
  var v1Name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The name of the image&#39;s v2 blobs computed via: [bottom]
    * := v2_blobbottom := sha256(v2_blob[N] + &quot; &quot; + v2_name[N+1])
    * Only the name of the final blob is kept.
    */
  var v2Name: js.UndefOr[String] = js.undefined
}
object SchemaFingerprint {
  
  inline def apply(): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFingerprint]
  }
  
  extension [Self <: SchemaFingerprint](x: Self) {
    
    inline def setV1Name(value: String): Self = StObject.set(x, "v1Name", value.asInstanceOf[js.Any])
    
    inline def setV1NameUndefined: Self = StObject.set(x, "v1Name", js.undefined)
    
    inline def setV2Blob(value: js.Array[String]): Self = StObject.set(x, "v2Blob", value.asInstanceOf[js.Any])
    
    inline def setV2BlobUndefined: Self = StObject.set(x, "v2Blob", js.undefined)
    
    inline def setV2BlobVarargs(value: String*): Self = StObject.set(x, "v2Blob", js.Array(value :_*))
    
    inline def setV2Name(value: String): Self = StObject.set(x, "v2Name", value.asInstanceOf[js.Any])
    
    inline def setV2NameUndefined: Self = StObject.set(x, "v2Name", js.undefined)
  }
}
