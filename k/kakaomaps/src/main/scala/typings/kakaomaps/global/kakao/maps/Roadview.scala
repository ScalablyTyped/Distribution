package typings.kakaomaps.global.kakao.maps

import typings.kakaomaps.kakao.maps.RoadviewOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.Roadview")
@js.native
open class Roadview protected ()
  extends StObject
     with typings.kakaomaps.kakao.maps.Roadview {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: RoadviewOptions) = this()
  
  /* CompleteClass */
  override def getPanoId(): Double = js.native
  
  /* CompleteClass */
  override def getPosition(): typings.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def getViewpoint(): typings.kakaomaps.kakao.maps.Viewpoint = js.native
  
  /* CompleteClass */
  override def getViewpointWithPanoId(): typings.kakaomaps.kakao.maps.Viewpoint = js.native
  
  /* CompleteClass */
  override def relayout(): Unit = js.native
  
  /* CompleteClass */
  override def setPanoId(panoId: Double, position: typings.kakaomaps.kakao.maps.LatLng): Unit = js.native
  
  /* CompleteClass */
  override def setViewpoint(viewpoint: typings.kakaomaps.kakao.maps.Viewpoint): Unit = js.native
}
