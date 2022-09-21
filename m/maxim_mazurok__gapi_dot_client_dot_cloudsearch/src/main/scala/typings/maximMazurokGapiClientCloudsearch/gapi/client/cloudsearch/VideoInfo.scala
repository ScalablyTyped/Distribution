package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoInfo extends StObject {
  
  /** Duration of the video in milliseconds. This field can be absent for recently uploaded video or inaccurate sometimes. */
  var duration: js.UndefOr[Double] = js.undefined
}
object VideoInfo {
  
  inline def apply(): VideoInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoInfo]
  }
  
  extension [Self <: VideoInfo](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
