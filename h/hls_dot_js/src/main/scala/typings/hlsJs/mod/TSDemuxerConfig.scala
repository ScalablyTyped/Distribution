package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDemuxerConfig extends StObject {
  
  var forceKeyFrameOnDiscontinuity: Boolean
}
object TSDemuxerConfig {
  
  inline def apply(forceKeyFrameOnDiscontinuity: Boolean): TSDemuxerConfig = {
    val __obj = js.Dynamic.literal(forceKeyFrameOnDiscontinuity = forceKeyFrameOnDiscontinuity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDemuxerConfig]
  }
  
  extension [Self <: TSDemuxerConfig](x: Self) {
    
    inline def setForceKeyFrameOnDiscontinuity(value: Boolean): Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", value.asInstanceOf[js.Any])
  }
}
