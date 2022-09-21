package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Geo Point.
  */
@JSGlobal("KiiCloud.KiiGeoPoint")
@js.native
open class KiiGeoPoint ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiGeoPoint {
  
  /**
    * Return the latitide of this point.
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  
  /**
    * Return the longitude of this point.
    */
  /* CompleteClass */
  override def getLongitude(): Double = js.native
}
object KiiGeoPoint {
  
  @JSGlobal("KiiCloud.KiiGeoPoint")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def geoPoint(latitude: Double, longitude: Double): typings.kiiCloudSdk.KiiCloud.KiiGeoPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPoint")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGeoPoint]
}
