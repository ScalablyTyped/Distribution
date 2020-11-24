package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDnsKey extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var digests: js.UndefOr[js.Array[SchemaDnsKeyDigest]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var keyLength: js.UndefOr[Double] = js.native
  
  var keyTag: js.UndefOr[Double] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var publicKey: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDnsKey {
  
  @scala.inline
  def apply(): SchemaDnsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKey]
  }
  
  @scala.inline
  implicit class SchemaDnsKeyOps[Self <: SchemaDnsKey] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDigestsVarargs(value: SchemaDnsKeyDigest*): Self = this.set("digests", js.Array(value :_*))
    
    @scala.inline
    def setDigests(value: js.Array[SchemaDnsKeyDigest]): Self = this.set("digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigests: Self = this.set("digests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
    
    @scala.inline
    def setKeyTag(value: Double): Self = this.set("keyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTag: Self = this.set("keyTag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
