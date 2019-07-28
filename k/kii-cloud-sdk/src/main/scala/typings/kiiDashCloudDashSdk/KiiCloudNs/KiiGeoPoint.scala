package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents Geo Point.
  */
@JSGlobal("KiiCloud.KiiGeoPoint")
@js.native
class KiiGeoPoint () extends js.Object {
  /**
    * Return the latitide of this point.
    */
  def getLatitude(): Double = js.native
  /**
    * Return the longitude of this point.
    */
  def getLongitude(): Double = js.native
}

/* static members */
@JSGlobal("KiiCloud.KiiGeoPoint")
@js.native
object KiiGeoPoint extends js.Object {
  /**
    * Create a geo point with the given latitude and longitude.
    *
    * @param latitude Latitude of the point in degrees. Valid if the value is greater than -90 degrees and less than +90 degrees.
    * @param longitude Longitude of the point in degrees. Valid if the value is greater than -180 degrees and less than +180 degrees.
    *
    * @return A new reference of KiiGeoPoint.
    *
    * @throws Specified latitude or longitude is invalid.
    *
    * @example
    *         var point = KiiGeoPoint.geoPoint(35.07, 139.02);
    */
  def geoPoint(latitude: Double, longitude: Double): KiiGeoPoint = js.native
}

