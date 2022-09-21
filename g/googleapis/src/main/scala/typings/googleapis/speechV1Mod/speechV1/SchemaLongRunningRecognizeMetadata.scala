package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLongRunningRecognizeMetadata extends StObject {
  
  /**
    * Time of the most recent processing update.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is fully processed and the results are available.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The URI of the audio file being transcribed. Empty if the audio was sent as byte content.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaLongRunningRecognizeMetadata {
  
  inline def apply(): SchemaLongRunningRecognizeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeMetadata]
  }
  
  extension [Self <: SchemaLongRunningRecognizeMetadata](x: Self) {
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
