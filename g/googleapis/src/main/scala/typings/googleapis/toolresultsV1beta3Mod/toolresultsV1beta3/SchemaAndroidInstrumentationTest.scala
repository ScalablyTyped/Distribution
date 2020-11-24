package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class SchemaAndroidInstrumentationTestOps[Self <: SchemaAndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
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
    def setTestPackageId(value: String): Self = this.set("testPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPackageId: Self = this.set("testPackageId", js.undefined)
    
    @scala.inline
    def setTestRunnerClass(value: String): Self = this.set("testRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunnerClass: Self = this.set("testRunnerClass", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = this.set("testTargets", js.Array(value :_*))
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = this.set("testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTargets: Self = this.set("testTargets", js.undefined)
    
    @scala.inline
    def setUseOrchestrator(value: Boolean): Self = this.set("useOrchestrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOrchestrator: Self = this.set("useOrchestrator", js.undefined)
  }
}
