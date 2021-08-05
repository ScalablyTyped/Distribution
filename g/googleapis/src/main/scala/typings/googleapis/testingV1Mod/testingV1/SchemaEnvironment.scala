package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The environment in which the test is run.
  */
trait SchemaEnvironment extends StObject {
  
  /**
    * An Android device which must be used with an Android test.
    */
  var androidDevice: js.UndefOr[SchemaAndroidDevice] = js.undefined
  
  /**
    * An iOS device which must be used with an iOS test.
    */
  var iosDevice: js.UndefOr[SchemaIosDevice] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setAndroidDevice(value: SchemaAndroidDevice): Self = StObject.set(x, "androidDevice", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceUndefined: Self = StObject.set(x, "androidDevice", js.undefined)
    
    inline def setIosDevice(value: SchemaIosDevice): Self = StObject.set(x, "iosDevice", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceUndefined: Self = StObject.set(x, "iosDevice", js.undefined)
  }
}
