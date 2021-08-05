package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Geo Point.
  */
trait KiiGeoPoint extends StObject {
  
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
  
  inline def apply(getLatitude: () => Double, getLongitude: () => Double): KiiGeoPoint = {
    val __obj = js.Dynamic.literal(getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude))
    __obj.asInstanceOf[KiiGeoPoint]
  }
  
  extension [Self <: KiiGeoPoint](x: Self) {
    
    inline def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    inline def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
  }
}
