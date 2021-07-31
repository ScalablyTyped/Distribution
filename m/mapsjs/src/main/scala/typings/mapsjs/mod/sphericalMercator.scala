package typings.mapsjs.mod

import typings.mapsjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphericalMercator {
  
  @JSImport("mapsjs", "sphericalMercator")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deprojectToLatLon(mapPt: point): point = ^.asInstanceOf[js.Dynamic].applyDynamic("deprojectToLatLon")(mapPt.asInstanceOf[js.Any]).asInstanceOf[point]
  
  @scala.inline
  def getActualShapeScaleTransform(mapPtY: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualShapeScaleTransform")(mapPtY.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getActualUnitsPerPixel(mapPt: point, zoomLevel: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActualUnitsPerPixel")(mapPt.asInstanceOf[js.Any], zoomLevel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getBestFitZoomLevelByExtents(envelopeMap: envelope, envelopeDevice: envelope): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBestFitZoomLevelByExtents")(envelopeMap.asInstanceOf[js.Any], envelopeDevice.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getCircumference(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircumference")().asInstanceOf[Double]
  
  @scala.inline
  def getDpi(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDpi")().asInstanceOf[Double]
  
  @scala.inline
  def getEpsg(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEpsg")().asInstanceOf[Double]
  
  @scala.inline
  def getHalfCircumference(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHalfCircumference")().asInstanceOf[Double]
  
  @scala.inline
  def getMaxZoomLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxZoomLevel")().asInstanceOf[Double]
  
  @scala.inline
  def getMinZoomLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinZoomLevel")().asInstanceOf[Double]
  
  @scala.inline
  def getProjectionUnitsPerPixel(zoomLevel: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionUnitsPerPixel")(zoomLevel.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getQuadKeyFromXYZ(x: Double, y: Double, z: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuadKeyFromXYZ")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getQuadTreeNodeRangeFromEnvelope(env: envelope, z: Double): envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuadTreeNodeRangeFromEnvelope")(env.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[envelope]
  
  @scala.inline
  def getQuadTreeNodeToMapEnvelope(x: Double, y: Double, z: Double): envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuadTreeNodeToMapEnvelope")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[envelope]
  
  @scala.inline
  def getRadius(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadius")().asInstanceOf[Double]
  
  @scala.inline
  def getTileSizePix(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTileSizePix")().asInstanceOf[Double]
  
  @scala.inline
  def getXYZFromQuadKey(key: String): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getXYZFromQuadKey")(key.asInstanceOf[js.Any]).asInstanceOf[X]
  
  @scala.inline
  def projectFromLatLon(lonLat: point): point = ^.asInstanceOf[js.Dynamic].applyDynamic("projectFromLatLon")(lonLat.asInstanceOf[js.Any]).asInstanceOf[point]
  
  @scala.inline
  def setDpi(dpi: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDpi")(dpi.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setMaxZoomLevel(maxZ: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxZoomLevel")(maxZ.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setMinZoomLevel(minZ: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinZoomLevel")(minZ.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
