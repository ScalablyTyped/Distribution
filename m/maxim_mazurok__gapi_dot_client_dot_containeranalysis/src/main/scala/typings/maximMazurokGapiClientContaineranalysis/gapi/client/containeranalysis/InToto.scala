package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InToto extends js.Object {
  
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
  implicit class InTotoOps[Self <: InToto] (val x: Self) extends AnyVal {
    
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
    def setExpectedCommandVarargs(value: String*): Self = this.set("expectedCommand", js.Array(value :_*))
    
    @scala.inline
    def setExpectedCommand(value: js.Array[String]): Self = this.set("expectedCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedCommand: Self = this.set("expectedCommand", js.undefined)
    
    @scala.inline
    def setExpectedMaterialsVarargs(value: ArtifactRule*): Self = this.set("expectedMaterials", js.Array(value :_*))
    
    @scala.inline
    def setExpectedMaterials(value: js.Array[ArtifactRule]): Self = this.set("expectedMaterials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedMaterials: Self = this.set("expectedMaterials", js.undefined)
    
    @scala.inline
    def setExpectedProductsVarargs(value: ArtifactRule*): Self = this.set("expectedProducts", js.Array(value :_*))
    
    @scala.inline
    def setExpectedProducts(value: js.Array[ArtifactRule]): Self = this.set("expectedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedProducts: Self = this.set("expectedProducts", js.undefined)
    
    @scala.inline
    def setSigningKeysVarargs(value: SigningKey*): Self = this.set("signingKeys", js.Array(value :_*))
    
    @scala.inline
    def setSigningKeys(value: js.Array[SigningKey]): Self = this.set("signingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningKeys: Self = this.set("signingKeys", js.undefined)
    
    @scala.inline
    def setStepName(value: String): Self = this.set("stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepName: Self = this.set("stepName", js.undefined)
    
    @scala.inline
    def setThreshold(value: String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
