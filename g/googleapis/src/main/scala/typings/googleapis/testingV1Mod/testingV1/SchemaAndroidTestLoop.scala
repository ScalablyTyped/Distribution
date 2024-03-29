package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidTestLoop extends StObject {
  
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.undefined
  
  /**
    * The java package for the application under test. The default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application's manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of scenarios that should be run during the test. The default is all test loops, derived from the application's manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaAndroidTestLoop {
  
  inline def apply(): SchemaAndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTestLoop]
  }
  
  extension [Self <: SchemaAndroidTestLoop](x: Self) {
    
    inline def setAppApk(value: SchemaFileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    inline def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    inline def setAppBundle(value: SchemaAppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    inline def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    inline def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    inline def setAppPackageIdNull: Self = StObject.set(x, "appPackageId", null)
    
    inline def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    inline def setScenarioLabels(value: js.Array[String]): Self = StObject.set(x, "scenarioLabels", value.asInstanceOf[js.Any])
    
    inline def setScenarioLabelsNull: Self = StObject.set(x, "scenarioLabels", null)
    
    inline def setScenarioLabelsUndefined: Self = StObject.set(x, "scenarioLabels", js.undefined)
    
    inline def setScenarioLabelsVarargs(value: String*): Self = StObject.set(x, "scenarioLabels", js.Array(value*))
    
    inline def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosNull: Self = StObject.set(x, "scenarios", null)
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    inline def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value*))
  }
}
