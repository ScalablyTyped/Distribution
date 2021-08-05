package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the progress of a long-running `LongRunningRecognize` call. It is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
trait SchemaLongRunningRecognizeMetadata extends StObject {
  
  /**
    * Time of the most recent processing update.
    */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Approximate percentage of audio processed thus far. Guaranteed to be 100
    * when the audio is fully processed and the results are available.
    */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaLongRunningRecognizeMetadata {
  
  inline def apply(): SchemaLongRunningRecognizeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeMetadata]
  }
  
  extension [Self <: SchemaLongRunningRecognizeMetadata](x: Self) {
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
