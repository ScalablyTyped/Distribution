package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysisOutputConfig extends StObject {
  
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.undefined
}
object SchemaIamPolicyAnalysisOutputConfig {
  
  inline def apply(): SchemaIamPolicyAnalysisOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysisOutputConfig]
  }
  
  extension [Self <: SchemaIamPolicyAnalysisOutputConfig](x: Self) {
    
    inline def setGcsDestination(value: SchemaGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
