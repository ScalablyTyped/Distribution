package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle.  See  for more information on types
  * of Android tests.
  */
trait SchemaAndroidInstrumentationTest extends StObject {
  
  /**
    * The java package for the test to be executed. Required
    */
  var testPackageId: js.UndefOr[String] = js.undefined
  
  /**
    * The InstrumentationTestRunner class. Required
    */
  var testRunnerClass: js.UndefOr[String] = js.undefined
  
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats: - &quot;package package_name&quot; - &quot;class
    * package_name.class_name&quot; - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run
    * test or not.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.undefined
}
object SchemaAndroidInstrumentationTest {
  
  inline def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  
  extension [Self <: SchemaAndroidInstrumentationTest](x: Self) {
    
    inline def setTestPackageId(value: String): Self = StObject.set(x, "testPackageId", value.asInstanceOf[js.Any])
    
    inline def setTestPackageIdUndefined: Self = StObject.set(x, "testPackageId", js.undefined)
    
    inline def setTestRunnerClass(value: String): Self = StObject.set(x, "testRunnerClass", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerClassUndefined: Self = StObject.set(x, "testRunnerClass", js.undefined)
    
    inline def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    inline def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value :_*))
    
    inline def setUseOrchestrator(value: Boolean): Self = StObject.set(x, "useOrchestrator", value.asInstanceOf[js.Any])
    
    inline def setUseOrchestratorUndefined: Self = StObject.set(x, "useOrchestrator", js.undefined)
  }
}
