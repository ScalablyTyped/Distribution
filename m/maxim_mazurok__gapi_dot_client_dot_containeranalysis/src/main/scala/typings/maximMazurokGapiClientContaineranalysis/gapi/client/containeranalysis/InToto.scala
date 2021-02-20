package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InToto extends StObject {
  
  /** This field contains the expected command used to perform the step. */
  var expectedCommand: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the
    * step.
    */
  var expectedMaterials: js.UndefOr[js.Array[ArtifactRule]] = js.native
  
  var expectedProducts: js.UndefOr[js.Array[ArtifactRule]] = js.native
  
  /** This field contains the public keys that can be used to verify the signatures on the step metadata. */
  var signingKeys: js.UndefOr[js.Array[SigningKey]] = js.native
  
  /** This field identifies the name of the step in the supply chain. */
  var stepName: js.UndefOr[String] = js.native
  
  /** This field contains a value that indicates the minimum number of keys that need to be used to sign the step's in-toto link. */
  var threshold: js.UndefOr[String] = js.native
}
object InToto {
  
  @scala.inline
  def apply(): InToto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InToto]
  }
  
  @scala.inline
  implicit class InTotoMutableBuilder[Self <: InToto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedCommand(value: js.Array[String]): Self = StObject.set(x, "expectedCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedCommandUndefined: Self = StObject.set(x, "expectedCommand", js.undefined)
    
    @scala.inline
    def setExpectedCommandVarargs(value: String*): Self = StObject.set(x, "expectedCommand", js.Array(value :_*))
    
    @scala.inline
    def setExpectedMaterials(value: js.Array[ArtifactRule]): Self = StObject.set(x, "expectedMaterials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedMaterialsUndefined: Self = StObject.set(x, "expectedMaterials", js.undefined)
    
    @scala.inline
    def setExpectedMaterialsVarargs(value: ArtifactRule*): Self = StObject.set(x, "expectedMaterials", js.Array(value :_*))
    
    @scala.inline
    def setExpectedProducts(value: js.Array[ArtifactRule]): Self = StObject.set(x, "expectedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedProductsUndefined: Self = StObject.set(x, "expectedProducts", js.undefined)
    
    @scala.inline
    def setExpectedProductsVarargs(value: ArtifactRule*): Self = StObject.set(x, "expectedProducts", js.Array(value :_*))
    
    @scala.inline
    def setSigningKeys(value: js.Array[SigningKey]): Self = StObject.set(x, "signingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeysUndefined: Self = StObject.set(x, "signingKeys", js.undefined)
    
    @scala.inline
    def setSigningKeysVarargs(value: SigningKey*): Self = StObject.set(x, "signingKeys", js.Array(value :_*))
    
    @scala.inline
    def setStepName(value: String): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    @scala.inline
    def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
