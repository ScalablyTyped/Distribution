package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how to run the test.
  */
trait SchemaTestSpecification extends StObject {
  
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.undefined
  
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.undefined
  
  /**
    * An Android Application with a Test Loop.
    */
  var androidTestLoop: js.UndefOr[SchemaAndroidTestLoop] = js.undefined
  
  /**
    * Disables performance metrics recording; may reduce test latency.
    */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disables video recording; may reduce test latency.
    */
  var disableVideoRecording: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Test setup requirements for iOS.
    */
  var iosTestSetup: js.UndefOr[SchemaIosTestSetup] = js.undefined
  
  /**
    * An iOS XCTest, via an .xctestrun file.
    */
  var iosXcTest: js.UndefOr[SchemaIosXcTest] = js.undefined
  
  /**
    * Test setup requirements for Android e.g. files to install, bootstrap
    * scripts.
    */
  var testSetup: js.UndefOr[SchemaTestSetup] = js.undefined
  
  /**
    * Max time a test execution is allowed to run before it is automatically
    * cancelled. The default value is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.undefined
}
object SchemaTestSpecification {
  
  inline def apply(): SchemaTestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSpecification]
  }
  
  extension [Self <: SchemaTestSpecification](x: Self) {
    
    inline def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    inline def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    inline def setAndroidTestLoop(value: SchemaAndroidTestLoop): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    inline def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    inline def setDisablePerformanceMetrics(value: Boolean): Self = StObject.set(x, "disablePerformanceMetrics", value.asInstanceOf[js.Any])
    
    inline def setDisablePerformanceMetricsUndefined: Self = StObject.set(x, "disablePerformanceMetrics", js.undefined)
    
    inline def setDisableVideoRecording(value: Boolean): Self = StObject.set(x, "disableVideoRecording", value.asInstanceOf[js.Any])
    
    inline def setDisableVideoRecordingUndefined: Self = StObject.set(x, "disableVideoRecording", js.undefined)
    
    inline def setIosTestSetup(value: SchemaIosTestSetup): Self = StObject.set(x, "iosTestSetup", value.asInstanceOf[js.Any])
    
    inline def setIosTestSetupUndefined: Self = StObject.set(x, "iosTestSetup", js.undefined)
    
    inline def setIosXcTest(value: SchemaIosXcTest): Self = StObject.set(x, "iosXcTest", value.asInstanceOf[js.Any])
    
    inline def setIosXcTestUndefined: Self = StObject.set(x, "iosXcTest", js.undefined)
    
    inline def setTestSetup(value: SchemaTestSetup): Self = StObject.set(x, "testSetup", value.asInstanceOf[js.Any])
    
    inline def setTestSetupUndefined: Self = StObject.set(x, "testSetup", js.undefined)
    
    inline def setTestTimeout(value: String): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
