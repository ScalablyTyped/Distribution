package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeasurement3d extends StObject {
  
  /**
    * The timestamp of the IMU measurement.
    */
  var captureTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sensor measurement in the x axis.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sensor measurement in the y axis.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sensor measurement in the z axis.
    */
  var z: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMeasurement3d {
  
  inline def apply(): SchemaMeasurement3d = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeasurement3d]
  }
  
  extension [Self <: SchemaMeasurement3d](x: Self) {
    
    inline def setCaptureTime(value: String): Self = StObject.set(x, "captureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeNull: Self = StObject.set(x, "captureTime", null)
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "captureTime", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
