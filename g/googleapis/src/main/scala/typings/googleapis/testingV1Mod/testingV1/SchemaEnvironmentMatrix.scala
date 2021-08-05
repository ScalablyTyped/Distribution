package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The matrix of environments in which the test is to be executed.
  */
trait SchemaEnvironmentMatrix extends StObject {
  
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[SchemaAndroidDeviceList] = js.undefined
  
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[SchemaAndroidMatrix] = js.undefined
  
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[SchemaIosDeviceList] = js.undefined
}
object SchemaEnvironmentMatrix {
  
  inline def apply(): SchemaEnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentMatrix]
  }
  
  extension [Self <: SchemaEnvironmentMatrix](x: Self) {
    
    inline def setAndroidDeviceList(value: SchemaAndroidDeviceList): Self = StObject.set(x, "androidDeviceList", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceListUndefined: Self = StObject.set(x, "androidDeviceList", js.undefined)
    
    inline def setAndroidMatrix(value: SchemaAndroidMatrix): Self = StObject.set(x, "androidMatrix", value.asInstanceOf[js.Any])
    
    inline def setAndroidMatrixUndefined: Self = StObject.set(x, "androidMatrix", js.undefined)
    
    inline def setIosDeviceList(value: SchemaIosDeviceList): Self = StObject.set(x, "iosDeviceList", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceListUndefined: Self = StObject.set(x, "iosDeviceList", js.undefined)
  }
}
