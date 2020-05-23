package typings.mapsjs.mod

import typings.mapsjs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "sphericalMercator")
@js.native
object sphericalMercator extends js.Object {
  def deprojectToLatLon(mapPt: point): point = js.native
  def getActualShapeScaleTransform(mapPtY: Double): Double = js.native
  def getActualUnitsPerPixel(mapPt: point, zoomLevel: Double): Double = js.native
  def getBestFitZoomLevelByExtents(envelopeMap: envelope, envelopeDevice: envelope): Double = js.native
  def getCircumference(): Double = js.native
  def getDpi(): Double = js.native
  def getEpsg(): Double = js.native
  def getHalfCircumference(): Double = js.native
  def getMaxZoomLevel(): Double = js.native
  def getMinZoomLevel(): Double = js.native
  def getProjectionUnitsPerPixel(zoomLevel: Double): Double = js.native
  def getQuadKeyFromXYZ(x: Double, y: Double, z: Double): String = js.native
  def getQuadTreeNodeRangeFromEnvelope(env: envelope, z: Double): envelope = js.native
  def getQuadTreeNodeToMapEnvelope(x: Double, y: Double, z: Double): envelope = js.native
  def getRadius(): Double = js.native
  def getTileSizePix(): Double = js.native
  def getXYZFromQuadKey(key: String): X = js.native
  def projectFromLatLon(lonLat: point): point = js.native
  def setDpi(dpi: Double): Unit = js.native
  def setMaxZoomLevel(maxZ: Double): Unit = js.native
  def setMinZoomLevel(minZ: Double): Unit = js.native
}

