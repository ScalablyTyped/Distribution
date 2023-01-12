package typings.jitsiMeet.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigVideoQuality extends StObject {
  
  var disabledCodec: js.UndefOr[String] = js.undefined
  
  var maxBitratesVideo: js.UndefOr[VideoBitrates] = js.undefined
  
  var minHeightForQualityLvl: js.UndefOr[Record[Double, String]] = js.undefined
  
  var preferredCodec: js.UndefOr[String] = js.undefined
  
  var resizeDesktopForPresenter: js.UndefOr[Boolean] = js.undefined
}
object ConfigVideoQuality {
  
  inline def apply(): ConfigVideoQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigVideoQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigVideoQuality] (val x: Self) extends AnyVal {
    
    inline def setDisabledCodec(value: String): Self = StObject.set(x, "disabledCodec", value.asInstanceOf[js.Any])
    
    inline def setDisabledCodecUndefined: Self = StObject.set(x, "disabledCodec", js.undefined)
    
    inline def setMaxBitratesVideo(value: VideoBitrates): Self = StObject.set(x, "maxBitratesVideo", value.asInstanceOf[js.Any])
    
    inline def setMaxBitratesVideoUndefined: Self = StObject.set(x, "maxBitratesVideo", js.undefined)
    
    inline def setMinHeightForQualityLvl(value: Record[Double, String]): Self = StObject.set(x, "minHeightForQualityLvl", value.asInstanceOf[js.Any])
    
    inline def setMinHeightForQualityLvlUndefined: Self = StObject.set(x, "minHeightForQualityLvl", js.undefined)
    
    inline def setPreferredCodec(value: String): Self = StObject.set(x, "preferredCodec", value.asInstanceOf[js.Any])
    
    inline def setPreferredCodecUndefined: Self = StObject.set(x, "preferredCodec", js.undefined)
    
    inline def setResizeDesktopForPresenter(value: Boolean): Self = StObject.set(x, "resizeDesktopForPresenter", value.asInstanceOf[js.Any])
    
    inline def setResizeDesktopForPresenterUndefined: Self = StObject.set(x, "resizeDesktopForPresenter", js.undefined)
  }
}
