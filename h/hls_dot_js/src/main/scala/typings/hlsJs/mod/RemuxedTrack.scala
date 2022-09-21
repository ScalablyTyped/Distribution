package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemuxedTrack extends StObject {
  
  var data1: js.typedarray.Uint8Array
  
  var data2: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var dropped: js.UndefOr[Double] = js.undefined
  
  var endDTS: Double
  
  var endPTS: Double
  
  var firstKeyFrame: js.UndefOr[Double] = js.undefined
  
  var firstKeyFramePTS: js.UndefOr[Double] = js.undefined
  
  var hasAudio: Boolean
  
  var hasVideo: Boolean
  
  var independent: js.UndefOr[Boolean] = js.undefined
  
  var nb: Double
  
  var startDTS: Double
  
  var startPTS: Double
  
  var transferredData1: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var transferredData2: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var `type`: SourceBufferName
}
object RemuxedTrack {
  
  inline def apply(
    data1: js.typedarray.Uint8Array,
    endDTS: Double,
    endPTS: Double,
    hasAudio: Boolean,
    hasVideo: Boolean,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: SourceBufferName
  ): RemuxedTrack = {
    val __obj = js.Dynamic.literal(data1 = data1.asInstanceOf[js.Any], endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], nb = nb.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemuxedTrack]
  }
  
  extension [Self <: RemuxedTrack](x: Self) {
    
    inline def setData1(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data1", value.asInstanceOf[js.Any])
    
    inline def setData2(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data2", value.asInstanceOf[js.Any])
    
    inline def setData2Undefined: Self = StObject.set(x, "data2", js.undefined)
    
    inline def setDropped(value: Double): Self = StObject.set(x, "dropped", value.asInstanceOf[js.Any])
    
    inline def setDroppedUndefined: Self = StObject.set(x, "dropped", js.undefined)
    
    inline def setEndDTS(value: Double): Self = StObject.set(x, "endDTS", value.asInstanceOf[js.Any])
    
    inline def setEndPTS(value: Double): Self = StObject.set(x, "endPTS", value.asInstanceOf[js.Any])
    
    inline def setFirstKeyFrame(value: Double): Self = StObject.set(x, "firstKeyFrame", value.asInstanceOf[js.Any])
    
    inline def setFirstKeyFramePTS(value: Double): Self = StObject.set(x, "firstKeyFramePTS", value.asInstanceOf[js.Any])
    
    inline def setFirstKeyFramePTSUndefined: Self = StObject.set(x, "firstKeyFramePTS", js.undefined)
    
    inline def setFirstKeyFrameUndefined: Self = StObject.set(x, "firstKeyFrame", js.undefined)
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setNb(value: Double): Self = StObject.set(x, "nb", value.asInstanceOf[js.Any])
    
    inline def setStartDTS(value: Double): Self = StObject.set(x, "startDTS", value.asInstanceOf[js.Any])
    
    inline def setStartPTS(value: Double): Self = StObject.set(x, "startPTS", value.asInstanceOf[js.Any])
    
    inline def setTransferredData1(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "transferredData1", value.asInstanceOf[js.Any])
    
    inline def setTransferredData1Undefined: Self = StObject.set(x, "transferredData1", js.undefined)
    
    inline def setTransferredData2(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "transferredData2", value.asInstanceOf[js.Any])
    
    inline def setTransferredData2Undefined: Self = StObject.set(x, "transferredData2", js.undefined)
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
