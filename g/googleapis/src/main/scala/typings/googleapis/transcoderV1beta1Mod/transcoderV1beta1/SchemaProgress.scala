package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProgress extends StObject {
  
  /**
    * Estimated fractional progress for `analyzing` step.
    */
  var analyzed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Estimated fractional progress for `encoding` step.
    */
  var encoded: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Estimated fractional progress for `notifying` step.
    */
  var notified: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Estimated fractional progress for `uploading` step.
    */
  var uploaded: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProgress {
  
  inline def apply(): SchemaProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProgress]
  }
  
  extension [Self <: SchemaProgress](x: Self) {
    
    inline def setAnalyzed(value: Double): Self = StObject.set(x, "analyzed", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedNull: Self = StObject.set(x, "analyzed", null)
    
    inline def setAnalyzedUndefined: Self = StObject.set(x, "analyzed", js.undefined)
    
    inline def setEncoded(value: Double): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedNull: Self = StObject.set(x, "encoded", null)
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setNotified(value: Double): Self = StObject.set(x, "notified", value.asInstanceOf[js.Any])
    
    inline def setNotifiedNull: Self = StObject.set(x, "notified", null)
    
    inline def setNotifiedUndefined: Self = StObject.set(x, "notified", js.undefined)
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploadedNull: Self = StObject.set(x, "uploaded", null)
    
    inline def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
