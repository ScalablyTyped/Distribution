package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImu extends StObject {
  
  /**
    * The accelerometer measurements in meters/sec^2 with increasing timestamps from devices.
    */
  var accelMpsps: js.UndefOr[js.Array[SchemaMeasurement3d]] = js.undefined
  
  /**
    * The gyroscope measurements in radians/sec with increasing timestamps from devices.
    */
  var gyroRps: js.UndefOr[js.Array[SchemaMeasurement3d]] = js.undefined
  
  /**
    * The magnetometer measurements of the magnetic field in microtesla (uT) with increasing timestamps from devices.
    */
  var magUt: js.UndefOr[js.Array[SchemaMeasurement3d]] = js.undefined
}
object SchemaImu {
  
  inline def apply(): SchemaImu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImu]
  }
  
  extension [Self <: SchemaImu](x: Self) {
    
    inline def setAccelMpsps(value: js.Array[SchemaMeasurement3d]): Self = StObject.set(x, "accelMpsps", value.asInstanceOf[js.Any])
    
    inline def setAccelMpspsUndefined: Self = StObject.set(x, "accelMpsps", js.undefined)
    
    inline def setAccelMpspsVarargs(value: SchemaMeasurement3d*): Self = StObject.set(x, "accelMpsps", js.Array(value*))
    
    inline def setGyroRps(value: js.Array[SchemaMeasurement3d]): Self = StObject.set(x, "gyroRps", value.asInstanceOf[js.Any])
    
    inline def setGyroRpsUndefined: Self = StObject.set(x, "gyroRps", js.undefined)
    
    inline def setGyroRpsVarargs(value: SchemaMeasurement3d*): Self = StObject.set(x, "gyroRps", js.Array(value*))
    
    inline def setMagUt(value: js.Array[SchemaMeasurement3d]): Self = StObject.set(x, "magUt", value.asInstanceOf[js.Any])
    
    inline def setMagUtUndefined: Self = StObject.set(x, "magUt", js.undefined)
    
    inline def setMagUtVarargs(value: SchemaMeasurement3d*): Self = StObject.set(x, "magUt", js.Array(value*))
  }
}
