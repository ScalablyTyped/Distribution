package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaAndroidInstrumentationTest extends StObject {
  
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.undefined
  
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.undefined
  
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
  var orchestratorOption: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The APK containing the test code to be executed.
    */
  var testApk: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The java package for the test to be executed. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var testPackageId: js.UndefOr[String] = js.undefined
  
  /**
    * The InstrumentationTestRunner class. The default value is determined by
    * examining the application&#39;s manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.undefined
  
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:  - &quot;package package_name&quot;  -
    * &quot;class package_name.class_name&quot;  - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAndroidInstrumentationTest {
  
  @scala.inline
  def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class SchemaAndroidInstrumentationTestMutableBuilder[Self <: SchemaAndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppApk(value: SchemaFileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    @scala.inline
    def setAppBundle(value: SchemaAppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    @scala.inline
    def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    @scala.inline
    def setOrchestratorOption(value: String): Self = StObject.set(x, "orchestratorOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestratorOptionUndefined: Self = StObject.set(x, "orchestratorOption", js.undefined)
    
    @scala.inline
    def setTestApk(value: SchemaFileReference): Self = StObject.set(x, "testApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestApkUndefined: Self = StObject.set(x, "testApk", js.undefined)
    
    @scala.inline
    def setTestPackageId(value: String): Self = StObject.set(x, "testPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPackageIdUndefined: Self = StObject.set(x, "testPackageId", js.undefined)
    
    @scala.inline
    def setTestRunnerClass(value: String): Self = StObject.set(x, "testRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunnerClassUndefined: Self = StObject.set(x, "testRunnerClass", js.undefined)
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value :_*))
  }
}
