package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the progress of a long-running `LongRunningRecognize` call. It is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaLongRunningRecognizeMetadata extends StObject {
  
  /**
    * Time of the most recent processing update.
    */
  var lastUpdateTime: js.UndefOr[String] = js.native
  
  /**
    * Approximate percentage of audio processed thus far. Guaranteed to be 100
    * when the audio is fully processed and the results are available.
    */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaLongRunningRecognizeMetadata {
  
  @scala.inline
  def apply(): SchemaLongRunningRecognizeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeMetadata]
  }
  
  @scala.inline
  implicit class SchemaLongRunningRecognizeMetadataMutableBuilder[Self <: SchemaLongRunningRecognizeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
