package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents Geo Point.
  */
trait KiiGeoPoint extends js.Object {
  /**
    * Return the latitide of this point.
    */
  def getLatitude(): Double
  /**
    * Return the longitude of this point.
    */
  def getLongitude(): Double
}

object KiiGeoPoint {
  @scala.inline
  def apply(getLatitude: () => Double, getLongitude: () => Double): KiiGeoPoint = {
    val __obj = js.Dynamic.literal(getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude))
    __obj.asInstanceOf[KiiGeoPoint]
  }
}

