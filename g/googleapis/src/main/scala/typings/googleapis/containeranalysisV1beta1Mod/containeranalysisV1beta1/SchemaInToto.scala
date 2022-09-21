package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInToto extends StObject {
  
  /**
    * This field contains the expected command used to perform the step.
    */
  var expectedCommand: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
    */
  var expectedMaterials: js.UndefOr[js.Array[SchemaArtifactRule]] = js.undefined
  
  var expectedProducts: js.UndefOr[js.Array[SchemaArtifactRule]] = js.undefined
  
  /**
    * This field contains the public keys that can be used to verify the signatures on the step metadata.
    */
  var signingKeys: js.UndefOr[js.Array[SchemaSigningKey]] = js.undefined
  
  /**
    * This field identifies the name of the step in the supply chain.
    */
  var stepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field contains a value that indicates the minimum number of keys that need to be used to sign the step's in-toto link.
    */
  var threshold: js.UndefOr[String | Null] = js.undefined
}
object SchemaInToto {
  
  inline def apply(): SchemaInToto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInToto]
  }
  
  extension [Self <: SchemaInToto](x: Self) {
    
    inline def setExpectedCommand(value: js.Array[String]): Self = StObject.set(x, "expectedCommand", value.asInstanceOf[js.Any])
    
    inline def setExpectedCommandNull: Self = StObject.set(x, "expectedCommand", null)
    
    inline def setExpectedCommandUndefined: Self = StObject.set(x, "expectedCommand", js.undefined)
    
    inline def setExpectedCommandVarargs(value: String*): Self = StObject.set(x, "expectedCommand", js.Array(value*))
    
    inline def setExpectedMaterials(value: js.Array[SchemaArtifactRule]): Self = StObject.set(x, "expectedMaterials", value.asInstanceOf[js.Any])
    
    inline def setExpectedMaterialsUndefined: Self = StObject.set(x, "expectedMaterials", js.undefined)
    
    inline def setExpectedMaterialsVarargs(value: SchemaArtifactRule*): Self = StObject.set(x, "expectedMaterials", js.Array(value*))
    
    inline def setExpectedProducts(value: js.Array[SchemaArtifactRule]): Self = StObject.set(x, "expectedProducts", value.asInstanceOf[js.Any])
    
    inline def setExpectedProductsUndefined: Self = StObject.set(x, "expectedProducts", js.undefined)
    
    inline def setExpectedProductsVarargs(value: SchemaArtifactRule*): Self = StObject.set(x, "expectedProducts", js.Array(value*))
    
    inline def setSigningKeys(value: js.Array[SchemaSigningKey]): Self = StObject.set(x, "signingKeys", value.asInstanceOf[js.Any])
    
    inline def setSigningKeysUndefined: Self = StObject.set(x, "signingKeys", js.undefined)
    
    inline def setSigningKeysVarargs(value: SchemaSigningKey*): Self = StObject.set(x, "signingKeys", js.Array(value*))
    
    inline def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameNull: Self = StObject.set(x, "stepName", null)
    
    inline def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
