package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonSdkApiUsageViolation extends StObject {
  
  /**
    * Signatures of a subset of those hidden API's.
    */
  var apiSignatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Total number of unique hidden API's accessed.
    */
  var uniqueApis: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNonSdkApiUsageViolation {
  
  inline def apply(): SchemaNonSdkApiUsageViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonSdkApiUsageViolation]
  }
  
  extension [Self <: SchemaNonSdkApiUsageViolation](x: Self) {
    
    inline def setApiSignatures(value: js.Array[String]): Self = StObject.set(x, "apiSignatures", value.asInstanceOf[js.Any])
    
    inline def setApiSignaturesNull: Self = StObject.set(x, "apiSignatures", null)
    
    inline def setApiSignaturesUndefined: Self = StObject.set(x, "apiSignatures", js.undefined)
    
    inline def setApiSignaturesVarargs(value: String*): Self = StObject.set(x, "apiSignatures", js.Array(value*))
    
    inline def setUniqueApis(value: Double): Self = StObject.set(x, "uniqueApis", value.asInstanceOf[js.Any])
    
    inline def setUniqueApisNull: Self = StObject.set(x, "uniqueApis", null)
    
    inline def setUniqueApisUndefined: Self = StObject.set(x, "uniqueApis", js.undefined)
  }
}
