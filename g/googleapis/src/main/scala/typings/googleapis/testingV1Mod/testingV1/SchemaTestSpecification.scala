package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how to run the test.
  */
@js.native
trait SchemaTestSpecification extends StObject {
  
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.native
  
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.native
  
  /**
    * An Android Application with a Test Loop.
    */
  var androidTestLoop: js.UndefOr[SchemaAndroidTestLoop] = js.native
  
  /**
    * Disables performance metrics recording; may reduce test latency.
    */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables video recording; may reduce test latency.
    */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  
  /**
    * Test setup requirements for iOS.
    */
  var iosTestSetup: js.UndefOr[SchemaIosTestSetup] = js.native
  
  /**
    * An iOS XCTest, via an .xctestrun file.
    */
  var iosXcTest: js.UndefOr[SchemaIosXcTest] = js.native
  
  /**
    * Test setup requirements for Android e.g. files to install, bootstrap
    * scripts.
    */
  var testSetup: js.UndefOr[SchemaTestSetup] = js.native
  
  /**
    * Max time a test execution is allowed to run before it is automatically
    * cancelled. The default value is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.native
}
object SchemaTestSpecification {
  
  @scala.inline
  def apply(): SchemaTestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSpecification]
  }
  
  @scala.inline
  implicit class SchemaTestSpecificationMutableBuilder[Self <: SchemaTestSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: SchemaAndroidTestLoop): Self = StObject.set(x, "androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidTestLoopUndefined: Self = StObject.set(x, "androidTestLoop", js.undefined)
    
    @scala.inline
    def setDisablePerformanceMetrics(value: Boolean): Self = StObject.set(x, "disablePerformanceMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePerformanceMetricsUndefined: Self = StObject.set(x, "disablePerformanceMetrics", js.undefined)
    
    @scala.inline
    def setDisableVideoRecording(value: Boolean): Self = StObject.set(x, "disableVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVideoRecordingUndefined: Self = StObject.set(x, "disableVideoRecording", js.undefined)
    
    @scala.inline
    def setIosTestSetup(value: SchemaIosTestSetup): Self = StObject.set(x, "iosTestSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosTestSetupUndefined: Self = StObject.set(x, "iosTestSetup", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: SchemaIosXcTest): Self = StObject.set(x, "iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosXcTestUndefined: Self = StObject.set(x, "iosXcTest", js.undefined)
    
    @scala.inline
    def setTestSetup(value: SchemaTestSetup): Self = StObject.set(x, "testSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSetupUndefined: Self = StObject.set(x, "testSetup", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: String): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
