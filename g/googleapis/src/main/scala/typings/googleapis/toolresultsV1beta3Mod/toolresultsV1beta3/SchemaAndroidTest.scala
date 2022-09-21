package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidTest extends StObject {
  
  /**
    * Information about the application under test.
    */
  var androidAppInfo: js.UndefOr[SchemaAndroidAppInfo] = js.undefined
  
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.undefined
  
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.undefined
  
  /**
    * An Android test loop.
    */
  var androidTestLoop: js.UndefOr[SchemaAndroidTestLoop] = js.undefined
  
  /**
    * Max time a test is allowed to run before it is automatically cancelled.
    */
  var testTimeout: js.UndefOr[SchemaDuration] = js.undefined
}
object SchemaAndroidTest {
  
  inline def apply(): SchemaAndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTest]
  }
  
  extension [Self <: SchemaAndroidTest](x: Self) {
    
    inline def setAndroidAppInfo(value: SchemaAndroidAppInfo): Self = StObject.set(x, "androidAppInfo", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppInfoUndefined: Self = StObject.set(x, "androidAppInfo", js.undefined)
    
    inline def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    inline def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    inline def setAndroidTestLoop(value: SchemaAndroidTestLoop): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    inline def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    inline def setTestTimeout(value: SchemaDuration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
