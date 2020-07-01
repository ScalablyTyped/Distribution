package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle.  See  for more information on types
  * of Android tests.
  */
@js.native
trait SchemaAndroidInstrumentationTest extends js.Object {
  /**
    * The java package for the test to be executed. Required
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class. Required
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats: - &quot;package package_name&quot; - &quot;class
    * package_name.class_name&quot; - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run
    * test or not.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.native
}

object SchemaAndroidInstrumentationTest {
  @scala.inline
  def apply(
    testPackageId: String = null,
    testRunnerClass: String = null,
    testTargets: js.Array[String] = null,
    useOrchestrator: js.UndefOr[Boolean] = js.undefined
  ): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    if (testPackageId != null) __obj.updateDynamic("testPackageId")(testPackageId.asInstanceOf[js.Any])
    if (testRunnerClass != null) __obj.updateDynamic("testRunnerClass")(testRunnerClass.asInstanceOf[js.Any])
    if (testTargets != null) __obj.updateDynamic("testTargets")(testTargets.asInstanceOf[js.Any])
    if (!js.isUndefined(useOrchestrator)) __obj.updateDynamic("useOrchestrator")(useOrchestrator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
}

