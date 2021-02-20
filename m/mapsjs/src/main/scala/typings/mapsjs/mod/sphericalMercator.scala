package typings.mapsjs.mod

import typings.mapsjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphericalMercator {
  
  @JSImport("mapsjs", "sphericalMercator.deprojectToLatLon")
  @js.native
  def deprojectToLatLon(mapPt: point): point = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getActualShapeScaleTransform")
  @js.native
  def getActualShapeScaleTransform(mapPtY: Double): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getActualUnitsPerPixel")
  @js.native
  def getActualUnitsPerPixel(mapPt: point, zoomLevel: Double): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getBestFitZoomLevelByExtents")
  @js.native
  def getBestFitZoomLevelByExtents(envelopeMap: envelope, envelopeDevice: envelope): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getCircumference")
  @js.native
  def getCircumference(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getDpi")
  @js.native
  def getDpi(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getEpsg")
  @js.native
  def getEpsg(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getHalfCircumference")
  @js.native
  def getHalfCircumference(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getMaxZoomLevel")
  @js.native
  def getMaxZoomLevel(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getMinZoomLevel")
  @js.native
  def getMinZoomLevel(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getProjectionUnitsPerPixel")
  @js.native
  def getProjectionUnitsPerPixel(zoomLevel: Double): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getQuadKeyFromXYZ")
  @js.native
  def getQuadKeyFromXYZ(x: Double, y: Double, z: Double): String = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getQuadTreeNodeRangeFromEnvelope")
  @js.native
  def getQuadTreeNodeRangeFromEnvelope(env: envelope, z: Double): envelope = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getQuadTreeNodeToMapEnvelope")
  @js.native
  def getQuadTreeNodeToMapEnvelope(x: Double, y: Double, z: Double): envelope = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getRadius")
  @js.native
  def getRadius(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getTileSizePix")
  @js.native
  def getTileSizePix(): Double = js.native
  
  @JSImport("mapsjs", "sphericalMercator.getXYZFromQuadKey")
  @js.native
  def getXYZFromQuadKey(key: String): X = js.native
  
  @JSImport("mapsjs", "sphericalMercator.projectFromLatLon")
  @js.native
  def projectFromLatLon(lonLat: point): point = js.native
  
  @JSImport("mapsjs", "sphericalMercator.setDpi")
  @js.native
  def setDpi(dpi: Double): Unit = js.native
  
  @JSImport("mapsjs", "sphericalMercator.setMaxZoomLevel")
  @js.native
  def setMaxZoomLevel(maxZ: Double): Unit = js.native
  
  @JSImport("mapsjs", "sphericalMercator.setMinZoomLevel")
  @js.native
  def setMinZoomLevel(minZ: Double): Unit = js.native
}
