package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInterface extends StObject {
  
  var `media-back-coating`: js.UndefOr[MediaCoating] = js.undefined
  
  var `media-bottom-margin`: js.UndefOr[Double] = js.undefined
  
  var `media-color`: js.UndefOr[MediaColor] = js.undefined
  
  var `media-front-coating`: js.UndefOr[MediaCoating] = js.undefined
  
  var `media-grain`: js.UndefOr[MediaGrain] = js.undefined
  
  var `media-hole-count`: js.UndefOr[Double] = js.undefined
  
  var `media-info`: js.UndefOr[String] = js.undefined
  
  var `media-key`: js.UndefOr[MediaSizeName | MediaName] = js.undefined
  
  var `media-left-margin`: js.UndefOr[Double] = js.undefined
  
  var `media-order-count`: js.UndefOr[Double] = js.undefined
  
  var `media-pre-printed`: js.UndefOr[MediaPrePrinted] = js.undefined
  
  var `media-recycled`: js.UndefOr[MediaPrePrinted] = js.undefined
  
  var `media-right-margin`: js.UndefOr[Double] = js.undefined
  
  var `media-size`: js.UndefOr[MediaSize] = js.undefined
  
  var `media-size-name`: js.UndefOr[MediaSizeName] = js.undefined
  
  var `media-source`: js.UndefOr[MediaSource] = js.undefined
  
  var `media-thickness`: js.UndefOr[Double] = js.undefined
  
  var `media-tooth`: js.UndefOr[MediaTooth] = js.undefined
  
  var `media-top-margin`: js.UndefOr[Double] = js.undefined
  
  var `media-type`: js.UndefOr[MediaType] = js.undefined
  
  var `media-weight-metric`: js.UndefOr[Double] = js.undefined
}
object MediaInterface {
  
  inline def apply(): MediaInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInterface] (val x: Self) extends AnyVal {
    
    inline def `setMedia-back-coating`(value: MediaCoating): Self = StObject.set(x, "media-back-coating", value.asInstanceOf[js.Any])
    
    inline def `setMedia-back-coatingUndefined`: Self = StObject.set(x, "media-back-coating", js.undefined)
    
    inline def `setMedia-bottom-margin`(value: Double): Self = StObject.set(x, "media-bottom-margin", value.asInstanceOf[js.Any])
    
    inline def `setMedia-bottom-marginUndefined`: Self = StObject.set(x, "media-bottom-margin", js.undefined)
    
    inline def `setMedia-color`(value: MediaColor): Self = StObject.set(x, "media-color", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colorUndefined`: Self = StObject.set(x, "media-color", js.undefined)
    
    inline def `setMedia-front-coating`(value: MediaCoating): Self = StObject.set(x, "media-front-coating", value.asInstanceOf[js.Any])
    
    inline def `setMedia-front-coatingUndefined`: Self = StObject.set(x, "media-front-coating", js.undefined)
    
    inline def `setMedia-grain`(value: MediaGrain): Self = StObject.set(x, "media-grain", value.asInstanceOf[js.Any])
    
    inline def `setMedia-grainUndefined`: Self = StObject.set(x, "media-grain", js.undefined)
    
    inline def `setMedia-hole-count`(value: Double): Self = StObject.set(x, "media-hole-count", value.asInstanceOf[js.Any])
    
    inline def `setMedia-hole-countUndefined`: Self = StObject.set(x, "media-hole-count", js.undefined)
    
    inline def `setMedia-info`(value: String): Self = StObject.set(x, "media-info", value.asInstanceOf[js.Any])
    
    inline def `setMedia-infoUndefined`: Self = StObject.set(x, "media-info", js.undefined)
    
    inline def `setMedia-key`(value: MediaSizeName | MediaName): Self = StObject.set(x, "media-key", value.asInstanceOf[js.Any])
    
    inline def `setMedia-keyUndefined`: Self = StObject.set(x, "media-key", js.undefined)
    
    inline def `setMedia-left-margin`(value: Double): Self = StObject.set(x, "media-left-margin", value.asInstanceOf[js.Any])
    
    inline def `setMedia-left-marginUndefined`: Self = StObject.set(x, "media-left-margin", js.undefined)
    
    inline def `setMedia-order-count`(value: Double): Self = StObject.set(x, "media-order-count", value.asInstanceOf[js.Any])
    
    inline def `setMedia-order-countUndefined`: Self = StObject.set(x, "media-order-count", js.undefined)
    
    inline def `setMedia-pre-printed`(value: MediaPrePrinted): Self = StObject.set(x, "media-pre-printed", value.asInstanceOf[js.Any])
    
    inline def `setMedia-pre-printedUndefined`: Self = StObject.set(x, "media-pre-printed", js.undefined)
    
    inline def `setMedia-recycled`(value: MediaPrePrinted): Self = StObject.set(x, "media-recycled", value.asInstanceOf[js.Any])
    
    inline def `setMedia-recycledUndefined`: Self = StObject.set(x, "media-recycled", js.undefined)
    
    inline def `setMedia-right-margin`(value: Double): Self = StObject.set(x, "media-right-margin", value.asInstanceOf[js.Any])
    
    inline def `setMedia-right-marginUndefined`: Self = StObject.set(x, "media-right-margin", js.undefined)
    
    inline def `setMedia-size`(value: MediaSize): Self = StObject.set(x, "media-size", value.asInstanceOf[js.Any])
    
    inline def `setMedia-size-name`(value: MediaSizeName): Self = StObject.set(x, "media-size-name", value.asInstanceOf[js.Any])
    
    inline def `setMedia-size-nameUndefined`: Self = StObject.set(x, "media-size-name", js.undefined)
    
    inline def `setMedia-sizeUndefined`: Self = StObject.set(x, "media-size", js.undefined)
    
    inline def `setMedia-source`(value: MediaSource): Self = StObject.set(x, "media-source", value.asInstanceOf[js.Any])
    
    inline def `setMedia-sourceUndefined`: Self = StObject.set(x, "media-source", js.undefined)
    
    inline def `setMedia-thickness`(value: Double): Self = StObject.set(x, "media-thickness", value.asInstanceOf[js.Any])
    
    inline def `setMedia-thicknessUndefined`: Self = StObject.set(x, "media-thickness", js.undefined)
    
    inline def `setMedia-tooth`(value: MediaTooth): Self = StObject.set(x, "media-tooth", value.asInstanceOf[js.Any])
    
    inline def `setMedia-toothUndefined`: Self = StObject.set(x, "media-tooth", js.undefined)
    
    inline def `setMedia-top-margin`(value: Double): Self = StObject.set(x, "media-top-margin", value.asInstanceOf[js.Any])
    
    inline def `setMedia-top-marginUndefined`: Self = StObject.set(x, "media-top-margin", js.undefined)
    
    inline def `setMedia-type`(value: MediaType): Self = StObject.set(x, "media-type", value.asInstanceOf[js.Any])
    
    inline def `setMedia-typeUndefined`: Self = StObject.set(x, "media-type", js.undefined)
    
    inline def `setMedia-weight-metric`(value: Double): Self = StObject.set(x, "media-weight-metric", value.asInstanceOf[js.Any])
    
    inline def `setMedia-weight-metricUndefined`: Self = StObject.set(x, "media-weight-metric", js.undefined)
  }
}
