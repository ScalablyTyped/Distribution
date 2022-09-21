package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobId extends StObject {
  
  var jobId: String
  
  var tilesetId: String
}
object JobId {
  
  inline def apply(jobId: String, tilesetId: String): JobId = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobId]
  }
  
  extension [Self <: JobId](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
