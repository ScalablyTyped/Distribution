package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJSON
import typings.mapboxMapboxGlDraw.anon.Coordpath
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.click
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.tap
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawCustomModeThis extends StObject {
  
  def activateUIButton(): Unit = js.native
  def activateUIButton(name: String): Unit = js.native
  
  def addFeature(feature: DrawFeature): Unit = js.native
  
  def changeMode(mode: DrawMode): Unit = js.native
  def changeMode(mode: DrawMode, opts: js.Object): Unit = js.native
  def changeMode(mode: DrawMode, opts: js.Object, eventOpts: js.Object): Unit = js.native
  def changeMode(mode: DrawMode, opts: Unit, eventOpts: js.Object): Unit = js.native
  
  def clearSelectedCoordinates(): Unit = js.native
  
  def clearSelectedFeatures(): Unit = js.native
  
  def delete(id: String): Unit = js.native
  
  def deleteFeature(id: String): Unit = js.native
  def deleteFeature(id: String, opts: Any): Unit = js.native
  
  def doRender(id: String): Unit = js.native
  
  def featuresAt(event: Event, bbox: BBox, bufferType: click | tap): js.Array[DrawFeature] = js.native
  
  def getFeature(id: String): DrawFeature = js.native
  
  def getSelected(): js.Array[DrawFeature] = js.native
  
  def getSelectedIds(): js.Array[String] = js.native
  
  def isInstanceOf(`type`: String, feature: js.Object): Boolean = js.native
  
  def isSelected(id: String): Boolean = js.native
  
  def newFeature(geojson: GeoJSON): DrawFeature = js.native
  
  def select(id: String): Unit = js.native
  
  def setActionableState(actionableState: DrawActionableState): Unit = js.native
  
  def setSelected(): Unit = js.native
  def setSelected(features: String): Unit = js.native
  def setSelected(features: js.Array[String]): Unit = js.native
  
  def setSelectedCoordinates(coords: js.Array[Coordpath]): Unit = js.native
  
  def updateUIClasses(opts: js.Object): Unit = js.native
}
