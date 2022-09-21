package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidInstrumentationTest extends StObject {
  
  /**
    * The java package for the test to be executed. Required
    */
  var testPackageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The InstrumentationTestRunner class. Required
    */
  var testRunnerClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class package_name.class_name#method_name" If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run test or not.
    */
  var useOrchestrator: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAndroidInstrumentationTest {
  
  inline def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  
  extension [Self <: SchemaAndroidInstrumentationTest](x: Self) {
    
    inline def setTestPackageId(value: String): Self = StObject.set(x, "testPackageId", value.asInstanceOf[js.Any])
    
    inline def setTestPackageIdNull: Self = StObject.set(x, "testPackageId", null)
    
    inline def setTestPackageIdUndefined: Self = StObject.set(x, "testPackageId", js.undefined)
    
    inline def setTestRunnerClass(value: String): Self = StObject.set(x, "testRunnerClass", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerClassNull: Self = StObject.set(x, "testRunnerClass", null)
    
    inline def setTestRunnerClassUndefined: Self = StObject.set(x, "testRunnerClass", js.undefined)
    
    inline def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsNull: Self = StObject.set(x, "testTargets", null)
    
    inline def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    inline def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value*))
    
    inline def setUseOrchestrator(value: Boolean): Self = StObject.set(x, "useOrchestrator", value.asInstanceOf[js.Any])
    
    inline def setUseOrchestratorNull: Self = StObject.set(x, "useOrchestrator", null)
    
    inline def setUseOrchestratorUndefined: Self = StObject.set(x, "useOrchestrator", js.undefined)
  }
}
