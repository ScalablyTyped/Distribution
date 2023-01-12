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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSDemuxerConfig] (val x: Self) extends AnyVal {
    
    inline def setForceKeyFrameOnDiscontinuity(value: Boolean): Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", value.asInstanceOf[js.Any])
  }
}
