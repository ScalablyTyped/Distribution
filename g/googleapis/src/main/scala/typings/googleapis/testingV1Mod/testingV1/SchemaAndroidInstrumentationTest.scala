package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle. Android instrumentation tests run an
  * application APK and test APK inside the same process on a virtual or
  * physical AndroidDevice.  They also specify a test runner class, such as
  * com.google.GoogleTestRunner, which can vary on the specific instrumentation
  * framework chosen.  See
  * &lt;http://developer.android.com/tools/testing/testing_android.html&gt; for
  * more information on types of Android tests.
  */
@js.native
trait SchemaAndroidInstrumentationTest extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.native
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The option of whether running each test within its own invocation of
    * instrumentation with Android Test Orchestrator or not. ** Orchestrator is
    * only compatible with AndroidJUnitRunner version 1.0 or higher! **
    * Orchestrator offers the following benefits:  - No shared state  - Crashes
    * are isolated  - Logs are scoped per test  See
    * &lt;https://developer.android.com/training/testing/junit-runner.html#using-android-test-orchestrator&gt;
    * for more information about Android Test Orchestrator.  If not set, the
    * test will be run without the orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.native
  /**
    * Required. The APK containing the test code to be executed.
    */
  var testApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The java package for the test to be executed. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class. The default value is determined by
    * examining the application&#39;s manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:  - &quot;package package_name&quot;  -
    * &quot;class package_name.class_name&quot;  - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidInstrumentationTest {
  @scala.inline
  def apply(
    appApk: SchemaFileReference = null,
    appBundle: SchemaAppBundle = null,
    appPackageId: String = null,
    orchestratorOption: String = null,
    testApk: SchemaFileReference = null,
    testPackageId: String = null,
    testRunnerClass: String = null,
    testTargets: js.Array[String] = null
  ): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appBundle != null) __obj.updateDynamic("appBundle")(appBundle.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (orchestratorOption != null) __obj.updateDynamic("orchestratorOption")(orchestratorOption.asInstanceOf[js.Any])
    if (testApk != null) __obj.updateDynamic("testApk")(testApk.asInstanceOf[js.Any])
    if (testPackageId != null) __obj.updateDynamic("testPackageId")(testPackageId.asInstanceOf[js.Any])
    if (testRunnerClass != null) __obj.updateDynamic("testRunnerClass")(testRunnerClass.asInstanceOf[js.Any])
    if (testTargets != null) __obj.updateDynamic("testTargets")(testTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
}

