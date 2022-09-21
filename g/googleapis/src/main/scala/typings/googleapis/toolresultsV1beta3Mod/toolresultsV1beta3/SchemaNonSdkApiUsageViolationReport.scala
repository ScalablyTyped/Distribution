package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonSdkApiUsageViolationReport extends StObject {
  
  /**
    * Examples of the detected API usages.
    */
  var exampleApis: js.UndefOr[js.Array[SchemaNonSdkApi]] = js.undefined
  
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the API Level on which the application is designed to run.
    */
  var targetSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total number of unique Non-SDK API's accessed.
    */
  var uniqueApis: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNonSdkApiUsageViolationReport {
  
  inline def apply(): SchemaNonSdkApiUsageViolationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonSdkApiUsageViolationReport]
  }
  
  extension [Self <: SchemaNonSdkApiUsageViolationReport](x: Self) {
    
    inline def setExampleApis(value: js.Array[SchemaNonSdkApi]): Self = StObject.set(x, "exampleApis", value.asInstanceOf[js.Any])
    
    inline def setExampleApisUndefined: Self = StObject.set(x, "exampleApis", js.undefined)
    
    inline def setExampleApisVarargs(value: SchemaNonSdkApi*): Self = StObject.set(x, "exampleApis", js.Array(value*))
    
    inline def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSdkVersionNull: Self = StObject.set(x, "minSdkVersion", null)
    
    inline def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    inline def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetSdkVersionNull: Self = StObject.set(x, "targetSdkVersion", null)
    
    inline def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
    
    inline def setUniqueApis(value: Double): Self = StObject.set(x, "uniqueApis", value.asInstanceOf[js.Any])
    
    inline def setUniqueApisNull: Self = StObject.set(x, "uniqueApis", null)
    
    inline def setUniqueApisUndefined: Self = StObject.set(x, "uniqueApis", js.undefined)
  }
}
