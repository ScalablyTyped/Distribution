package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "sphericalMercator")
@js.native
object sphericalMercatorNs extends js.Object {
  def deprojectToLatLon(mapPt: mapsjsLib.mapsjsMod.point): mapsjsLib.mapsjsMod.point = js.native
  def getActualShapeScaleTransform(mapPtY: scala.Double): scala.Double = js.native
  def getActualUnitsPerPixel(mapPt: mapsjsLib.mapsjsMod.point, zoomLevel: scala.Double): scala.Double = js.native
  def getBestFitZoomLevelByExtents(envelopeMap: mapsjsLib.mapsjsMod.envelope, envelopeDevice: mapsjsLib.mapsjsMod.envelope): scala.Double = js.native
  def getCircumference(): scala.Double = js.native
  def getDpi(): scala.Double = js.native
  def getEpsg(): scala.Double = js.native
  def getHalfCircumference(): scala.Double = js.native
  def getMaxZoomLevel(): scala.Double = js.native
  def getMinZoomLevel(): scala.Double = js.native
  def getProjectionUnitsPerPixel(zoomLevel: scala.Double): scala.Double = js.native
  def getQuadKeyFromXYZ(x: scala.Double, y: scala.Double, z: scala.Double): java.lang.String = js.native
  def getQuadTreeNodeRangeFromEnvelope(env: mapsjsLib.mapsjsMod.envelope, z: scala.Double): mapsjsLib.mapsjsMod.envelope = js.native
  def getQuadTreeNodeToMapEnvelope(x: scala.Double, y: scala.Double, z: scala.Double): mapsjsLib.mapsjsMod.envelope = js.native
  def getRadius(): scala.Double = js.native
  def getTileSizePix(): scala.Double = js.native
  def getXYZFromQuadKey(key: java.lang.String): mapsjsLib.Anon_X = js.native
  def projectFromLatLon(lonLat: mapsjsLib.mapsjsMod.point): mapsjsLib.mapsjsMod.point = js.native
  def setDpi(dpi: scala.Double): scala.Unit = js.native
  def setMaxZoomLevel(maxZ: scala.Double): scala.Unit = js.native
  def setMinZoomLevel(minZ: scala.Double): scala.Unit = js.native
}

