package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how to run the test.
  */
@js.native
trait SchemaTestSpecification extends js.Object {
  
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
  implicit class SchemaTestSpecificationOps[Self <: SchemaTestSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = this.set("androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidInstrumentationTest: Self = this.set("androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = this.set("androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidRoboTest: Self = this.set("androidRoboTest", js.undefined)
    
    @scala.inline
    def setAndroidTestLoop(value: SchemaAndroidTestLoop): Self = this.set("androidTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTestLoop: Self = this.set("androidTestLoop", js.undefined)
    
    @scala.inline
    def setDisablePerformanceMetrics(value: Boolean): Self = this.set("disablePerformanceMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePerformanceMetrics: Self = this.set("disablePerformanceMetrics", js.undefined)
    
    @scala.inline
    def setDisableVideoRecording(value: Boolean): Self = this.set("disableVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVideoRecording: Self = this.set("disableVideoRecording", js.undefined)
    
    @scala.inline
    def setIosTestSetup(value: SchemaIosTestSetup): Self = this.set("iosTestSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosTestSetup: Self = this.set("iosTestSetup", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: SchemaIosXcTest): Self = this.set("iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosXcTest: Self = this.set("iosXcTest", js.undefined)
    
    @scala.inline
    def setTestSetup(value: SchemaTestSetup): Self = this.set("testSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSetup: Self = this.set("testSetup", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: String): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
}
