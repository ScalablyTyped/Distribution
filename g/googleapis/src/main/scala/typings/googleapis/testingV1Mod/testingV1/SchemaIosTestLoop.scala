package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosTestLoop extends StObject {
  
  /**
    * Output only. The bundle id for the application under test.
    */
  var appBundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The .ipa of the application to test.
    */
  var appIpa: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
    */
  var scenarios: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaIosTestLoop {
  
  inline def apply(): SchemaIosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosTestLoop]
  }
  
  extension [Self <: SchemaIosTestLoop](x: Self) {
    
    inline def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
    
    inline def setAppBundleIdNull: Self = StObject.set(x, "appBundleId", null)
    
    inline def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
    
    inline def setAppIpa(value: SchemaFileReference): Self = StObject.set(x, "appIpa", value.asInstanceOf[js.Any])
    
    inline def setAppIpaUndefined: Self = StObject.set(x, "appIpa", js.undefined)
    
    inline def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosNull: Self = StObject.set(x, "scenarios", null)
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    inline def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value*))
  }
}
