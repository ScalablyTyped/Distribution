package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    androidInstrumentationTest: SchemaAndroidInstrumentationTest = null,
    androidRoboTest: SchemaAndroidRoboTest = null,
    androidTestLoop: SchemaAndroidTestLoop = null,
    disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined,
    disableVideoRecording: js.UndefOr[Boolean] = js.undefined,
    iosTestSetup: SchemaIosTestSetup = null,
    iosXcTest: SchemaIosXcTest = null,
    testSetup: SchemaTestSetup = null,
    testTimeout: String = null
  ): SchemaTestSpecification = {
    val __obj = js.Dynamic.literal()
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest.asInstanceOf[js.Any])
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest.asInstanceOf[js.Any])
    if (androidTestLoop != null) __obj.updateDynamic("androidTestLoop")(androidTestLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePerformanceMetrics)) __obj.updateDynamic("disablePerformanceMetrics")(disablePerformanceMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVideoRecording)) __obj.updateDynamic("disableVideoRecording")(disableVideoRecording.asInstanceOf[js.Any])
    if (iosTestSetup != null) __obj.updateDynamic("iosTestSetup")(iosTestSetup.asInstanceOf[js.Any])
    if (iosXcTest != null) __obj.updateDynamic("iosXcTest")(iosXcTest.asInstanceOf[js.Any])
    if (testSetup != null) __obj.updateDynamic("testSetup")(testSetup.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestSpecification]
  }
}

