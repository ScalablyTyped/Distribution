package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roadview extends StObject {
  
  def getPanoId(): Double
  
  def getPosition(): LatLng
  
  def getViewpoint(): Viewpoint
  
  def getViewpointWithPanoId(): Viewpoint
  
  def relayout(): Unit
  
  def setPanoId(panoId: Double, position: LatLng): Unit
  
  def setViewpoint(viewpoint: Viewpoint): Unit
}
object Roadview {
  
  inline def apply(
    getPanoId: () => Double,
    getPosition: () => LatLng,
    getViewpoint: () => Viewpoint,
    getViewpointWithPanoId: () => Viewpoint,
    relayout: () => Unit,
    setPanoId: (Double, LatLng) => Unit,
    setViewpoint: Viewpoint => Unit
  ): Roadview = {
    val __obj = js.Dynamic.literal(getPanoId = js.Any.fromFunction0(getPanoId), getPosition = js.Any.fromFunction0(getPosition), getViewpoint = js.Any.fromFunction0(getViewpoint), getViewpointWithPanoId = js.Any.fromFunction0(getViewpointWithPanoId), relayout = js.Any.fromFunction0(relayout), setPanoId = js.Any.fromFunction2(setPanoId), setViewpoint = js.Any.fromFunction1(setViewpoint))
    __obj.asInstanceOf[Roadview]
  }
  
  extension [Self <: Roadview](x: Self) {
    
    inline def setGetPanoId(value: () => Double): Self = StObject.set(x, "getPanoId", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => LatLng): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetViewpoint(value: () => Viewpoint): Self = StObject.set(x, "getViewpoint", js.Any.fromFunction0(value))
    
    inline def setGetViewpointWithPanoId(value: () => Viewpoint): Self = StObject.set(x, "getViewpointWithPanoId", js.Any.fromFunction0(value))
    
    inline def setRelayout(value: () => Unit): Self = StObject.set(x, "relayout", js.Any.fromFunction0(value))
    
    inline def setSetPanoId(value: (Double, LatLng) => Unit): Self = StObject.set(x, "setPanoId", js.Any.fromFunction2(value))
    
    inline def setSetViewpoint(value: Viewpoint => Unit): Self = StObject.set(x, "setViewpoint", js.Any.fromFunction1(value))
  }
}
