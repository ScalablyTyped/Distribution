package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatLike
import typings.maplibreGl.mod.PaddingOptions
import typings.maplibreGl.mod.PointLike
import typings.maplibreGl.mod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined maplibre-gl.maplibre-gl.EaseToOptions & {  easeId :string | undefined,   noMoveStart :boolean | undefined} */
trait EaseToOptionseaseIdstring extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var around: js.UndefOr[LngLatLike] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[LngLatLike] = js.undefined
  
  var delayEndEvents: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easeId: js.UndefOr[String] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* _ */ Double, Double]] = js.undefined
  
  var essential: js.UndefOr[Boolean] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[PointLike] = js.undefined
  
  var padding: js.UndefOr[Double | RequireAtLeastOne[PaddingOptions]] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object EaseToOptionseaseIdstring {
  
  inline def apply(): EaseToOptionseaseIdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseToOptionseaseIdstring]
  }
  
  extension [Self <: EaseToOptionseaseIdstring](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAround(value: LngLatLike): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDelayEndEvents(value: Double): Self = StObject.set(x, "delayEndEvents", value.asInstanceOf[js.Any])
    
    inline def setDelayEndEventsUndefined: Self = StObject.set(x, "delayEndEvents", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEaseId(value: String): Self = StObject.set(x, "easeId", value.asInstanceOf[js.Any])
    
    inline def setEaseIdUndefined: Self = StObject.set(x, "easeId", js.undefined)
    
    inline def setEasing(value: /* _ */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    inline def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    inline def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    inline def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
    
    inline def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPadding(value: Double | RequireAtLeastOne[PaddingOptions]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
