package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractOverlayMethods extends StObject {
  
  def draw(): Unit = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPanels(): MapPanels = js.native
  
  def getProjection(): MapProjection = js.native
  
  def onAdd(): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}
